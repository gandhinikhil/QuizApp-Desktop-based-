
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
   
    private static Connection conn;
    static{
        
        try{
  
        Class.forName("com.mysql.cj.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam",
            "root", "admin");
            JOptionPane.showMessageDialog(null,"connected successfully"); 
            
        }    catch(Exception ex)
             {
                 System.out.println("Error in DAO");
             }  
        
    }      
    public static Connection getconnection()
    {
       return conn;
       
    }
          public static void closeconnection()
          {
    try
     {
        conn.close();
        System.exit(0);
    }
    catch(Exception e)
    {
       JOptionPane.showMessageDialog(null,"cannot close connection "); 
       e.printStackTrace();
    }
    }
}
    

