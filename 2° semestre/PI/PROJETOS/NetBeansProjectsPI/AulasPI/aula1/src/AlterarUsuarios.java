
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author enzo.gpelizaro
 */
public class AlterarUsuarios extends javax.swing.JFrame {
static Connection cn = BDconect.conectar();
    /**
     * Creates new form AlterarUsuarios
     */
    public AlterarUsuarios() {
        initComponents();
    }
    
    public AlterarUsuarios(String usu, String sen, String car) {
        initComponents();
        txtUser.setText(usu);
        txtSenha.setText(sen);
        cmBoxCargo3.setSelectedItem(car);
        txtUser.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmBoxCargo3 = new javax.swing.JComboBox<>();
        txtUser = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alteração de Usuário");
        getContentPane().setLayout(null);

        cmBoxCargo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Administrador", "Estagiário", "Vendedor" }));
        cmBoxCargo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBoxCargo3ActionPerformed(evt);
            }
        });
        getContentPane().add(cmBoxCargo3);
        cmBoxCargo3.setBounds(170, 210, 240, 50);
        getContentPane().add(txtUser);
        txtUser.setBounds(170, 50, 240, 50);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(170, 130, 240, 50);

        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 140, 50);

        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 150, 50);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(170, 280, 240, 40);

        setSize(new java.awt.Dimension(508, 352));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmBoxCargo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBoxCargo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmBoxCargo3ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
    String u, s, c;
        u = txtUser.getText();
        s = txtSenha.getText();
        c = cmBoxCargo3.getSelectedItem().toString();
        PreparedStatement st;
    try {
        st = cn.prepareStatement("UPDATE usuários SET senha = ?, cargo = ? WHERE usuario = ?");
        st.setString(1, s);
        st.setString(2, c);
        st.setString(3, u);
        st.executeUpdate();         
        JOptionPane.showMessageDialog(null, "Usuário alterado");
        dispose();
    } catch (SQLException ex) {
        Logger.getLogger(AlterarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmBoxCargo3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
