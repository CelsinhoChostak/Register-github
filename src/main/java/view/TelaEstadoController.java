package view;

import dao.Conexao;
import dao.InserirEstadoBD;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaEstadoController {

    private final TelaEstado view;

    public TelaEstadoController(TelaEstado view) {
        this.view = view;
    }

    public void save() { //Função para salvar dados
        String estado = view.getTxtNomeEstado().getText();
        String uf = view.getTxtUF().getText();

        Model user = new Model(estado, uf);

        try {
            Connection conexao = new Conexao().getConnection();
            InserirEstadoBD users = new InserirEstadoBD(conexao);
            users.insert(user);

            JOptionPane.showMessageDialog(null, "Registro realizado com sucesso!");
        } catch (SQLException ex) {
        }
    }
}
