/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * 
 */
import java.sql.Connection; // conectar com BD
import java.sql.DriverManager; // informar nome do BD, usuário e senha.
import java.sql.PreparedStatement; // executa o SQL Insert, comando que insere os dados na tabela
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author enzo.gpelizaro
 */
public class BDconect {

    static Connection conectar() {
        Connection conect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "");
            return conectar;
        } catch (SQLException ex) {
            Logger.getLogger(BDconect.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: "+ ex.getMessage());
            return conect;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDconect.class.getName()).log(Level.SEVERE, null, ex);
            return conect;
        }
    }
}
