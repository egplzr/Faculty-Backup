package telas;


import dao.EmpresaDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author guilherme.msoares7
 */
public class AlterarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form AlterarUsuarios
     */
    public AlterarUsuarios() {
        initComponents();
    }

    public AlterarUsuarios(String usu, String sen, String car) {
        initComponents();
        // CARREGA OS DADOS RECEBIDOS NOS CAMPOS DA TELA
        txtUsuario.setText(usu);
        txtSenha.setText(sen);
        cmbCargo.setSelectedItem(car);

        //não deixar alterar usuario
        txtUsuario.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        btnSalvarAlteracoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alteração de Usuários");
        getContentPane().setLayout(null);

        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(60, 110, 190, 20);

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(60, 170, 110, 50);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(110, 110, 210, 30);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(110, 180, 210, 30);

        lblCargo.setText("Cargos");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(60, 250, 160, 16);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Estágiario", "Vendedor", "Consultor" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(110, 240, 210, 30);

        btnSalvarAlteracoes.setText("Alterar");
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracoes);
        btnSalvarAlteracoes.setBounds(120, 360, 160, 50);

        setSize(new java.awt.Dimension(903, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        // 1- pegar os dados
        String u, s, c;
        u = txtUsuario.getText();
        s = txtSenha.getText();
        c = cmbCargo.getSelectedItem().toString();

        try {
            new EmpresaDao().alterarUsuario(u, s, c);
            dispose();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
