package dao;

/**
 * @author enzo.gpelizaro
 */
import entities.Medico;
import entities.Paciente;
import java.sql.*;

/**
 *
 * @author EEEenxxeee
 */
public class PlataformaDao {

    Connection conectar;

    private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/piCrud", "root", "");
    }

    //telas de login
    public ResultSet loginMedico(Medico loginMedico) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM medico WHERE crm=? AND senha=?");
        st.setString(1, loginMedico.getCrm());
        st.setString(2, loginMedico.getSenha());
        ResultSet login = st.executeQuery();
        return login;
    }

    public ResultSet loginPaciente(Paciente loginPaciente) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM paciente WHERE cpf=? AND senha=?");
        st.setString(1, loginPaciente.getCpf());
        st.setString(2, loginPaciente.getSenha());
        ResultSet login = st.executeQuery();
        return login;
    }

    //telas de cadastro
    public void cMedico(Medico cadastroMedico) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("INSERT INTO medico VALUES(?,?,?,?,?,?,?,?,?)");
        st.setString(1, cadastroMedico.getCrm());
        st.setString(2, cadastroMedico.getNome());
        st.setString(3, cadastroMedico.getCpf());
        st.setString(4, cadastroMedico.getEspecialide());
        st.setString(5, cadastroMedico.getDataNascimento());
        st.setString(6, cadastroMedico.getCidadeAtuacao());
        st.setString(7, cadastroMedico.getEmail());
        st.setString(8, cadastroMedico.getTelefone());
        st.setString(9, cadastroMedico.getSenha());
        st.executeUpdate();
    }

    public void cPaciente(Paciente cadastroPaciente) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("INSERT INTO paciente (nome, cpf, data_nascimento, endereco, cidade, email, telefone, senha) VALUES(?,?,?,?,?,?,?,?)");
        st.setString(1, cadastroPaciente.getNome());
        st.setString(2, cadastroPaciente.getCpf());
        st.setString(3, cadastroPaciente.getDataNascimento());
        st.setString(4, cadastroPaciente.getEndereco());
        st.setString(5, cadastroPaciente.getCidade());
        st.setString(6, cadastroPaciente.getEmail());
        st.setString(7, cadastroPaciente.getTelefone());
        st.setString(8, cadastroPaciente.getSenha());
        st.executeUpdate();
    }

    //pegar informações do médico logado
    public ResultSet InfoMedicoLogado(Medico crmMedicoLogado) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select * from medico where crm = ?");
        st.setString(1, crmMedicoLogado.getCrm());
        ResultSet medicoLogado = st.executeQuery();
        return medicoLogado;
    }

    //menu médico
    public void alterarUsuarioMedico(Medico dadosMedicoLogado) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("UPDATE medico SET nome = ? , especialidade = ?, data_nascimento = ?, cidade_atuacao = ?, email = ?, telefone = ?, senha = ? WHERE crm = ?");
        st.setString(1, dadosMedicoLogado.getNome());
        st.setString(2, dadosMedicoLogado.getEspecialide());
        st.setString(3, dadosMedicoLogado.getDataNascimento());
        st.setString(4, dadosMedicoLogado.getCidadeAtuacao());
        st.setString(5, dadosMedicoLogado.getEmail());
        st.setString(6, dadosMedicoLogado.getTelefone());
        st.setString(7, dadosMedicoLogado.getSenha());
        st.setString(8, dadosMedicoLogado.getCrm());
        st.executeUpdate();
    }

    public void excluirUsuarioMedico(Medico crmMedicoLogado) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("delete from medico WHERE crm = ?");
        st.setString(1, crmMedicoLogado.getCrm());
        st.executeUpdate();
    }

    public ResultSet listarPacientesDashboard() throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select id_paciente, nome from paciente;");
        ResultSet pacientesDashboard = st.executeQuery();
        return pacientesDashboard;
    }
    
    public ResultSet listarConsultasAgendadasDashboard(String nome) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select id_consulta, fk_id_paciente, data_consulta, hora_consulta from consulta where fk_nome_medico = ?;");
        st.setString(1, nome);
        ResultSet consultasListagem = st.executeQuery();
        return consultasListagem;
    }

    public ResultSet listarConsultasListagem() throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select * from consulta;");
        ResultSet consultasListagem = st.executeQuery();
        return consultasListagem;
    }

    public ResultSet listarMedicosListagem() throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select crm, nome, especialidade, cidade_atuacao from medico;");
        ResultSet medicosListagem = st.executeQuery();
        return medicosListagem;
    }

    public ResultSet listarPacientesListagem() throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select id_paciente, nome, cpf, cidade from paciente;");
        ResultSet pacientesListagem = st.executeQuery();
        return pacientesListagem;
    }

    public ResultSet buscarConsultasListagem(String id) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM consulta WHERE id_consulta LIKE ?");
        st.setString(1, "%" + id + "%");
        ResultSet consultasListagem = st.executeQuery();
        return consultasListagem;
    }

    public ResultSet buscarMedicosListagem(String crm) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM medico WHERE crm LIKE ?");
        st.setString(1, "%" + crm + "%");
        ResultSet medicosListagem = st.executeQuery();
        return medicosListagem;
    }

    public ResultSet buscarPacientesListagem(String id) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM paciente WHERE id_paciente LIKE ?");
        st.setString(1, "%" + id + "%");
        ResultSet pacientesListagem = st.executeQuery();
        return pacientesListagem;
    }
    
    public ResultSet buscarConsultasConsultas (String nome, String idCons) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select id_consulta, fk_id_paciente , data_consulta, hora_consulta from consulta where fk_nome_medico = ? and id_consulta = ?;");
        st.setString(1, nome);
        st.setString(2, idCons);
        ResultSet buscarHistórico = st.executeQuery();
        return buscarHistórico;
    }

    //menu paciente
    public ResultSet InfoPacienteLogado(Paciente cpfPacienteLogado) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select * from paciente where cpf = ?");
        st.setString(1, cpfPacienteLogado.getCpf());
        ResultSet pacienteLogado = st.executeQuery();
        return pacienteLogado;
    }

    public void alterarUsuarioPaciente(Paciente dadosPacienteLogado) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("UPDATE paciente SET nome = ? , data_nascimento = ?, endereco = ?, cidade = ?, email = ?, telefone = ?, senha = ? WHERE cpf = ?");
        st.setString(1, dadosPacienteLogado.getNome());
        st.setString(2, dadosPacienteLogado.getDataNascimento());
        st.setString(3, dadosPacienteLogado.getEndereco());
        st.setString(4, dadosPacienteLogado.getCidade());
        st.setString(5, dadosPacienteLogado.getEmail());
        st.setString(6, dadosPacienteLogado.getTelefone());
        st.setString(7, dadosPacienteLogado.getSenha());
        st.setString(8, dadosPacienteLogado.getCpf());
        st.executeUpdate();
    }

    public void excluirUsuarioPaciente(Paciente cpfPacienteLogado) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("delete from paciente WHERE cpf = ?");
        st.setString(1, cpfPacienteLogado.getCpf());
        st.executeUpdate();
    }

    public ResultSet listarMedicosAgendamento() throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select nome, especialidade, cidade_atuacao from medico;");
        ResultSet medicosListagem = st.executeQuery();
        return medicosListagem;
    }

    public ResultSet listarMedicosAgendamentoEspecialidade(String e) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select nome, especialidade, cidade_atuacao from medico where especialidade = ?;");
        st.setString(1, e);
        ResultSet medicosListagem = st.executeQuery();
        return medicosListagem;
    }

    public ResultSet agendarConsultaPaciente(String nome, String data, String hora) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM consulta WHERE fk_nome_medico = ? AND data_consulta = ? AND hora_consulta = ?");
        st.setString(1, nome);
        st.setString(2, data);
        st.setString(3, hora);
        ResultSet consulta = st.executeQuery();
        return consulta;
    }
    
    public void agendarConsulta (String id, String nome, String data, String hora) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("insert into consulta(fk_id_paciente, fk_nome_medico, data_consulta, hora_consulta) values (?, ?, ?, ?);");
        st.setString(1, id);
        st.setString(2, nome);
        st.setString(3, data);
        st.setString(4, hora);
        st.executeUpdate();
    }
    
    public ResultSet listarConsultasDashboard(String id) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select id_consulta, fk_nome_medico, data_consulta, hora_consulta from consulta where fk_id_paciente = ?;");
        st.setString(1, id);
        ResultSet consultasListagem = st.executeQuery();
        return consultasListagem;
    }
    
    public ResultSet buscarConsultasHistórico (String idPaci, String idCons) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("select id_consulta, fk_nome_medico, data_consulta, hora_consulta from consulta where fk_id_paciente = ? and id_consulta = ?;");
        st.setString(1, idPaci);
        st.setString(2, idCons);
        ResultSet buscarHistórico = st.executeQuery();
        return buscarHistórico;
    }

}
