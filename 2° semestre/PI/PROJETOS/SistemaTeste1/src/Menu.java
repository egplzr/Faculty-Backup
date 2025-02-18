/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author enzog
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuDepartamentos = new javax.swing.JMenu();
        itemCadastrarDepartamentos = new javax.swing.JMenuItem();
        itemExcluirDepartamentos = new javax.swing.JMenuItem();
        itemAlterarDepartamentos = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemListarDepartamentos = new javax.swing.JMenuItem();
        itemBuscarDepartamentos = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenu();
        itemCadastrarFuncionarios = new javax.swing.JMenuItem();
        itemExcluirFuncionarios = new javax.swing.JMenuItem();
        itemAlterarFuncionarios = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemListarFuncionarios = new javax.swing.JMenuItem();
        itemBuscarFuncionarios = new javax.swing.JMenuItem();
        menuUsuarios = new javax.swing.JMenu();
        itemCadastrarUsuarios = new javax.swing.JMenuItem();
        itemExcluirUsuarios = new javax.swing.JMenuItem();
        itemAlterarUsuarios = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        itemListarUsuarios = new javax.swing.JMenuItem();
        itemBuscarUsuarios = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuInstrucoes = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 390);

        jMenuBar2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar2.setForeground(new java.awt.Color(0, 0, 51));

        menuDepartamentos.setText("Departamentos");

        itemCadastrarDepartamentos.setText("Cadastrar");
        itemCadastrarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarDepartamentosActionPerformed(evt);
            }
        });
        menuDepartamentos.add(itemCadastrarDepartamentos);

        itemExcluirDepartamentos.setText("Excluir");
        itemExcluirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExcluirDepartamentosActionPerformed(evt);
            }
        });
        menuDepartamentos.add(itemExcluirDepartamentos);

        itemAlterarDepartamentos.setText("Alterar");
        itemAlterarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlterarDepartamentosActionPerformed(evt);
            }
        });
        menuDepartamentos.add(itemAlterarDepartamentos);
        menuDepartamentos.add(jSeparator2);

        itemListarDepartamentos.setText("Listar");
        menuDepartamentos.add(itemListarDepartamentos);

        itemBuscarDepartamentos.setText("Buscar");
        itemBuscarDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarDepartamentosActionPerformed(evt);
            }
        });
        menuDepartamentos.add(itemBuscarDepartamentos);

        jMenuBar2.add(menuDepartamentos);

        menuFuncionarios.setText("Funcionários");

        itemCadastrarFuncionarios.setText("Cadastrar");
        itemCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionarios.add(itemCadastrarFuncionarios);

        itemExcluirFuncionarios.setText("Excluir");
        itemExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExcluirFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionarios.add(itemExcluirFuncionarios);

        itemAlterarFuncionarios.setText("Alterar");
        itemAlterarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlterarFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionarios.add(itemAlterarFuncionarios);
        menuFuncionarios.add(jSeparator4);

        itemListarFuncionarios.setText("Listar");
        menuFuncionarios.add(itemListarFuncionarios);

        itemBuscarFuncionarios.setText("Buscar");
        itemBuscarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarFuncionariosActionPerformed(evt);
            }
        });
        menuFuncionarios.add(itemBuscarFuncionarios);

        jMenuBar2.add(menuFuncionarios);

        menuUsuarios.setText("Usuários");

        itemCadastrarUsuarios.setText("Cadastrar");
        itemCadastrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastrarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemCadastrarUsuarios);

        itemExcluirUsuarios.setText("Excluir");
        itemExcluirUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemExcluirUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemExcluirUsuarios);

        itemAlterarUsuarios.setText("Alterar");
        itemAlterarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlterarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemAlterarUsuarios);
        menuUsuarios.add(jSeparator5);

        itemListarUsuarios.setText("Listar");
        menuUsuarios.add(itemListarUsuarios);

        itemBuscarUsuarios.setText("Buscar");
        itemBuscarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBuscarUsuariosActionPerformed(evt);
            }
        });
        menuUsuarios.add(itemBuscarUsuarios);

        jMenuBar2.add(menuUsuarios);

        menuAjuda.setText("Ajuda");

        menuInstrucoes.setText("Instruções de uso");
        menuInstrucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInstrucoesActionPerformed(evt);
            }
        });
        menuAjuda.add(menuInstrucoes);

        menuSobre.setText("Sobre");
        menuAjuda.add(menuSobre);

        jMenuBar2.add(menuAjuda);

        menuSair.setText("Sair");
        jMenuBar2.add(menuSair);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(711, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemExcluirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExcluirDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemExcluirDepartamentosActionPerformed

    private void itemBuscarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarDepartamentosActionPerformed

    private void itemCadastrarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarDepartamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCadastrarDepartamentosActionPerformed

    private void itemCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCadastrarFuncionariosActionPerformed

    private void itemExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExcluirFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemExcluirFuncionariosActionPerformed

    private void itemBuscarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarFuncionariosActionPerformed

    private void itemAlterarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlterarFuncionariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAlterarFuncionariosActionPerformed

    private void itemCadastrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastrarUsuariosActionPerformed
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_itemCadastrarUsuariosActionPerformed

    private void itemExcluirUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemExcluirUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemExcluirUsuariosActionPerformed

    private void itemAlterarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlterarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemAlterarUsuariosActionPerformed

    private void itemBuscarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBuscarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBuscarUsuariosActionPerformed

    private void menuInstrucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInstrucoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuInstrucoesActionPerformed

    private void itemAlterarDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlterarDepartamentosActionPerformed
        new AlterarUsuario().setVisible(true);
    }//GEN-LAST:event_itemAlterarDepartamentosActionPerformed

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
    private javax.swing.JMenuItem itemAlterarDepartamentos;
    private javax.swing.JMenuItem itemAlterarFuncionarios;
    private javax.swing.JMenuItem itemAlterarUsuarios;
    private javax.swing.JMenuItem itemBuscarDepartamentos;
    private javax.swing.JMenuItem itemBuscarFuncionarios;
    private javax.swing.JMenuItem itemBuscarUsuarios;
    private javax.swing.JMenuItem itemCadastrarDepartamentos;
    private javax.swing.JMenuItem itemCadastrarFuncionarios;
    private javax.swing.JMenuItem itemCadastrarUsuarios;
    private javax.swing.JMenuItem itemExcluirDepartamentos;
    private javax.swing.JMenuItem itemExcluirFuncionarios;
    private javax.swing.JMenuItem itemExcluirUsuarios;
    private javax.swing.JMenuItem itemListarDepartamentos;
    private javax.swing.JMenuItem itemListarFuncionarios;
    private javax.swing.JMenuItem itemListarUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuDepartamentos;
    private javax.swing.JMenu menuFuncionarios;
    private javax.swing.JMenuItem menuInstrucoes;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenu menuUsuarios;
    // End of variables declaration//GEN-END:variables
}
