package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import view.Cliente;

public class Usuario {

    private final Connection connection;

    public Usuario(Connection connection) {
        this.connection = connection;
    }

//Dados TelaEstado
    public void insert(Cliente usuario) throws SQLException {
        String sql = "insert into CADASTROSE(ESTADO, UF) values ('" + usuario.getTxtNomeEstado() + "', '" + usuario.getTxtUF() + "');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
}
