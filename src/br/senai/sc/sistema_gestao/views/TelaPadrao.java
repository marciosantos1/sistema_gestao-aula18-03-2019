/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sistema_gestao.views;

/**
 *
 * @author Aluno
 */
public class TelaPadrao extends javax.swing.JPanel {

    /**
     * Creates new form TelaPadrao
     */
    public TelaPadrao() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menusistemaGestao = new javax.swing.JLabel();
        subMenuColaboradorEquipe = new javax.swing.JLabel();
        imagem = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        cpLogin = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        cpSenha = new javax.swing.JTextField();
        botaoEntrar = new javax.swing.JButton();

        menusistemaGestao.setFont(new java.awt.Font("Vineta BT", 1, 36)); // NOI18N
        menusistemaGestao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menusistemaGestao.setText("SISTEMA DE GESTÃO");

        subMenuColaboradorEquipe.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        subMenuColaboradorEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subMenuColaboradorEquipe.setText("Colaborador/Equipe");

        imagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sc/gestao_equipe/img/images.jpg"))); // NOI18N

        login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        login.setText("login");

        senha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        senha.setText("senha");

        botaoEntrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoEntrar.setText("ENTRAR");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menusistemaGestao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(subMenuColaboradorEquipe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagem)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(login)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(senha)
                                .addGap(18, 18, 18)
                                .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(botaoEntrar)))
                .addContainerGap(673, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menusistemaGestao)
                .addGap(18, 18, 18)
                .addComponent(subMenuColaboradorEquipe)
                .addGap(38, 38, 38)
                .addComponent(imagem)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(cpLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoEntrar)
                .addContainerGap(425, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JTextField cpLogin;
    private javax.swing.JTextField cpSenha;
    private javax.swing.JLabel imagem;
    private javax.swing.JLabel login;
    private javax.swing.JLabel menusistemaGestao;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel subMenuColaboradorEquipe;
    // End of variables declaration//GEN-END:variables
}
