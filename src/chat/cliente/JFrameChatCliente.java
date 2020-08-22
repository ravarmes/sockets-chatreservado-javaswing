package chat.cliente;

import chat.objeto.Mensagem;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrameChatCliente extends javax.swing.JFrame {

    private Socket socket;
    private String remetente;

    public JFrameChatCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldMensagem = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jPanelConexao = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelIPServidor = new javax.swing.JLabel();
        jTextFieldIPServidor = new javax.swing.JTextField();
        jLabelPorta = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaHistorico = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListUsuarios = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat utilizando Sockets");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Histórico");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Mensagem");

        jTextFieldMensagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jTextFieldMensagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMensagemKeyPressed(evt);
            }
        });

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        jButtonEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEnviarKeyPressed(evt);
            }
        });

        jPanelConexao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSair.setText("Sair");
        jButtonSair.setMaximumSize(new java.awt.Dimension(63, 23));
        jButtonSair.setMinimumSize(new java.awt.Dimension(63, 23));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Conexão");

        jLabelIPServidor.setText("IP Servidor");

        jTextFieldIPServidor.setText("127.0.0.1");
        jTextFieldIPServidor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        jLabelPorta.setText("Porta");

        jTextFieldPorta.setText("54321");
        jTextFieldPorta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        jLabelNome.setText("Nome");

        jTextFieldNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConexaoLayout = new javax.swing.GroupLayout(jPanelConexao);
        jPanelConexao.setLayout(jPanelConexaoLayout);
        jPanelConexaoLayout.setHorizontalGroup(
            jPanelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConexaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIPServidor)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldIPServidor)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConexaoLayout.createSequentialGroup()
                        .addComponent(jLabelPorta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPorta))
                    .addGroup(jPanelConexaoLayout.createSequentialGroup()
                        .addComponent(jButtonConectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanelConexaoLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelConexaoLayout.setVerticalGroup(
            jPanelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConexaoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIPServidor)
                    .addComponent(jTextFieldIPServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPorta)
                    .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelConexaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConectar)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextAreaHistorico.setEditable(false);
        jTextAreaHistorico.setColumns(20);
        jTextAreaHistorico.setLineWrap(true);
        jTextAreaHistorico.setRows(5);
        jTextAreaHistorico.setWrapStyleWord(true);
        jTextAreaHistorico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jScrollPane1.setViewportView(jTextAreaHistorico);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jListUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jListUsuarios.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListUsuarios);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Usuários");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 50, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(46, 46, 46)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEnviar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                .addComponent(jTextFieldMensagem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelConexao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEnviar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        try {
            Mensagem mensagem = new Mensagem();
            mensagem.setRemetente(this.remetente);
            mensagem.setTexto("Saiu do Chat!");
            mensagem.setAction(Mensagem.Action.DISCONNECT);

            //Saída de Dados do Cliente
            ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
            saida.writeObject(mensagem); //Enviando mensagem para Servidor

        } catch (IOException ex) {
            Logger.getLogger(JFrameChatCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        this.remetente = jTextFieldNome.getText();

        try {
            //Conectando ao Servidor do Chat
            socket = new Socket(jTextFieldIPServidor.getText(), Integer.valueOf(jTextFieldPorta.getText()));
            ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());

            //Enviando a primeira mensagem informando conexão (apenas para passar o nome do cliente)
            Mensagem mensagem = new Mensagem();
            mensagem.setRemetente(remetente);
            mensagem.setTexto("Entrou no Chat!");
            mensagem.setAction(Mensagem.Action.CONNECT);

            //Instanciando uma ThreadCliente para ficar recebendo mensagens do Servidor
            ThreadCliente thread = new ThreadCliente(remetente, socket, jTextAreaHistorico, jListUsuarios);
            thread.start();

            //Saída de Dados do Cliente
            saida.writeObject(mensagem); //Enviando mensagem para Servidor

        } catch (IOException ex) {
            Logger.getLogger(JFrameChatCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        desabilitarTextFields();

    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButtonEnviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEnviarKeyPressed

    }//GEN-LAST:event_jButtonEnviarKeyPressed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        try {
            Mensagem mensagem = new Mensagem();
            mensagem.setRemetente(this.remetente);
            mensagem.setTexto(this.jTextFieldMensagem.getText());
            mensagem.setAction(Mensagem.Action.SEND);

            //Caso tenha selecionado algum usuário
            if (!jListUsuarios.isSelectionEmpty()) {
                mensagem.setAction(Mensagem.Action.SEND_ONE);
                mensagem.setDestinatario(jListUsuarios.getSelectedValue());
            }

            //Saída de Dados do Cliente
            ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
            saida.writeObject(mensagem); //Enviando mensagem para Servidor

            this.jTextFieldMensagem.setText("");
            this.jListUsuarios.clearSelection();

        } catch (IOException ex) {
            Logger.getLogger(JFrameChatCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jTextFieldMensagemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMensagemKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                Mensagem mensagem = new Mensagem();
                mensagem.setRemetente(this.remetente);
                mensagem.setTexto(this.jTextFieldMensagem.getText());
                mensagem.setAction(Mensagem.Action.SEND);

                //Caso tenha selecionado algum usuário
                if (!jListUsuarios.isSelectionEmpty()) {
                    mensagem.setAction(Mensagem.Action.SEND_ONE);
                    mensagem.setDestinatario(jListUsuarios.getSelectedValue());
                }

                //Saída de Dados do Cliente
                ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
                saida.writeObject(mensagem); //Enviando mensagem para Servidor

                this.jTextFieldMensagem.setText("");
                this.jListUsuarios.clearSelection();

            } catch (IOException ex) {
                Logger.getLogger(JFrameChatCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTextFieldMensagemKeyPressed

    public void desabilitarTextFields() {
        //Desabilitando alguns TextField após conexão
        this.jTextFieldIPServidor.setEditable(false);
        this.jTextFieldNome.setEditable(false);
        this.jTextFieldPorta.setEditable(false);

        this.jTextFieldIPServidor.setBackground(new java.awt.Color(204, 204, 255));
        this.jTextFieldNome.setBackground(new java.awt.Color(204, 204, 255));
        this.jTextFieldPorta.setBackground(new java.awt.Color(204, 204, 255));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameChatCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameChatCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameChatCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameChatCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameChatCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelIPServidor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPorta;
    private javax.swing.JList<String> jListUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConexao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaHistorico;
    private javax.swing.JTextField jTextFieldIPServidor;
    private javax.swing.JTextField jTextFieldMensagem;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPorta;
    // End of variables declaration//GEN-END:variables
}
