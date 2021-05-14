package view;

public class Cliente {

//Informações para criação do Banco com dados de Cidade e Estado
    public Long idEstado;
    public String txtNomeEstado;
    public String txtUF;
    public Long id;
    public String txtNomeCidade;
    public Long txtCEP;

    public Cliente() {
    }

    public Cliente(Long idEstado, String txtNomeEstado, String txtUF, Long id, String txtNomeCidade, Long txtCEP) {
        super();
        this.idEstado = idEstado;
        this.txtNomeEstado = txtNomeEstado;
        this.txtUF = txtUF;
        this.id = id;
        this.txtNomeCidade = txtNomeCidade;
        this.txtCEP = txtCEP;
    }

    public Cliente(String txtNomeEstado, String txtUF, String txtNomeCidade, Long txtCEP) {
        this.txtNomeEstado = txtNomeEstado;
        this.txtUF = txtUF;
        this.txtNomeCidade = txtNomeCidade;
        this.txtCEP = txtCEP;
    }

    Cliente(String estado, String uf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getTxtNomeEstado() {
        return txtNomeEstado;
    }

    public void setTxtNomeEstado(String txtNomeEstado) {
        this.txtNomeEstado = txtNomeEstado;
    }

    public String getTxtUF() {
        return txtUF;
    }

    public void setTxtUF(String txtUF) {
        this.txtUF = txtUF;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTxtNomeCidade() {
        return txtNomeCidade;
    }

    public void setTxtNomeCidade(String txtNomeCidade) {
        this.txtNomeCidade = txtNomeCidade;
    }

    public Long getTxtCEP() {
        return txtCEP;
    }

    public void setTxtCEP(Long txtCEP) {
        this.txtCEP = txtCEP;
    }
}
