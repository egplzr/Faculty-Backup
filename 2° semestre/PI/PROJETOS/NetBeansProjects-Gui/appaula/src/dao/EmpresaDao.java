package dao;


import java.sql.*;

public class EmpresaDao {

    Connection conectar;

    private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "p@$$w0rd");
    }

    public void salvarUsuario(String u, String s, String c) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("INSERT INTO usuários VALUES(?,?,?)");
        st.setString(1, u);
        st.setString(2, s);
        st.setString(3, c);
        st.executeUpdate();
    }

    public int excluirUsuario(String u) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("DELETE FROM usuários WHERE  usuario = ?");
        st.setString(1, u);
        int retorno = st.executeUpdate();
        return retorno;

    }

    public ResultSet listarUsuarios() throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM usuários");
        ResultSet usuarios = st.executeQuery();
        return usuarios;
    }

    public ResultSet listarUsuariosCargo(String c) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM usuários WHERE cargo = ?");
        st.setString(1, c);
        ResultSet usuarios = st.executeQuery();
        return usuarios;
    }

    public ResultSet buscarUsuario(String u) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM usuarios WHERE usuários LIKE ?");
        st.setString(1, "%" + u + "%");
        ResultSet usuarios = st.executeQuery();
        return usuarios;
    }

    public ResultSet logar(String u, String s) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("SELECT * FROM usuários WHERE usuario=? AND senha=?");
        st.setString(1, u);
        st.setString(2, s);
        ResultSet usuario = st.executeQuery();
        return usuario;
    }

    public void alterarUsuario(String u, String s, String c) throws ClassNotFoundException, SQLException {
        conectar();
        PreparedStatement st = conectar.prepareStatement("UPDATE usuarios SET senha = ? , cargo = ? WHERE usuario = ?");
        st.setString(1, s);
        st.setString(2, c);
        st.setString(3, u);
        st.executeUpdate();
    }

}
