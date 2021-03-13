
package techquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import techquizapp.dbutil.DBConnection;
import techquizapp.pojo.Question;
import techquizapp.pojo.QuestionStore;

public class QuestionDAO {

    public static void addQuestions(QuestionStore qstore)throws SQLException
    {
        Connection conn=DBConnection.getconnection();
        PreparedStatement ps=conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
        ArrayList<Question> questionsList=qstore.getAllQuestions();
        for(Question q:questionsList)
        {
            ps.setString(1, q.getExamId());
            ps.setInt(2, q.getQno());
            ps.setString(3, q.getQuestion());
            ps.setString(4,q.getAnswer1());
            ps.setString(5,q.getAnswer2());
            ps.setString(6,q.getAnswer3());
            ps.setString(7,q.getAnswer4());
            ps.setString(8, q.getCorrectAnswer());
            ps.setString(9,q.getLanguage());
            ps.executeUpdate();
        }
        
    }
}


