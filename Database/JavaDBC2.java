/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ahmed
 */
public class JavaDBC2 {

    public JavaDBC2() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/os_40","root","agh149agh");
            PreparedStatement pstm=con.prepareStatement("insert into students (student_id,first_name,last_name,gender,birth_date) values (?,?,?,?,'1999-10-10')");
            pstm.setInt(1, 8);
            pstm.setString(2, "Ali");
            pstm.setString(3, "mohamed");
            pstm.setString(4, "male");
          
            int rs=pstm.executeUpdate();
            
            pstm.close();
            con.close();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
       JavaDBC2 jdb=new JavaDBC2();
    }
    
    
    
}
