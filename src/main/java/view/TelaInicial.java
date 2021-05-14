package view;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        lbBemVindo = new javax.swing.JLabel();
        btEstado = new javax.swing.JButton();
        btCidade = new javax.swing.JButton();
        lbOpcaoCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela inicial");

        painel.setBackground(new java.awt.Color(0, 0, 0));

        lbBemVindo.setBackground(new java.awt.Color(0, 0, 0));
        lbBemVindo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbBemVindo.setForeground(new java.awt.Color(255, 255, 255));
        lbBemVindo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBemVindo.setText("Seja Bem-vindo");

        btEstado.setBackground(new java.awt.Color(102, 102, 102));
        btEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btEstado.setForeground(new java.awt.Color(255, 255, 255));
        btEstado.setText("Estado");
        btEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btEstado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEstadoActionPerformed(evt);
            }
        });

        btCidade.setBackground(new java.awt.Color(102, 102, 102));
        btCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btCidade.setForeground(new java.awt.Color(255, 255, 255));
        btCidade.setText("Cidade");
        btCidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCidadeActionPerformed(evt);
            }
        });

        lbOpcaoCadastro.setBackground(new java.awt.Color(0, 0, 0));
        lbOpcaoCadastro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbOpcaoCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lbOpcaoCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbOpcaoCadastro.setText("Selecione uma opção para realizar o cadastro");

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addComponent(lbBemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(btEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbOpcaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(lbOpcaoCadastro)
                .addGap(30, 30, 30)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCidade)
                    .addComponent(btEstado))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Botão Cidade
    private void btCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCidadeActionPerformed
        TelaCidade telaCadCidade = new TelaCidade();
        telaCadCidade.setVisible(true);
    }//GEN-LAST:event_btCidadeActionPerformed

//Botão Estado
    private void btEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEstadoActionPerformed
        TelaEstado telaCadEstado = new TelaEstado();
        telaCadEstado.setVisible(true);
    }//GEN-LAST:event_btEstadoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCidade;
    private javax.swing.JButton btEstado;
    private javax.swing.JLabel lbBemVindo;
    private javax.swing.JLabel lbOpcaoCadastro;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
