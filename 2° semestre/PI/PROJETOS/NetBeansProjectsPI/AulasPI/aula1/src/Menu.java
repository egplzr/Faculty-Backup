
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author enzo.gpelizaro
 */
public class Menu extends javax.swing.JFrame {

    static Connection c = BDconect.conectar();

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamentos = new javax.swing.JMenuItem();
        itmAlterarDepartamentos = new javax.swing.JMenuItem();
        itmExcluirDepartamentos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmListarDepartamentos = new javax.swing.JMenuItem();
        itmBuscarDepartamentos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itmSair = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itmListarFuncionarios = new javax.swing.JMenuItem();
        itmBuscarFuncionarios = new javax.swing.JMenuItem();
        mnuUsuários = new javax.swing.JMenu();
        itmCadastrarUsuarios = new javax.swing.JMenuItem();
        itmExcluirUsuarios = new javax.swing.JMenuItem();
        itmAlterarUsuarios = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itmListarUsuarios = new javax.swing.JMenuItem();
        itmBuscarUsuarios = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        itmInstruções = new javax.swing.JMenuItem();
        itmSobre = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenu();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LK64wBf-black-wallpaper-1920x1080.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LK64wBf-black-wallpaper-1920x1080.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1140, 640);

        mnuDepartamentos.setText("Departamentos");

        itmCadastrarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarDepartamentos.setText("Cadastrar");
        itmCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmCadastrarDepartamentos);

        itmAlterarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmAlterarDepartamentos.setText("Alterar");
        itmAlterarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmAlterarDepartamentos);

        itmExcluirDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmExcluirDepartamentos.setText("Excluir");
        itmExcluirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirDepartamentosActionPerformed(evt);
            }
        });
        mnuDepartamentos.add(itmExcluirDepartamentos);
        mnuDepartamentos.add(jSeparator1);

        itmListarDepartamentos.setText("Listar");
        mnuDepartamentos.add(itmListarDepartamentos);

        itmBuscarDepartamentos.setText("Buscar");
        mnuDepartamentos.add(itmBuscarDepartamentos);
        mnuDepartamentos.add(jSeparator2);

        itmSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmSair.setText("Sair");
        mnuDepartamentos.add(itmSair);

        jMenuBar1.add(mnuDepartamentos);

        mnuFuncionarios.setText("Funcionários");

        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmAlterarFuncionarios.setText("Alterar");
        mnuFuncionarios.add(itmAlterarFuncionarios);
        mnuFuncionarios.add(jSeparator3);

        itmListarFuncionarios.setText("Listar");
        mnuFuncionarios.add(itmListarFuncionarios);

        itmBuscarFuncionarios.setText("Buscar");
        mnuFuncionarios.add(itmBuscarFuncionarios);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuários.setText("Usuários");

        itmCadastrarUsuarios.setText("Cadastrar");
        itmCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuários.add(itmCadastrarUsuarios);

        itmExcluirUsuarios.setText("Excluir");
        itmExcluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirUsuariosActionPerformed(evt);
            }
        });
        mnuUsuários.add(itmExcluirUsuarios);

        itmAlterarUsuarios.setText("Alterar");
        itmAlterarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuários.add(itmAlterarUsuarios);
        mnuUsuários.add(jSeparator4);

        itmListarUsuarios.setText("Listar");
        itmListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuários.add(itmListarUsuarios);

        itmBuscarUsuarios.setText("Buscar");
        itmBuscarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuários.add(itmBuscarUsuarios);

        jMenuBar1.add(mnuUsuários);

        mnuAjuda.setText("Ajuda");

        itmInstruções.setText("Instruções de uso");
        mnuAjuda.add(itmInstruções);

        itmSobre.setText("Sobre");
        mnuAjuda.add(itmSobre);

        jMenuBar1.add(mnuAjuda);

        mnuSair.setText("Sair");
        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1155, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmAlterarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmAlterarDepartamentosActionPerformed

    private void itmExcluirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirDepartamentosActionPerformed
        String dep;
        dep = JOptionPane.showInputDialog("ID do departamento:");
        PreparedStatement st;
        try {
            st = c.prepareStatement("DELETE FROM departamentos WHERE id = ?");
            st.setString(1, dep);
            int i = st.executeUpdate();
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Departamento não encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Departamento excluído com sucesso.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "UErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_itmExcluirDepartamentosActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarUsuariosActionPerformed
        new ListarUsuarios().setVisible(true);
    }//GEN-LAST:event_itmListarUsuariosActionPerformed

    private void itmBuscarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarUsuariosActionPerformed
        try {
            String u;
            u = JOptionPane.showInputDialog("Nome do usuário: ");
            PreparedStatement st;
            st = c.prepareStatement("SELECT * FROM usuários WHERE usuario = ?");
            st.setString(1, u);
            ResultSet usuario = st.executeQuery();
            if (usuario.next()){
                String usu, sen, car;
                usu = usuario.getString("usuario");
                sen = usuario.getString("senha");
                car = usuario.getString("cargo");
                JOptionPane.showMessageDialog(null, """
                                                    Nome do usuário: %s
                                                    Senha: %s
                                                    Cargo: %s""".formatted(usu, sen, car));
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "UErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_itmBuscarUsuariosActionPerformed

    private void itmCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuariosActionPerformed
        // TODO add your handling code here:
        new CadastrarUsuários().setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuariosActionPerformed

    private void itmExcluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirUsuariosActionPerformed
        String u;
        u = JOptionPane.showInputDialog("Usuário:");
        PreparedStatement st;
        try {
            st = c.prepareStatement("DELETE FROM usuários WHERE usuario = ?");
            st.setString(1, u);
            int i = st.executeUpdate();
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "UErro:" + ex.getMessage());
        }

    }//GEN-LAST:event_itmExcluirUsuariosActionPerformed

    private void itmCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentosActionPerformed
        new CadastrarDepartamento().setVisible(true);
        
    }//GEN-LAST:event_itmCadastrarDepartamentosActionPerformed

    private void itmAlterarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarUsuariosActionPerformed
        try {
            String u;
            u = JOptionPane.showInputDialog("Usuário a alterar: ");
            PreparedStatement st;
            st = c.prepareStatement("SELECT * FROM usuários WHERE usuario = ?");
            st.setString(1, u);
            ResultSet usuario = st.executeQuery();
            if (usuario.next()){
                String usu, sen, car;
                usu = usuario.getString("usuario");
                sen = usuario.getString("senha");
                car = usuario.getString("cargo");
                new AlterarUsuarios(usu, sen, car).setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuário ");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "UErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_itmAlterarUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterarDepartamentos;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarUsuarios;
    private javax.swing.JMenuItem itmBuscarDepartamentos;
    private javax.swing.JMenuItem itmBuscarFuncionarios;
    private javax.swing.JMenuItem itmBuscarUsuarios;
    private javax.swing.JMenuItem itmCadastrarDepartamentos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarUsuarios;
    private javax.swing.JMenuItem itmExcluirDepartamentos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirUsuarios;
    private javax.swing.JMenuItem itmInstruções;
    private javax.swing.JMenuItem itmListarDepartamentos;
    private javax.swing.JMenuItem itmListarFuncionarios;
    private javax.swing.JMenuItem itmListarUsuarios;
    private javax.swing.JMenuItem itmSair;
    private javax.swing.JMenuItem itmSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuDepartamentos;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JMenu mnuUsuários;
    // End of variables declaration//GEN-END:variables
}
