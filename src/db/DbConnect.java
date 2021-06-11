
package db;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/expensedb"+"?useSSL=false","root","admin123");
             st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);}
    }
}
