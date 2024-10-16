
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author enzo.gpelizaro
 */
public class ListarUsuarios extends javax.swing.JFrame {

    static String nomeTabela, senhaTabela, cargoTabela;
    static PreparedStatement st;
    static ResultSet rs;
    static DefaultTableModel modefi;
    Connection conexao = BDconect.conectar();
    
    public ListarUsuarios() {
        initComponents();
        listarUsuarios();
    }
    
    private void listarUsuarios(){
        try{
            st = conexao.prepareStatement("SELECT * FROM usuários;");
            rs = st.executeQuery();
            DefaultTableModel tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            while (rs.next()){
                String linha[] = {
                    nomeTabela = rs.getString("Usuario"),
                    senhaTabela = rs.getString("Senha"),
                    cargoTabela = rs.getString("cargo")
                };
                tblModelo.addRow(linha);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte. Erro: "+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        cmBoxCargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Senha", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(66, 90, 620, 406);

        cmBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Gerente", "Administrador", "Estagiário", "Vendedor" }));
        cmBoxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBoxCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmBoxCargo);
        cmBoxCargo.setBounds(450, 50, 230, 30);

        jLabel1.setText("Usuário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 50, 60, 16);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(130, 50, 200, 30);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(350, 50, 79, 27);

        setSize(new java.awt.Dimension(910, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmBoxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBoxCargoActionPerformed
        String c;
        c = cmBoxCargo.getSelectedItem().toString();
        if (c.equals("Todos")){
            listarUsuarios();
            return;
        }
        try{
            st = conexao.prepareStatement("SELECT * FROM usuários WHERE cargo = ?;");
            st.setString(1, c);
            rs = st.executeQuery();
            DefaultTableModel tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            while (rs.next()){
                String linha[] = {
                    nomeTabela = rs.getString("Usuario"),
                    senhaTabela = rs.getString("Senha"),
                    cargoTabela = rs.getString("cargo")
                };
                tblModelo.addRow(linha);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte. Erro: "+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmBoxCargoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String u = txtUsuario.getText();
        try{
            st = conexao.prepareStatement("SELECT * FROM usuários WHERE usuario = ?;");
            st.setString(1, u);
            rs = st.executeQuery();
            DefaultTableModel tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            while (rs.next()){
                String linha[] = {
                    nomeTabela = rs.getString("Usuario"),
                    senhaTabela = rs.getString("Senha"),
                    cargoTabela = rs.getString("cargo")
                };
                tblModelo.addRow(linha);
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte. Erro: "+ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmBoxCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
