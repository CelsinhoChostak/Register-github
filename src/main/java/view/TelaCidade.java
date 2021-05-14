package view;

import javax.swing.JTextField;

public class TelaCidade extends javax.swing.JFrame {

    private final TelaCidadeController control;

    public TelaCidade() {
        initComponents();
        control = new TelaCidadeController(this);//Criação de variável de controle
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        lbCidade = new javax.swing.JLabel();
        lbCEP = new javax.swing.JLabel();
        txtNomeCidade = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Cidade");

        painel.setBackground(new java.awt.Color(0, 0, 0));

        lbCidade.setBackground(new java.awt.Color(0, 0, 0));
        lbCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(255, 255, 255));
        lbCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCidade.setText("Nome da Cidade");

        lbCEP.setBackground(new java.awt.Color(0, 0, 0));
        lbCEP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbCEP.setForeground(new java.awt.Color(255, 255, 255));
        lbCEP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCEP.setText("CEP");

        txtNomeCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomeCidade.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeCidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeCidade.setBorder(null);

        txtCEP.setBackground(new java.awt.Color(255, 255, 255));
        txtCEP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCEP.setForeground(new java.awt.Color(0, 0, 0));
        txtCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCEP.setBorder(null);

        btCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        btCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btCadastrar.setText("Cadastrar");
        btCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(102, 102, 102));
        btVoltar.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btVoltar.setText("Voltar");
        btVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(txtNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botão Voltar
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaInicial telaPrincipal = new TelaInicial();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

//Botão Registrar
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        control.save();
    }//GEN-LAST:event_btCadastrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCidade().setVisible(true);
            }
        });
    }

    public JTextField getTxtCEP() {
        return txtCEP;
    }

    public void setTxtCEP(JTextField txtCEP) {
        this.txtCEP = txtCEP;
    }

    public JTextField getTxtNomeCidade() {
        return txtNomeCidade;
    }

    public void setTxtNomeCidade(JTextField txtNomeCidade) {
        this.txtNomeCidade = txtNomeCidade;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel lbCEP;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtNomeCidade;
    // End of variables declaration//GEN-END:variables
}
