package view;

import dao.Conexao;
import dao.InserirCidadeBD;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCidadeController {

    private final TelaCidade view;

    public TelaCidadeController(TelaCidade view) {
        this.view = view;
    }

    public void save() { //Função para salvar dados
        String estado = view.getTxtNomeCidade().getText();
        String uf = view.getTxtCEP().getText();

        Model user = new Model(estado, uf);

        try {
            Connection conexao = new Conexao().getConnection();
            InserirCidadeBD users = new InserirCidadeBD(conexao);
            users.insert(user);

            JOptionPane.showMessageDialog(null, "Registro realizado com sucesso!");
        } catch (SQLException ex) {
        }
    }
}
