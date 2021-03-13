
package techquizapp.pojo;


public class Exam {
    private String ExamId;
    private String language;
    private int totalQuestions;

    public String getExamId() {
        return ExamId;
    }

    public String getLanguage() {
        return language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public Exam(String ExamId, String language, int totalQuestions) {
        this.ExamId = ExamId;
        this.language = language;
        this.totalQuestions = totalQuestions;
    }
    
}
