package Lista03.Exe01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */
public class ConexaoBancoDados {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Farah";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";
    
    public static Connection criarConexao(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro ao conectar ao banco de dados: ", ex);
        }
    }
    
    public static void fechaConexao(Connection con){
        try{
            if(con != null){
                con.close();
            }
        }catch (SQLException ex){
            throw new RuntimeException("Erro ao fechar conexão com o banco de dados");
        }
    }
    
    public static void fechaConexao(Connection c, PreparedStatement ps){
        fechaConexao(c);
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar PreparedStatment com banco de dados.");
        }
    }
    
    public static void fechaConexao(Connection c, PreparedStatement ps, ResultSet rs){
        fechaConexao(c, ps);
        try {
            if (ps != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar ResultSet com banco de dados");
        }
    }
}
