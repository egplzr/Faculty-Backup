/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author enzo.gpelizaro
 */
public class AlterarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public AlterarUsuario() {
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

        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        textSenha = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        comboBoxCargo = new javax.swing.JComboBox<>();
        buttonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(130, 70, 190, 20);

        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(130, 130, 110, 50);
        getContentPane().add(textUsuario);
        textUsuario.setBounds(180, 70, 210, 30);

        textSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(textSenha);
        textSenha.setBounds(180, 140, 210, 30);

        lblCargo.setText("Cargos");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(130, 220, 160, 16);

        comboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Estágiario", "Vendedor", "Consultor" }));
        getContentPane().add(comboBoxCargo);
        comboBoxCargo.setBounds(180, 210, 210, 30);

        buttonAlterar.setText("Alterar");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAlterar);
        buttonAlterar.setBounds(190, 320, 160, 50);

        setSize(new java.awt.Dimension(571, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSenhaActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        // 1- pegar os dados
        String u, s, c;
        u = textUsuario.getText();
        s = textSenha.getText();
        c = comboBoxCargo.getSelectedItem().toString();

        try {
            // 2- Conectar ao banco de dados empresa
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresagui", "root", "");
            //3 - PEGAR OS DADOS ALTERADOS E DEVOLVER PRA TABELA
            PreparedStatement st = conectar.prepareStatement("UPDATE usuarios SET senha = ? , cargo = ? WHERE usuario = ?");
            st.setString(1, s);
            st.setString(2, c);
            st.setString(3, u);
            st.executeUpdate(); // executa a operação e guarda o retorno dela para fazer o if
            dispose();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }
    }//GEN-LAST:event_buttonAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JComboBox<String> comboBoxCargo;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField textSenha;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
