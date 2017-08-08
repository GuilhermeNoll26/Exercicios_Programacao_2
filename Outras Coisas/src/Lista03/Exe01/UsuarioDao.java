package Lista03.Exe01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 */
public class UsuarioDao {
    
    public void Criar(Usuario u){
        Connection c = ConexaoBancoDados.criarConexao();
        PreparedStatement ps = null;
        try{
            ps = c.prepareStatement("insert into usuario values (default, ?, ?, ?, ?, ?);");
            
            ps.setString(1, u.getNome());
            ps.setString(2, u.getCPF());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getLogin());
            ps.setString(5, u.getSenha());
            
            ps.executeUpdate();
        }catch (SQLException ex){
            System.out.println("Erro ao salvar usuário em banco de dados: " + ex);
        }finally{
            ConexaoBancoDados.fechaConexao(c, ps);
        }
    }
    
    public ArrayList<Usuario> lerTodos(){
        ArrayList<Usuario> listaUsuario = new ArrayList<>();
        Connection con = ConexaoBancoDados.criarConexao();
        PreparedStatement ps= null;
        ResultSet rs = null;
        
        try {
            ps = con.prepareStatement("select * from usuario;");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                Usuario u = new Usuario();
                
                u.setId(rs.getInt("id"));
                u.setNome(rs.getString("nome"));
                u.setCPF(rs.getString("cpf"));
                u.setEmail(rs.getString("email"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                
                listaUsuario.add(u);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler usuários." + ex);
        }finally{
            ConexaoBancoDados.fechaConexao(con, ps, rs);
        }
        
        return listaUsuario;
    }
    
    public void deletar(int idUsuario){
        Connection con = ConexaoBancoDados.criarConexao();
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement("delete from usuario where id = ?;");
            
            ps.setInt(1, idUsuario);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluír usuário: " + ex);
        }finally{
            ConexaoBancoDados.fechaConexao(con, ps);
        }
    }
    
    public void alterar(int idUsuario, Usuario u){
        Connection con = ConexaoBancoDados.criarConexao();
        PreparedStatement ps = null;
        
        try {
            ps = con.prepareStatement("update usuario "
                    + "set nome = ?, cpf = ?, email = ?, login = ?, senha = ?"
                    + "where id = ?;");
            
            ps.setString(1, u.getNome());
            ps.setString(2, u.getCPF());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getLogin());
            ps.setString(5, u.getSenha());
            ps.setInt(6, idUsuario);
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atulaizar usuário no banco de dados: " + ex);
        }finally{
            ConexaoBancoDados.fechaConexao(con, ps);
        }
    }
}
