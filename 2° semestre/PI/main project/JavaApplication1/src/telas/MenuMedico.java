/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import com.formdev.flatlaf.FlatDarculaLaf;
import dao.PlataformaDao;
import entities.Medico;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author EEEenxxeee
 */
public class MenuMedico extends javax.swing.JFrame {

    PlataformaDao bd;
    Medico crmMedicoLogado;
    Medico dadosMedicoLogado;

    /**
     * Creates new form Menu
     */
    public MenuMedico() {
        initComponents();
    }

    public MenuMedico(String crm, String senha) {
        initComponents();

        bd = new PlataformaDao();

        crmMedicoLogado = new Medico(crm, senha);

        panelDashboard.setVisible(true);
        panelAlterarCadastro.setVisible(false);
        panelConsultas.setVisible(false);
        panelListagem.setVisible(false);

        salvarMedicoLogado(crmMedicoLogado);
        listarPacientesDashboard();
        listarConsultasAgendadasDashboardM();
    }

    private void salvarMedicoLogado(Medico crmMedicoLogado) {
        String nome, cpf, especialidade, dataNascimento, cidadeAtuacao, email, telefone;

        try {
            ResultSet medicoLogado = bd.InfoMedicoLogado(crmMedicoLogado);

            if (medicoLogado.next()) {
                nome = medicoLogado.getString("nome");
                cpf = medicoLogado.getString("cpf");
                especialidade = medicoLogado.getString("especialidade");
                dataNascimento = medicoLogado.getString("data_nascimento");
                cidadeAtuacao = medicoLogado.getString("cidade_atuacao");
                email = medicoLogado.getString("email");
                telefone = medicoLogado.getString("telefone");

                txtNomeM.setText(nome);
                txtCrmM.setText(crmMedicoLogado.getCrm());
                txtCrmM.setEnabled(false);
                txtCpfM.setText(cpf);
                txtCpfM.setEnabled(false);
                txtEspecialidadeM.setText(especialidade);
                txtNascM.setText(dataNascimento);
                txtNascM.setEnabled(false);
                txtCidadeM.setText(cidadeAtuacao);
                txtEmailM.setText(email);
                txtTelefoneM.setText(telefone);
                pswSenhaM.setText(crmMedicoLogado.getSenha());

                dadosMedicoLogado = new Medico(crmMedicoLogado.getCrm(), nome, cpf, especialidade, dataNascimento, cidadeAtuacao, email, telefone, crmMedicoLogado.getSenha());
                
                txtPerfilCrm.setText(dadosMedicoLogado.getCrm());
                txtPerfilCrm.setEnabled(false);
                txtPerfilNome.setText(dadosMedicoLogado.getNome());
                txtPerfilNome.setEnabled(false);
                txtPerfilEspecialidade.setText(dadosMedicoLogado.getEspecialide());
                txtPerfilEspecialidade.setEnabled(false);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void listarConsultasAgendadasDashboardM() {
        try {
            ResultSet consultasListagem = bd.listarConsultasAgendadasDashboard(dadosMedicoLogado.getNome());
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasAgendadasM.getModel();
            tblConsultas.setRowCount(0);
            while (consultasListagem.next()) {
                String linha[] = {
                    consultasListagem.getString("id_consulta"),
                    consultasListagem.getString("fk_id_paciente"),
                    consultasListagem.getString("data_consulta"),
                    consultasListagem.getString("hora_consulta")
                };
                tblConsultas.addRow(linha);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void listarConsultasConsultas() {
        try {
            ResultSet consultasListagem = bd.listarConsultasAgendadasDashboard(dadosMedicoLogado.getNome());
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasConsultas.getModel();
            tblConsultas.setRowCount(0);
            while (consultasListagem.next()) {
                String linha[] = {
                    consultasListagem.getString("id_consulta"),
                    consultasListagem.getString("fk_id_paciente"),
                    consultasListagem.getString("data_consulta"),
                    consultasListagem.getString("hora_consulta")
                };
                tblConsultas.addRow(linha);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarPacientesDashboard() {
        try {
            ResultSet pacientesDashboard = new PlataformaDao().listarPacientesDashboard();
            DefaultTableModel tblPacientesDashboard = (DefaultTableModel) tblPacientes.getModel();
            tblPacientesDashboard.setRowCount(0);
            while (pacientesDashboard.next()) {
                String linha[] = {
                    pacientesDashboard.getString("id_paciente"),
                    pacientesDashboard.getString("nome")
                };
                tblPacientesDashboard.addRow(linha);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarConsultasListagem() {
        try {
            ResultSet consultasListagem = bd.listarConsultasListagem();
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasListagem.getModel();
            tblConsultas.setRowCount(0);
            while (consultasListagem.next()) {
                String linha[] = {
                    consultasListagem.getString("id_consulta"),
                    consultasListagem.getString("fk_id_paciente"),
                    consultasListagem.getString("fk_nome_medico"),
                    consultasListagem.getString("data_consulta"),
                    consultasListagem.getString("hora_consulta")
                };
                tblConsultas.addRow(linha);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarMedicosListagem() {
        try {
            ResultSet medicosListagem = bd.listarMedicosListagem();
            DefaultTableModel tblMedicos = (DefaultTableModel) tblMedicosListagem.getModel();
            tblMedicos.setRowCount(0);
            while (medicosListagem.next()) {
                String linha[] = {
                    medicosListagem.getString("crm"),
                    medicosListagem.getString("nome"),
                    medicosListagem.getString("especialidade"),
                    medicosListagem.getString("cidade_atuacao")
                };
                tblMedicos.addRow(linha);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarPacientesListagem() {
        try {
            ResultSet pacientesListagem = bd.listarPacientesListagem();
            DefaultTableModel tblPacientes = (DefaultTableModel) tblPacientesListagem.getModel();
            tblPacientes.setRowCount(0);
            while (pacientesListagem.next()) {
                String linha[] = {
                    pacientesListagem.getString("id_paciente"),
                    pacientesListagem.getString("nome"),
                    pacientesListagem.getString("cpf"),
                    pacientesListagem.getString("cidade")
                };
                tblPacientes.addRow(linha);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblAlterarCadastro = new javax.swing.JLabel();
        lblListagem = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelDashboard = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblConsultasAgendadasM = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtPerfilNome = new javax.swing.JTextField();
        txtPerfilCrm = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtPerfilEspecialidade = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelAlterarCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeM = new javax.swing.JTextField();
        txtCrmM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpfM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEspecialidadeM = new javax.swing.JTextField();
        txtNascM = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCidadeM = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmailM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefoneM = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pswSenhaM = new javax.swing.JPasswordField();
        btnAlterarCadastro = new javax.swing.JButton();
        btnExcluirCadastro = new javax.swing.JButton();
        panelListagem = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMedicosListagem = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblConsultasListagem = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        tblPacientesListagem = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtBuscarConsultasListagem = new javax.swing.JTextPane();
        btnBuscarConsultasListagem = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtBuscarMedicosListagem = new javax.swing.JTextPane();
        btnBuscarMedicosListagem = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtBuscarPacientesListagem = new javax.swing.JTextPane();
        btnBuscarPacientesListagem = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        panelConsultas = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultasConsultas = new javax.swing.JTable();
        txtBuscarSuasConsultas = new javax.swing.JTextField();
        btnBuscarSuasConsultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblDashboard.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboard.setText("Dashboard");
        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DashboardMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DashboardVoltarCor(evt);
            }
        });

        lblAlterarCadastro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAlterarCadastro.setForeground(new java.awt.Color(0, 0, 0));
        lblAlterarCadastro.setText("Alterar cadastro");
        lblAlterarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAlterarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlterarCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AlterarCadastroVoltarCor(evt);
                AlterarCadastroMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AlterarCadastroVoltarCor(evt);
            }
        });

        lblListagem.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblListagem.setForeground(new java.awt.Color(0, 0, 0));
        lblListagem.setText("Listagens");
        lblListagem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListagemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListagemMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListagemVoltarCor(evt);
            }
        });

        lblConsultas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblConsultas.setForeground(new java.awt.Color(0, 0, 0));
        lblConsultas.setText("Consultas");
        lblConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsultaMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConsultaVoltarCor(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSair.setForeground(new java.awt.Color(0, 0, 0));
        lblSair.setText("Sair");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairVoltarCor(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSair)
                    .addComponent(lblConsultas)
                    .addComponent(lblListagem)
                    .addComponent(lblDashboard)
                    .addComponent(lblAlterarCadastro))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblDashboard)
                .addGap(35, 35, 35)
                .addComponent(lblAlterarCadastro)
                .addGap(35, 35, 35)
                .addComponent(lblListagem)
                .addGap(35, 35, 35)
                .addComponent(lblConsultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(lblSair)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 180, 660));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("MedOn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(1166, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 60));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDashboard.setBackground(new java.awt.Color(51, 51, 51));
        panelDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblConsultasAgendadasM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID da consulta", "ID do paciente", "data", "hora"
            }
        ));
        tblConsultasAgendadasM.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane4.setViewportView(tblConsultasAgendadasM);

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ));
        tblPacientes.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(tblPacientes);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Consultas agendadas");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pacientes");

        jPanel4.setBackground(new java.awt.Color(40, 40, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CRM:");

        txtPerfilNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPerfilNome.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilNomeActionPerformed(evt);
            }
        });

        txtPerfilCrm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPerfilCrm.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilCrmActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Especialidade:");

        txtPerfilEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPerfilEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilEspecialidadeActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nome:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(txtPerfilEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(txtPerfilNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtPerfilCrm, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(137, 137, 137))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPerfilCrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerfilNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPerfilEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Perfil");

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDashboardLayout.createSequentialGroup()
                        .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDashboardLayout.createSequentialGroup()
                                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(135, 135, 135))))
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashboardLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );

        jPanel6.add(panelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 60, 1100, -1));

