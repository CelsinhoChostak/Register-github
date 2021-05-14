package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import view.Cliente;

public class Usuario2 {

    private final Connection connection;

    public Usuario2(Connection connection) {
        this.connection = connection;
    }

//Dados TelaCidade
    public void insert(Cliente usuario2) throws SQLException {
        String sql = "insert into CADASTROS(CIDADE, CEP) values ('" + usuario2.getTxtNomeCidade() + "', '" + usuario2.getTxtCEP() + "');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
}
