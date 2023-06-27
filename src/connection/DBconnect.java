/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Ishan
 */
public class DBconnect {
    
    public static Connection connect()
    {
        Connection conn = null;
        
                try {
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","");
                    
                } catch (Exception e){
                
                }
        
        return conn;
    }
    
}