        panelAlterarCadastro.setBackground(new java.awt.Color(51, 51, 51));
        panelAlterarCadastro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelAlterarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        panelAlterarCadastro.setPreferredSize(new java.awt.Dimension(1100, 667));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seu Cadastro");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome");

        txtNomeM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CRM");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Especialidade");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data nascimento");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cidade de atuação");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("E-mail");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefone");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Senha");

        pswSenhaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaMActionPerformed(evt);
            }
        });

        btnAlterarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarCadastro.setText("Alterar");
        btnAlterarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCadastroActionPerformed(evt);
            }
        });

        btnExcluirCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirCadastro.setText("Excluir");
        btnExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAlterarCadastroLayout = new javax.swing.GroupLayout(panelAlterarCadastro);
        panelAlterarCadastro.setLayout(panelAlterarCadastroLayout);
        panelAlterarCadastroLayout.setHorizontalGroup(
            panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                        .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(txtNascM, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlterarCadastroLayout.createSequentialGroup()
                        .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(txtNomeM)
                                        .addComponent(txtCrmM)
                                        .addComponent(txtCpfM, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEspecialidadeM, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlterarCadastroLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnExcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)))
                        .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addComponent(txtCidadeM)
                                .addComponent(txtEmailM)
                                .addComponent(txtTelefoneM)
                                .addComponent(pswSenhaM, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))))
            .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(887, Short.MAX_VALUE))
        );
        panelAlterarCadastroLayout.setVerticalGroup(
            panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCrmM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecialidadeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidadeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pswSenhaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNascM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        jPanel6.add(panelAlterarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 60, 1100, -1));

        panelListagem.setBackground(new java.awt.Color(51, 51, 51));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Listagem");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(955, 2000));

        tblMedicosListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CRM", "Nome", "Especialidade", "Cidade de atuação"
            }
        ));
        jScrollPane5.setViewportView(tblMedicosListagem);

        tblConsultasListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Consulta", "ID Paciente", "Nome médico", "Data", "Hora"
            }
        ));
        jScrollPane6.setViewportView(tblConsultasListagem);

        tblPacientesListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Paciente", "Nome", "CPF", "Cidade"
            }
        ));
        jScrollPane18.setViewportView(tblPacientesListagem);

        jScrollPane19.setViewportView(txtBuscarConsultasListagem);

        btnBuscarConsultasListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarConsultasListagem.setText("Buscar");
        btnBuscarConsultasListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConsultasListagemActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Consultas:");

        jScrollPane20.setViewportView(txtBuscarMedicosListagem);

        btnBuscarMedicosListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMedicosListagem.setText("Buscar");
        btnBuscarMedicosListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMedicosListagemActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Médicos:");

        jScrollPane21.setViewportView(txtBuscarPacientesListagem);

        btnBuscarPacientesListagem.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPacientesListagem.setText("Buscar");
        btnBuscarPacientesListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacientesListagemActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Pacientes:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(112, 112, 112))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscarMedicosListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBuscarPacientesListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnBuscarConsultasListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarConsultasListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarMedicosListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(150, 150, 150)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPacientesListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jScrollPane7.setViewportView(jPanel3);

        javax.swing.GroupLayout panelListagemLayout = new javax.swing.GroupLayout(panelListagem);
        panelListagem.setLayout(panelListagemLayout);
        panelListagemLayout.setHorizontalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addGroup(panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListagemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelListagemLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        panelListagemLayout.setVerticalGroup(
            panelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
        );

        jPanel6.add(panelListagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 60, 1100, -1));

        panelConsultas.setBackground(new java.awt.Color(51, 51, 51));
        panelConsultas.setPreferredSize(new java.awt.Dimension(1100, 667));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Suas consultas:");

        tblConsultasConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Consulta", "ID Paciente", "Data", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tblConsultasConsultas);

        txtBuscarSuasConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarSuasConsultasActionPerformed(evt);
            }
        });

        btnBuscarSuasConsultas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarSuasConsultas.setText("Buscar");
        btnBuscarSuasConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSuasConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelConsultasLayout = new javax.swing.GroupLayout(panelConsultas);
        panelConsultas.setLayout(panelConsultasLayout);
        panelConsultasLayout.setHorizontalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelConsultasLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarSuasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarSuasConsultas))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panelConsultasLayout.setVerticalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscarSuasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarSuasConsultas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel6.add(panelConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 60, 1100, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DashboardMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardMudarCor
        lblDashboard.setForeground(Color.blue);
    }//GEN-LAST:event_DashboardMudarCor

    private void DashboardVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DashboardVoltarCor
        lblDashboard.setForeground(Color.black);
    }//GEN-LAST:event_DashboardVoltarCor

    private void AlterarCadastroVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlterarCadastroVoltarCor
        lblAlterarCadastro.setForeground(Color.black);
    }//GEN-LAST:event_AlterarCadastroVoltarCor

    private void AlterarCadastroMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlterarCadastroMudarCor
        lblAlterarCadastro.setForeground(Color.blue);
    }//GEN-LAST:event_AlterarCadastroMudarCor

    private void ListagemMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListagemMudarCor
        lblListagem.setForeground(Color.blue);
    }//GEN-LAST:event_ListagemMudarCor

    private void ListagemVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListagemVoltarCor
        lblListagem.setForeground(Color.black);
    }//GEN-LAST:event_ListagemVoltarCor

    private void ConsultaMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaMudarCor
        lblConsultas.setForeground(Color.blue);
    }//GEN-LAST:event_ConsultaMudarCor

    private void ConsultaVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaVoltarCor
        lblConsultas.setForeground(Color.black);
    }//GEN-LAST:event_ConsultaVoltarCor

    private void pswSenhaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaMActionPerformed

    private void btnAlterarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCadastroActionPerformed
        dadosMedicoLogado.setNome(txtNomeM.getText());
        dadosMedicoLogado.setEspecialide(txtEspecialidadeM.getText());
        dadosMedicoLogado.setCidadeAtuacao(txtCidadeM.getText());
        dadosMedicoLogado.setEmail(txtEmailM.getText());
        dadosMedicoLogado.setTelefone(txtTelefoneM.getText());
        dadosMedicoLogado.setSenha(pswSenhaM.getText());
        
        try {
            bd.alterarUsuarioMedico(dadosMedicoLogado);
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAlterarCadastroActionPerformed

    private void txtNomeMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMActionPerformed

    private void btnBuscarConsultasListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConsultasListagemActionPerformed
        String id;
        id = txtBuscarConsultasListagem.getText();

        try {
            ResultSet consultasListagem = bd.buscarConsultasListagem(id);
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasListagem.getModel();
            tblConsultas.setRowCount(0);
            while (consultasListagem.next()) {
                String linha[] = {
                    consultasListagem.getString("id_consulta"),
                    consultasListagem.getString("fk_id_paciente"),
                    consultasListagem.getString("fk_nome_medico"),
                    consultasListagem.getString("data_consulta"),
                    consultasListagem.getString("hora_consulta")    
                };
                tblConsultas.addRow(linha);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarConsultasListagemActionPerformed

    private void btnBuscarMedicosListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMedicosListagemActionPerformed
        String crm;
        crm = txtBuscarMedicosListagem.getText();

        try {
            ResultSet medicosListagem = bd.buscarMedicosListagem(crm);
            DefaultTableModel tblMedicos = (DefaultTableModel) tblMedicosListagem.getModel();
            tblMedicos.setRowCount(0);
            while (medicosListagem.next()) {
                String linha[] = {
                    medicosListagem.getString("crm"),
                    medicosListagem.getString("nome"),
                    medicosListagem.getString("especialidade"),
                    medicosListagem.getString("cidade_atuacao")
                };
                tblMedicos.addRow(linha);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarMedicosListagemActionPerformed

    private void btnBuscarPacientesListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacientesListagemActionPerformed
        String id;
        id = txtBuscarPacientesListagem.getText();

        try {
            ResultSet pacientesListagem = bd.buscarPacientesListagem(id);
            DefaultTableModel tblPacientes = (DefaultTableModel) tblPacientesListagem.getModel();
            tblPacientes.setRowCount(0);
            while (pacientesListagem.next()) {
                String linha[] = {
                    pacientesListagem.getString("id_paciente"),
                    pacientesListagem.getString("nome"),
                    pacientesListagem.getString("cpf"),
                    pacientesListagem.getString("cidade")
                };
                tblPacientes.addRow(linha);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarPacientesListagemActionPerformed

    private void txtBuscarSuasConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarSuasConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarSuasConsultasActionPerformed

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked

        panelAlterarCadastro.setVisible(false);
        panelConsultas.setVisible(false);
        panelListagem.setVisible(false);
        panelDashboard.setVisible(true);
        listarPacientesDashboard();
        listarConsultasAgendadasDashboardM();
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblAlterarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarCadastroMouseClicked

        panelDashboard.setVisible(false);
        panelConsultas.setVisible(false);
        panelListagem.setVisible(false);
        panelAlterarCadastro.setVisible(true);
    }//GEN-LAST:event_lblAlterarCadastroMouseClicked

    private void lblListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListagemMouseClicked
        panelDashboard.setVisible(false);
        panelConsultas.setVisible(false);
        panelAlterarCadastro.setVisible(false);
        panelListagem.setVisible(true);
        listarConsultasListagem();
        listarMedicosListagem();
        listarPacientesListagem();
    }//GEN-LAST:event_lblListagemMouseClicked

    private void lblConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultasMouseClicked
        panelDashboard.setVisible(false);
        panelAlterarCadastro.setVisible(false);
        panelListagem.setVisible(false);
        panelConsultas.setVisible(true);
        listarConsultasConsultas();
    }//GEN-LAST:event_lblConsultasMouseClicked

    private void btnExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroActionPerformed
        try {
            bd.excluirUsuarioMedico(crmMedicoLogado);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
            new Login().setVisible(true);
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirCadastroActionPerformed

    private void txtPerfilNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilNomeActionPerformed

    private void txtPerfilCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilCrmActionPerformed

    private void txtPerfilEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilEspecialidadeActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblSairMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMudarCor
        lblSair.setForeground(Color.blue);
    }//GEN-LAST:event_lblSairMudarCor

    private void lblSairVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairVoltarCor
        lblSair.setForeground(Color.black);
    }//GEN-LAST:event_lblSairVoltarCor

    private void btnBuscarSuasConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSuasConsultasActionPerformed
        String nome, idCons;
        nome = dadosMedicoLogado.getNome();
        idCons = txtBuscarSuasConsultas.getText();
        
        try {
            ResultSet consultasConsultas = bd.buscarConsultasConsultas(nome, idCons);
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasConsultas.getModel();
            tblConsultas.setRowCount(0);
            while (consultasConsultas.next()) {
                String linha[] = {
                    consultasConsultas.getString("id_consulta"),
                    consultasConsultas.getString("fk_id_paciente"),
                    consultasConsultas.getString("data_consulta"),
                    consultasConsultas.getString("hora_consulta")
                };
                tblConsultas.addRow(linha);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarSuasConsultasActionPerformed

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
                    UIManager.setLookAndFeel(new FlatDarculaLaf());
                    break;
                }
            }
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCadastro;
    private javax.swing.JButton btnBuscarConsultasListagem;
    private javax.swing.JButton btnBuscarMedicosListagem;
    private javax.swing.JButton btnBuscarPacientesListagem;
    private javax.swing.JButton btnBuscarSuasConsultas;
    private javax.swing.JButton btnExcluirCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAlterarCadastro;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblListagem;
    private javax.swing.JLabel lblSair;
    private javax.swing.JPanel panelAlterarCadastro;
    private javax.swing.JPanel panelConsultas;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPanel panelListagem;
    private javax.swing.JPasswordField pswSenhaM;
    private javax.swing.JTable tblConsultasAgendadasM;
    private javax.swing.JTable tblConsultasConsultas;
    private javax.swing.JTable tblConsultasListagem;
    private javax.swing.JTable tblMedicosListagem;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTable tblPacientesListagem;
    private javax.swing.JTextPane txtBuscarConsultasListagem;
    private javax.swing.JTextPane txtBuscarMedicosListagem;
    private javax.swing.JTextPane txtBuscarPacientesListagem;
    private javax.swing.JTextField txtBuscarSuasConsultas;
    private javax.swing.JTextField txtCidadeM;
    private javax.swing.JTextField txtCpfM;
    private javax.swing.JTextField txtCrmM;
    private javax.swing.JTextField txtEmailM;
    private javax.swing.JTextField txtEspecialidadeM;
    private javax.swing.JTextField txtNascM;
    private javax.swing.JTextField txtNomeM;
    private javax.swing.JTextField txtPerfilCrm;
    private javax.swing.JTextField txtPerfilEspecialidade;
    private javax.swing.JTextField txtPerfilNome;
    private javax.swing.JTextField txtTelefoneM;
    // End of variables declaration//GEN-END:variables
}
