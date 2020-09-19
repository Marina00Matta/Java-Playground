/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadbc;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmed
 */
public class JavaDBC {

    public JavaDBC(){
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/os_40","root","agh149agh");
            Statement stmt=con.createStatement();
            String queryString=new String("select * from students");
            ResultSet rs=stmt.executeQuery(queryString);
            while(rs.next()){
                System.out.println(rs.getString("last_name"));
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
       JavaDBC jdb=new JavaDBC();
    }
    
}
