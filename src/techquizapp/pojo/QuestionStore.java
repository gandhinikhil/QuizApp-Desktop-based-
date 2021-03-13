
package techquizapp.pojo;

import java.util.ArrayList;
import java.util.LinkedList;

public class QuestionStore {
    ArrayList <Question> questionList;
    public QuestionStore()
    {
       questionList=new ArrayList<>();
    }
    public void addQuestion(Question q){
        questionList.add(q);
    }
    public Question getQuestion(int pos){
        return questionList.get(pos);
    }
    public void removeQuestion(int pos){
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos,Question q){
        questionList.add(pos, q);
    }
    public ArrayList<Question> getAllQuestions(){
        return questionList;
    }
    public int getCount(){
        return questionList.size();
    }
}


