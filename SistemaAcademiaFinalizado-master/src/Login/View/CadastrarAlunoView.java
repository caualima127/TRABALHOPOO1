/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login.View;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Teles
 */
public class CadastrarAlunoView extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalView
     */
    public CadastrarAlunoView() {
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

        jLabelCadastroAluno = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelGenero = new javax.swing.JLabel();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelNomeCompleto = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jLabelRua = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldTelefone1 = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelData1 = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jLabelImagemFundoTela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCadastroAluno.setFont(new java.awt.Font("Arial", 0, 35)); // NOI18N
        jLabelCadastroAluno.setText("Cadastro Aluno");
        getContentPane().add(jLabelCadastroAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jButtonVoltar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonVoltar.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 150, 50));

        jButtonCancelar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 720, 150, 50));

        jLabelGenero.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelGenero.setText("Gênero");
        getContentPane().add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, -1));
        getContentPane().add(jTextFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 240, 30));

        jLabelEmail.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelEmail.setText("E-mail");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 100, -1));
        getContentPane().add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 280, 30));

        jLabelCpf.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelCpf.setText("CPF");
        getContentPane().add(jLabelCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 60, -1));

        jLabelNomeCompleto.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelNomeCompleto.setText("Nome Completo");
        getContentPane().add(jLabelNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, -1));
        getContentPane().add(jTextFieldNomeCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 560, 30));

        jLabelRua.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelRua.setText("Rua");
        getContentPane().add(jLabelRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 50, -1));

        jTextFieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRuaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 560, 30));

        jLabelBairro.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelBairro.setText("Bairro");
        getContentPane().add(jLabelBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 70, -1));
        getContentPane().add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 560, 30));

        jLabelCidade.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelCidade.setText("Cidade");
        getContentPane().add(jLabelCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 80, -1));
        getContentPane().add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 280, 30));
        getContentPane().add(jTextFieldTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 100, 30));

        jLabelTelefone.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelTelefone.setText("Telefone");
        getContentPane().add(jLabelTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 100, -1));
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 280, 30));

        jLabelData1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jLabelData1.setText("Data de inicio");
        getContentPane().add(jLabelData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 160, -1));

        jComboBoxGenero.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));
        getContentPane().add(jComboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, -1));

        jButtonSalvar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonSalvar.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 720, 150, 50));

        jLabelImagemFundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/abstract-silhouette-bodybuilder-gym-logo-white-background-bodybuilder-training-vector-illustration-abstract-silhouette-139642649.jpg"))); // NOI18N
        getContentPane().add(jLabelImagemFundoTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        MenuPrincipalView telaMenuPrincipal = new MenuPrincipalView();
        telaMenuPrincipal.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        JOptionPane.showMessageDialog(null,"Operação cancelada!");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        JOptionPane.showMessageDialog(null,"Novo Aluno cadastrado com sucesso!");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRuaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastrarAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAlunoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCadastroAluno;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelData1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelImagemFundoTela;
    private javax.swing.JLabel jLabelNomeCompleto;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTelefone1;
    // End of variables declaration//GEN-END:variables
}
