
package javadbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaDBC3 {
    public JavaDBC3(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/os_40", "root", "agh149agh");
            PreparedStatement stm=con.prepareStatement("delete from students where student_id = ?");
            stm.setInt(1, 8);
            int rs=stm.executeUpdate();
            stm.close();
            con.close();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
     public static void main(String[] args) {
       JavaDBC3 jdb=new JavaDBC3();
    }
    
    
}
