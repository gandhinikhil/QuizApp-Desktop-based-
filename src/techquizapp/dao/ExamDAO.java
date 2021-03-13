
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.Exam;


public class ExamDAO {
  public static String getExamId() throws SQLException
  {
      Connection conn=DBConnection.getconnection();
      Statement st=conn.createStatement();
      int count;
      ResultSet rs=st.executeQuery("select count(*) from exam"); //to get no of rows in table 
      rs.next(); //if there are no rows then also resuktset will be created and return 0
     count=rs.getInt(1);
      String newId="EX-"+(count+1);
      return newId;
  }
     public static boolean addExam(Exam exam)throws SQLException
    {
        Connection conn=DBConnection.getconnection();
        PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, exam.getExamId());
        ps.setString(2, exam.getLanguage());
        ps.setInt(3, exam.getTotalQuestions());
        int ans=ps.executeUpdate();
        return ans==1;
        
    }
}
