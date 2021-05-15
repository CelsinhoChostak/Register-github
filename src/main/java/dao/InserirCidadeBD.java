package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import view.Model;

public class InserirCidadeBD {

    private final Connection connection;

    public InserirCidadeBD(Connection connection) {
        this.connection = connection;
    }

//Dados TelaCidade
    public void insert(Model usuario2) throws SQLException {
        String sql = "insert into cidade(nomeCidade, cep) values ('" + usuario2.getTxtNomeCidade() + "', '" + usuario2.getTxtCEP() + "');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
}
