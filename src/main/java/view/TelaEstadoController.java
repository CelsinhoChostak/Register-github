package view;

import dao.Conexao;
import dao.Usuario;
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

        Cliente user = new Cliente(estado, uf);

        try {
            Connection conexao = new Conexao().getConnection();
            Usuario users = new Usuario(conexao);
            users.insert(user);

            JOptionPane.showMessageDialog(null, "Registro realizado com sucesso!");
        } catch (SQLException ex) {
        }
    }
}
