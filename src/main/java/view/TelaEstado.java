package view;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaEstado extends javax.swing.JFrame {

    private final TelaEstadoController controle;

    public TelaEstado() {
        initComponents();
        controle = new TelaEstadoController(this);//Criação de variável de controle
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        lbEstado = new javax.swing.JLabel();
        lbUF = new javax.swing.JLabel();
        txtNomeEstado = new javax.swing.JTextField();
        txtUF = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Estado");

        painel.setBackground(new java.awt.Color(0, 0, 0));
        painel.setForeground(new java.awt.Color(255, 255, 255));

        lbEstado.setBackground(new java.awt.Color(0, 0, 0));
        lbEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(255, 255, 255));
        lbEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEstado.setText("Nome do Estado");

        lbUF.setBackground(new java.awt.Color(0, 0, 0));
        lbUF.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbUF.setForeground(new java.awt.Color(255, 255, 255));
        lbUF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUF.setText("UF");

        txtNomeEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtNomeEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtNomeEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeEstado.setBorder(null);

        txtUF.setBackground(new java.awt.Color(255, 255, 255));
        txtUF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUF.setForeground(new java.awt.Color(0, 0, 0));
        txtUF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUF.setBorder(null);

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
                                .addGap(140, 140, 140)
                                .addComponent(lbUF))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(txtNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUF)
                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

//Botão Registar
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        controle.save();
    }//GEN-LAST:event_btCadastrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaEstado().setVisible(true);
            }
        });
    }

    public JLabel getLbEstado() {
        return lbEstado;
    }

    public void setLbEstado(JLabel lbEstado) {
        this.lbEstado = lbEstado;
    }

    public JTextField getTxtNomeEstado() {
        return txtNomeEstado;
    }

    public void setTxtNomeEstado(JTextField txtNomeEstado) {
        this.txtNomeEstado = txtNomeEstado;
    }

    public JTextField getTxtUF() {
        return txtUF;
    }

    public void setTxtUF(JTextField txtUF) {
        this.txtUF = txtUF;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbUF;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField txtNomeEstado;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
