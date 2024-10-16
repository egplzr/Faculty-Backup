package telas;

import dao.EmpresaDao;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author guilherme.msoares7
 */
public class ListarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form ListarUsuarios
     */
    public ListarUsuarios() {
        initComponents();
        listarUsuarios();
    }
    
    private void listarUsuarios(){
        //1 - conexão com o BD
        try{
            ResultSet usuarios = new EmpresaDao().listarUsuarios();
            DefaultTableModel tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0); //limpa a tabela, zera as linhas da tabela
            //passa linha por linha ate o final da tabela
            while(usuarios.next()){
                String linha[] = {
                usuarios.getString("usuario"),
                usuarios.getString("senha"),
                usuarios.getString("cargo")
            };
            tblModelo.addRow(linha);
                
            }
        }catch (ClassNotFoundException | SQLException ex){
             JOptionPane.showMessageDialog(null,"Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblCargo = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem de Usuários");
        getContentPane().setLayout(null);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Senha", "Cargo"
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
        jScrollPane1.setBounds(30, 110, 700, 310);

        lblCargo.setText("Cargos");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(10, 70, 160, 20);

        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Administrador", "Gerente", "Estágiario", "Vendedor", "Consultor" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(60, 60, 210, 30);

        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 70, 50, 16);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(390, 60, 150, 30);

        btnBuscar.setText("Filtrar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(570, 60, 90, 30);

        setSize(new java.awt.Dimension(753, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
       //0 - obter o cargo para filtragem
       String c;
       c = cmbCargo.getSelectedItem().toString();
       if(c.equals("Todos")){
           listarUsuarios();
           return;
       }
       //1 - conexão com o BD
        try{
            ResultSet usuarios = new EmpresaDao().listarUsuariosCargo(c);
            DefaultTableModel tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0); //limpa a tabela, zera as linhas da tabela
            //passa linha por linha ate o final da tabela
            while(usuarios.next()){
                String linha[] = {
                usuarios.getString("usuario"),
                usuarios.getString("senha"),
                usuarios.getString("cargo")
            };
            tblModelo.addRow(linha);
                
            }
        }catch (ClassNotFoundException | SQLException ex){
             JOptionPane.showMessageDialog(null,"Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }  
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      //0 - obter o cargo para filtragem
       String u;
       u = txtUsuario.getText();
       //1 - conexão com o BD
        try{
            ResultSet usuarios = new EmpresaDao().buscarUsuario(u);
            DefaultTableModel tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0); //limpa a tabela, zera as linhas da tabela
            //passa linha por linha ate o final da tabela
            while(usuarios.next()){
                String linha[] = {
                usuarios.getString("usuario"),
                usuarios.getString("senha"),
                usuarios.getString("cargo")
            };
            tblModelo.addRow(linha);
                
            }
        }catch (ClassNotFoundException | SQLException ex){
             JOptionPane.showMessageDialog(null,"Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }  
    }//GEN-LAST:event_btnBuscarActionPerformed

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
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
