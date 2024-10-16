/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import com.formdev.flatlaf.FlatDarculaLaf;
import dao.PlataformaDao;
import entities.Medico;
import entities.Paciente;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EEEenxxeee
 */
public class MenuPaciente extends javax.swing.JFrame {

    PlataformaDao bd;
    Paciente cpfPacienteLogado;
    Paciente dadosPacienteLogado;

    /**
     * Creates new form MenuPaciente
     */
    public MenuPaciente() {
        initComponents();
        panelAgendamento.setVisible(false);
        panelAlterarCadastro.setVisible(false);
        panelConsultas.setVisible(false);
        panelDashboard.setVisible(true);
    }

    public MenuPaciente(String cpf, String senha) {
        initComponents();

        bd = new PlataformaDao();
        cpfPacienteLogado = new Paciente(cpf, senha);

        panelAgendamento.setVisible(false);
        panelAlterarCadastro.setVisible(false);
        panelConsultas.setVisible(false);
        panelDashboard.setVisible(true);

        salvarPacienteLogado(cpfPacienteLogado);
        listarConsultasPaciente();
    }

    private void salvarPacienteLogado(Paciente cpfPacienteLogado) {
        String id, nome, dataNascimento, endereco, cidade, email, telefone;

        try {
            ResultSet pacienteLogado = bd.InfoPacienteLogado(cpfPacienteLogado);

            if (pacienteLogado.next()) {
                id = pacienteLogado.getString("id_paciente");
                nome = pacienteLogado.getString("nome");
                dataNascimento = pacienteLogado.getString("data_nascimento");
                endereco = pacienteLogado.getString("endereco");
                cidade = pacienteLogado.getString("cidade");
                email = pacienteLogado.getString("email");
                telefone = pacienteLogado.getString("telefone");

                txtIdPaciente.setText(id);
                txtIdPaciente.setEnabled(false);
                txtNomeP.setText(nome);
                txtCpfP.setText(cpfPacienteLogado.getCpf());
                txtCpfP.setEnabled(false);
                txtNascP.setText(dataNascimento);
                txtNascP.setEnabled(false);
                txtEndP.setText(endereco);
                txtCidadeP.setText(dataNascimento);
                txtEmailP.setText(email);
                txtTelefoneP.setText(telefone);
                pswSenhaP.setText(cpfPacienteLogado.getSenha());

                dadosPacienteLogado = new Paciente(id, nome, cpfPacienteLogado.getCpf(), dataNascimento, endereco, cidade, email, telefone, cpfPacienteLogado.getSenha());

                txtPerfilCpf.setText(dadosPacienteLogado.getCpf());
                txtPerfilCpf.setEnabled(false);
                txtPerfilNome.setText(dadosPacienteLogado.getNome());
                txtPerfilNome.setEnabled(false);
                txtPerfilId.setText(dadosPacienteLogado.getId());
                txtPerfilId.setEnabled(false);

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void listarMedicosAgendamento() {
        try {
            ResultSet medicosListagem = bd.listarMedicosAgendamento();
            DefaultTableModel tblMedicos = (DefaultTableModel) tblMedicosAgendamento.getModel();
            tblMedicos.setRowCount(0);
            while (medicosListagem.next()) {
                String linha[] = {
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
    
    private void listarConsultasPaciente() {
        try {
            ResultSet consultasListagem = bd.listarConsultasDashboard(dadosPacienteLogado.getId());
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasAgendadasDashboard.getModel();
            tblConsultas.setRowCount(0);
            while (consultasListagem.next()) {
                String linha[] = {
                    consultasListagem.getString("id_consulta"),
                    consultasListagem.getString("fk_nome_medico"),
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
    
    private void listarConsultasHistórico() {
        try {
            ResultSet consultasListagem = bd.listarConsultasDashboard(dadosPacienteLogado.getId());
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasAgendadasHistórico.getModel();
            tblConsultas.setRowCount(0);
            while (consultasListagem.next()) {
                String linha[] = {
                    consultasListagem.getString("id_consulta"),
                    consultasListagem.getString("fk_nome_medico"),
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
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblAgendamento = new javax.swing.JLabel();
        lblConsultas = new javax.swing.JLabel();
        lblAlterarCadastro = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelDashboard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultasAgendadasDashboard = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtPerfilId = new javax.swing.JTextField();
        txtPerfilCpf = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPerfilNome = new javax.swing.JTextField();
        panelAgendamento = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMedicosAgendamento = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbAgendamentoHorario = new javax.swing.JComboBox<>();
        btnAgendamentoAgendar = new javax.swing.JButton();
        txtAgendamentoMedico = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtAgendamentoData = new javax.swing.JTextField();
        cmbAgendamentoEspecialidade = new javax.swing.JComboBox<>();
        panelConsultas = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblConsultasAgendadasHistórico = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtBuscarConsultas = new javax.swing.JTextPane();
        btnBuscarConsultas = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelAlterarCadastro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCpfP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNascP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEndP = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmailP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelefoneP = new javax.swing.JTextField();
        pswSenhaP = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        btnCadastrarP = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCidadeP = new javax.swing.JTextField();
        btnExcluirP = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtIdPaciente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lblDashboard.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(0, 0, 0));
        lblDashboard.setText("Dashboard");
        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDashboardDashboardMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDashboardDashboardVoltarCor(evt);
            }
        });

        lblAgendamento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAgendamento.setForeground(new java.awt.Color(0, 0, 0));
        lblAgendamento.setText("Agendamento");
        lblAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgendamentoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgendamentoVoltarCor(evt);
                lblAgendamentoMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgendamentoAlterarCadastroVoltarCor1(evt);
            }
        });

        lblConsultas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblConsultas.setForeground(new java.awt.Color(0, 0, 0));
        lblConsultas.setText("Histórico");
        lblConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConsultasMudaCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConsultasVoltaCor(evt);
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
                lblAlterarCadastroMudarCor(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlterarCadastroVoltarCor(evt);
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
                    .addComponent(lblAlterarCadastro)
                    .addComponent(lblConsultas)
                    .addComponent(lblDashboard)
                    .addComponent(lblAgendamento))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblDashboard)
                .addGap(35, 35, 35)
                .addComponent(lblAgendamento)
                .addGap(35, 35, 35)
                .addComponent(lblConsultas)
                .addGap(35, 35, 35)
                .addComponent(lblAlterarCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(lblSair)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 180, 660));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

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

        panelDashboard.setBackground(new java.awt.Color(51, 51, 51));

        tblConsultasAgendadasDashboard.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID da consulta", "Nome do médico", "Data", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tblConsultasAgendadasDashboard);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultas Agendadas:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Perfil");

        jPanel4.setBackground(new java.awt.Color(40, 40, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CPF:");

        txtPerfilId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPerfilId.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilIdActionPerformed(evt);
            }
        });

        txtPerfilCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPerfilCpf.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilCpfActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nome:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID:");

        txtPerfilNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtPerfilNome.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerfilNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPerfilCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(137, 137, 137))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtPerfilId, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(txtPerfilNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(632, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPerfilCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(txtPerfilId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(txtPerfilNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelDashboardLayout = new javax.swing.GroupLayout(panelDashboard);
        panelDashboard.setLayout(panelDashboardLayout);
        panelDashboardLayout.setHorizontalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDashboardLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panelDashboardLayout.setVerticalGroup(
            panelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDashboardLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(panelDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 1100, 660));

        panelAgendamento.setBackground(new java.awt.Color(51, 51, 51));

        tblMedicosAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Especialidade", "Disponibilidade presencial"
            }
        ));
        jScrollPane3.setViewportView(tblMedicosAgendamento);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Especialidade:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome do médico:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horário:");

        cmbAgendamentoHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Escolha o horário --", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "14:30", "15:00", "15:30", "16:00" }));

        btnAgendamentoAgendar.setText("Agendar");
        btnAgendamentoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentoAgendarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Data:");

        txtAgendamentoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgendamentoDataActionPerformed(evt);
            }
        });

        cmbAgendamentoEspecialidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Escolha a especialidade --", "cardiologista", "neurologista", "pediatra", "ortopedista", "otorrinolaringologista", "clínico geral" }));
        cmbAgendamentoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAgendamentoEspecialidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgendamentoLayout = new javax.swing.GroupLayout(panelAgendamento);
        panelAgendamento.setLayout(panelAgendamentoLayout);
        panelAgendamentoLayout.setHorizontalGroup(
            panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendamentoLayout.createSequentialGroup()
                .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgendamentoLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnAgendamentoAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAgendamentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(txtAgendamentoData, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAgendamentoLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(cmbAgendamentoHorario, 0, 245, Short.MAX_VALUE)
                            .addComponent(txtAgendamentoMedico)
                            .addComponent(cmbAgendamentoEspecialidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelAgendamentoLayout.setVerticalGroup(
            panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgendamentoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(panelAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAgendamentoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAgendamentoEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgendamentoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAgendamentoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAgendamentoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgendamentoAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(panelAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 1100, 660));

        panelConsultas.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(955, 2000));

        tblConsultasAgendadasHistórico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID da consulta", "Nome do médico", "Data", "Hora"
            }
        ));
        jScrollPane6.setViewportView(tblConsultasAgendadasHistórico);

        jScrollPane19.setViewportView(txtBuscarConsultas);

        btnBuscarConsultas.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarConsultas.setText("Buscar");
        btnBuscarConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConsultasActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Consultas:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
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
                        .addComponent(btnBuscarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1523, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel3);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Histórico:");

        javax.swing.GroupLayout panelConsultasLayout = new javax.swing.GroupLayout(panelConsultas);
        panelConsultas.setLayout(panelConsultasLayout);
        panelConsultasLayout.setHorizontalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConsultasLayout.createSequentialGroup()
                .addGroup(panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConsultasLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelConsultasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panelConsultasLayout.setVerticalGroup(
            panelConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConsultasLayout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(panelConsultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 1100, 660));

        panelAlterarCadastro.setBackground(new java.awt.Color(51, 51, 51));

        jLabel7.setText("Nome");

        jLabel8.setText("CPF");

        txtCpfP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfPActionPerformed(evt);
            }
        });

        jLabel9.setText("Data nascimento");

        jLabel10.setText("Endereço");

        jLabel12.setText("E-mail");

        jLabel13.setText("Telefone");

        pswSenhaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaPActionPerformed(evt);
            }
        });

        jLabel14.setText("Senha");

        btnCadastrarP.setText("Cadastrar");
        btnCadastrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Seu Cadastro");

        jLabel17.setText("Cidade");

        btnExcluirP.setText("Excluir");
        btnExcluirP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPActionPerformed(evt);
            }
        });

        jLabel18.setText("Id:");

        javax.swing.GroupLayout panelAlterarCadastroLayout = new javax.swing.GroupLayout(panelAlterarCadastro);
        panelAlterarCadastro.setLayout(panelAlterarCadastroLayout);
        panelAlterarCadastroLayout.setHorizontalGroup(
            panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAlterarCadastroLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExcluirP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEndP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNascP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCpfP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNomeP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmailP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTelefoneP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pswSenhaP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCidadeP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(74, 74, 74))
            .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAlterarCadastroLayout.setVerticalGroup(
            panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCidadeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpfP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNascP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(pswSenhaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelAlterarCadastroLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtEmailP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTelefoneP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(panelAlterarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        getContentPane().add(panelAlterarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 1100, 660));

        setSize(new java.awt.Dimension(1296, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        panelAgendamento.setVisible(false);
        panelAlterarCadastro.setVisible(false);
        panelConsultas.setVisible(false);
        panelDashboard.setVisible(true);
        listarConsultasPaciente();
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void lblDashboardDashboardMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardDashboardMudarCor
        lblDashboard.setForeground(Color.blue);
    }//GEN-LAST:event_lblDashboardDashboardMudarCor

    private void lblDashboardDashboardVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardDashboardVoltarCor
        lblDashboard.setForeground(Color.black);
    }//GEN-LAST:event_lblDashboardDashboardVoltarCor

    private void lblAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendamentoMouseClicked
        panelAlterarCadastro.setVisible(false);
        panelConsultas.setVisible(false);
        panelDashboard.setVisible(false);
        panelAgendamento.setVisible(true);
        listarMedicosAgendamento();
    }//GEN-LAST:event_lblAgendamentoMouseClicked

    private void lblAgendamentoVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendamentoVoltarCor
        lblAgendamento.setForeground(Color.black);
    }//GEN-LAST:event_lblAgendamentoVoltarCor

    private void lblAgendamentoMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendamentoMudarCor
        lblAgendamento.setForeground(Color.blue);
    }//GEN-LAST:event_lblAgendamentoMudarCor

    private void lblAgendamentoAlterarCadastroVoltarCor1(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendamentoAlterarCadastroVoltarCor1
        lblAgendamento.setForeground(Color.black);
    }//GEN-LAST:event_lblAgendamentoAlterarCadastroVoltarCor1

    private void lblConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultasMouseClicked
        panelAgendamento.setVisible(false);
        panelAlterarCadastro.setVisible(false);
        panelDashboard.setVisible(false);
        panelConsultas.setVisible(true);
        listarConsultasHistórico();
    }//GEN-LAST:event_lblConsultasMouseClicked

    private void lblAlterarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarCadastroMouseClicked
        panelAgendamento.setVisible(false);
        panelConsultas.setVisible(false);
        panelDashboard.setVisible(false);
        panelAlterarCadastro.setVisible(true);

    }//GEN-LAST:event_lblAlterarCadastroMouseClicked

    private void lblAlterarCadastroMudarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarCadastroMudarCor
        lblAlterarCadastro.setForeground(Color.blue);
    }//GEN-LAST:event_lblAlterarCadastroMudarCor

    private void lblAlterarCadastroVoltarCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarCadastroVoltarCor
        lblAlterarCadastro.setForeground(Color.black);
    }//GEN-LAST:event_lblAlterarCadastroVoltarCor

    private void lblConsultasMudaCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultasMudaCor
        lblConsultas.setForeground(Color.blue);
    }//GEN-LAST:event_lblConsultasMudaCor

    private void lblConsultasVoltaCor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultasVoltaCor
        lblConsultas.setForeground(Color.black);
    }//GEN-LAST:event_lblConsultasVoltaCor

    private void pswSenhaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaPActionPerformed

    private void btnCadastrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPActionPerformed
        dadosPacienteLogado.setNome(txtNomeP.getText());
        dadosPacienteLogado.setEndereco(txtEndP.getText());
        dadosPacienteLogado.setCidade(txtCidadeP.getText());
        dadosPacienteLogado.setEmail(txtEmailP.getText());
        dadosPacienteLogado.setTelefone(txtTelefoneP.getText());
        dadosPacienteLogado.setSenha(pswSenhaP.getText());

        try {
            bd.alterarUsuarioPaciente(dadosPacienteLogado);
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuMedico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCadastrarPActionPerformed

    private void txtCpfPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfPActionPerformed

    private void btnBuscarConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConsultasActionPerformed
        String idPaci, idCons;
        idPaci = dadosPacienteLogado.getId();
        idCons = txtBuscarConsultas.getText();
        
        try {
            ResultSet consultasHistórico = bd.buscarConsultasHistórico(idPaci, idCons);
            DefaultTableModel tblConsultas = (DefaultTableModel) tblConsultasAgendadasHistórico.getModel();
            tblConsultas.setRowCount(0);
            while (consultasHistórico.next()) {
                String linha[] = {
                    consultasHistórico.getString("id_consulta"),
                    consultasHistórico.getString("fk_nome_medico"),
                    consultasHistórico.getString("data_consulta"),
                    consultasHistórico.getString("hora_consulta")
                };
                tblConsultas.addRow(linha);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarConsultasActionPerformed

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

    private void txtPerfilIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilIdActionPerformed

    private void txtPerfilCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilCpfActionPerformed

    private void btnExcluirPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPActionPerformed
        try {
            bd.excluirUsuarioPaciente(cpfPacienteLogado);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
            new Login().setVisible(true);
            dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirPActionPerformed

    private void txtPerfilNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerfilNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerfilNomeActionPerformed

    private void txtAgendamentoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgendamentoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgendamentoDataActionPerformed

    private void cmbAgendamentoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAgendamentoEspecialidadeActionPerformed
        String e;
        e = cmbAgendamentoEspecialidade.getSelectedItem().toString();
        if (e.equals("-- Escolha a especialidade --")) {
            listarMedicosAgendamento();
            return;
        }

        try {
            ResultSet medicosListagem = bd.listarMedicosAgendamentoEspecialidade(e);
            DefaultTableModel tblMedicos = (DefaultTableModel) tblMedicosAgendamento.getModel();
            tblMedicos.setRowCount(0);
            while (medicosListagem.next()) {
                String linha[] = {
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
    }//GEN-LAST:event_cmbAgendamentoEspecialidadeActionPerformed

    private void btnAgendamentoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentoAgendarActionPerformed
        String id, nome, data, hora;
        id = dadosPacienteLogado.getId();
        nome = txtAgendamentoMedico.getText();
        data = txtAgendamentoData.getText();
        hora = (String) cmbAgendamentoHorario.getSelectedItem();
        try {
            ResultSet consulta = bd.agendarConsultaPaciente(nome, data, hora);
            if (consulta.next() == true) {
                JOptionPane.showMessageDialog(null, "horário indisponível.");
            } else {
                bd.agendarConsulta(id, nome, data, hora);
                JOptionPane.showMessageDialog(null, "consulta agendada.");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgendamentoAgendarActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendamentoAgendar;
    private javax.swing.JButton btnBuscarConsultas;
    private javax.swing.JButton btnCadastrarP;
    private javax.swing.JButton btnExcluirP;
    private javax.swing.JComboBox<String> cmbAgendamentoEspecialidade;
    private javax.swing.JComboBox<String> cmbAgendamentoHorario;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblAgendamento;
    private javax.swing.JLabel lblAlterarCadastro;
    private javax.swing.JLabel lblConsultas;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblSair;
    private javax.swing.JPanel panelAgendamento;
    private javax.swing.JPanel panelAlterarCadastro;
    private javax.swing.JPanel panelConsultas;
    private javax.swing.JPanel panelDashboard;
    private javax.swing.JPasswordField pswSenhaP;
    private javax.swing.JTable tblConsultasAgendadasDashboard;
    private javax.swing.JTable tblConsultasAgendadasHistórico;
    private javax.swing.JTable tblMedicosAgendamento;
    private javax.swing.JTextField txtAgendamentoData;
    private javax.swing.JTextField txtAgendamentoMedico;
    private javax.swing.JTextPane txtBuscarConsultas;
    private javax.swing.JTextField txtCidadeP;
    private javax.swing.JTextField txtCpfP;
    private javax.swing.JTextField txtEmailP;
    private javax.swing.JTextField txtEndP;
    private javax.swing.JTextField txtIdPaciente;
    private javax.swing.JTextField txtNascP;
    private javax.swing.JTextField txtNomeP;
    private javax.swing.JTextField txtPerfilCpf;
    private javax.swing.JTextField txtPerfilId;
    private javax.swing.JTextField txtPerfilNome;
    private javax.swing.JTextField txtTelefoneP;
    // End of variables declaration//GEN-END:variables
}
