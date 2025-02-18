/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author joao.aoliveira10
 */
public class Menu extends javax.swing.JFrame {

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

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        itmAlterarDepartamentos = new javax.swing.JMenu();
        itmCadastrarDepartamentos = new javax.swing.JMenuItem();
        itmExcluirDepartamentos = new javax.swing.JMenuItem();
        itmAlterarrDepartamentos = new javax.swing.JMenuItem();
        itmListarDepartamentos = new javax.swing.JMenuItem();
        itmBuscarDepartamentos = new javax.swing.JMenuItem();
        mnuFuncionarios = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        itmListarFuncionarios = new javax.swing.JMenuItem();
        itmBuscarFuncionarios = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenu();
        itmCadastrarUsuario = new javax.swing.JMenuItem();
        itmExcluirUsuarios = new javax.swing.JMenuItem();
        itmAlterarUsuarios = new javax.swing.JMenuItem();
        itmListarUsuarios = new javax.swing.JMenuItem();
        itmBuscarUsuarios = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal do Sistema");
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/x.png"))); // NOI18N
        jButton1.setToolTipText("Buscar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 430, 30);

        itmAlterarDepartamentos.setMnemonic('D');
        itmAlterarDepartamentos.setText("Departamentos");

        itmCadastrarDepartamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadastrarDepartamentos.setText("Cadastrar");
        itmCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarDepartamentosActionPerformed(evt);
            }
        });
        itmAlterarDepartamentos.add(itmCadastrarDepartamentos);

        itmExcluirDepartamentos.setText("Excluir");
        itmAlterarDepartamentos.add(itmExcluirDepartamentos);

        itmAlterarrDepartamentos.setText("Alterar");
        itmAlterarDepartamentos.add(itmAlterarrDepartamentos);

        itmListarDepartamentos.setText("Listar");
        itmListarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarDepartamentosActionPerformed(evt);
            }
        });
        itmAlterarDepartamentos.add(itmListarDepartamentos);

        itmBuscarDepartamentos.setText("Buscar");
        itmAlterarDepartamentos.add(itmBuscarDepartamentos);

        jMenuBar1.add(itmAlterarDepartamentos);

        mnuFuncionarios.setMnemonic('F');
        mnuFuncionarios.setText("Funcionarios");

        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmCadastrarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        itmExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmExcluirFuncionarios);

        itmAlterarFuncionarios.setText("Alterar");
        itmAlterarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionarios.add(itmAlterarFuncionarios);

        itmListarFuncionarios.setText("Listar");
        mnuFuncionarios.add(itmListarFuncionarios);

        itmBuscarFuncionarios.setText("Buscar");
        mnuFuncionarios.add(itmBuscarFuncionarios);

        jMenuBar1.add(mnuFuncionarios);

        mnuUsuarios.setMnemonic('U');
        mnuUsuarios.setText("Usuarios");

        itmCadastrarUsuario.setText("Cadastrar");
        itmCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuarioActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmCadastrarUsuario);

        itmExcluirUsuarios.setText("Excluir");
        mnuUsuarios.add(itmExcluirUsuarios);

        itmAlterarUsuarios.setText("Alterar");
        itmAlterarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(itmAlterarUsuarios);

        itmListarUsuarios.setText("Listar");
        mnuUsuarios.add(itmListarUsuarios);

        itmBuscarUsuarios.setText("Buscar");
        mnuUsuarios.add(itmBuscarUsuarios);

        jMenuBar1.add(mnuUsuarios);

        mnuAjuda.setMnemonic('A');
        mnuAjuda.setText("Ajuda");

        jMenuItem1.setText("Informações de uso");
        mnuAjuda.add(jMenuItem1);

        jMenuItem2.setText("Sobre");
        mnuAjuda.add(jMenuItem2);

        jMenuBar1.add(mnuAjuda);

        jMenu1.setMnemonic('S');
        jMenu1.setText("Sair");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(445, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmListarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmListarDepartamentosActionPerformed

    private void itmCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarDepartamentosActionPerformed

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmExcluirFuncionariosActionPerformed

    private void itmAlterarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmAlterarFuncionariosActionPerformed

    private void itmAlterarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmAlterarUsuariosActionPerformed

    private void itmCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCadastrarUsuarioActionPerformed

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
    private javax.swing.JMenu itmAlterarDepartamentos;
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmAlterarUsuarios;
    private javax.swing.JMenuItem itmAlterarrDepartamentos;
    private javax.swing.JMenuItem itmBuscarDepartamentos;
    private javax.swing.JMenuItem itmBuscarFuncionarios;
    private javax.swing.JMenuItem itmBuscarUsuarios;
    private javax.swing.JMenuItem itmCadastrarDepartamentos;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarUsuario;
    private javax.swing.JMenuItem itmExcluirDepartamentos;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmExcluirUsuarios;
    private javax.swing.JMenuItem itmListarDepartamentos;
    private javax.swing.JMenuItem itmListarFuncionarios;
    private javax.swing.JMenuItem itmListarUsuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuFuncionarios;
    private javax.swing.JMenu mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
