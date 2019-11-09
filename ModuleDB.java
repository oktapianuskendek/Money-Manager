
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class ModuleDB {
    public static int idUser;
    public static String username;
    public static String nama;
    public static String password;
    public static Connection connectDB(){
       
        String path;
        
        path = "jdbc:sqlite:/Users/kendoctofian/Documents/Kuliah/RPL/src/student_money_manager.db";
        
        
        Connection con=null;
        try{
            con=DriverManager.getConnection(path);
        }
        catch(SQLException e){
            showMessageDialog(null,"Koneksi ke database gagal!","Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}









