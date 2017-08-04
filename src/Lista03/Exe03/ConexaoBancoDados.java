package Lista03.Exe03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class ConexaoBancoDados {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Farah";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";
    
    public static Connection criarConexao() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao criar conexão com o banco de dados: ", ex);
        }
    }
    
    public static void fechaConexao(Connection con){
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar conexão com o banco de dados");
            }
        }
    }
    
    public static void fechaConexao(Connection con, PreparedStatement ps){
        fechaConexao(con);
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar PreparedStatment com banco de dados.");
            }
        }
    }
    
    public static void fechaConexao(Connection con, PreparedStatement ps, ResultSet rs){
        fechaConexao(con, ps);
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar ResultSet com banco de dados");
            }
        }
    }
}
