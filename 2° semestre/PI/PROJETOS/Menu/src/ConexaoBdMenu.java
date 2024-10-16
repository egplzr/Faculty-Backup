/**
 * @author enzo.gpelizaro
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBdMenu {
    public static Connection conectar(){
        Connection connectionError = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova", "root","");
            return connect;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte. ERRO: "+ex.getMessage());
            return connectionError;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte. ERRO: "+ex.getMessage());
            return connectionError;
        }
        
    }
}
