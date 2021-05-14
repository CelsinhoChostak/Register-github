package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Conexão Banco de dados
public class Conexao {

    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        return conexao;
    }
}
