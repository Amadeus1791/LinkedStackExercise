import java.time.LocalDateTime;

public class Exam {
    private Student student;
    private String examName;
    private LocalDateTime dateTime;
    private static int numbOfExamsCreated;

    public Exam(Student student, String examName, LocalDateTime dateTime) {
        this.student = student;
        this.examName = examName;
        this.dateTime = dateTime;
        numbOfExamsCreated++;
    }


    @Override
    public String toString() {
        return "Exam{" +
                "student=" + student +
                ", examName='" + examName + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    public static int getNumbOfExamsCreated() {
        return numbOfExamsCreated;
    }
}
