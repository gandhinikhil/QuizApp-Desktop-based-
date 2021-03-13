
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.User;

public class UserDAO {
   
public static boolean validateUser(User user) throws SQLException
{
Connection conn=DBConnection.getconnection();
PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
    
ps.setString(1,user.getUserId());   //from pojo
ps.setString(2,user.getPassword());
ps.setString(3,user.getUserType());

ResultSet rs=ps.executeQuery();    
return rs.next();
}


}

