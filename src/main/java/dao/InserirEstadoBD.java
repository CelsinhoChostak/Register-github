package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import view.Model;

public class InserirEstadoBD {

    private final Connection connection;

    public InserirEstadoBD(Connection connection) {
        this.connection = connection;
    }

//Dados TelaEstado
    public void insert(Model usuario) throws SQLException {
        String sql = "insert into estado(estado, uf) values ('" + usuario.getTxtNomeEstado() + "', '" + usuario.getTxtUF() + "');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
}
