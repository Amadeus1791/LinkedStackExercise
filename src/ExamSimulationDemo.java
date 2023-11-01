import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class ExamSimulationDemo {
    public static void main(String[] args) {
        LinkedStackCustom<Exam> stack = new LinkedStackCustom<>();
        Exam exam1 = new Exam(new Student("Mueller",1234), "Typescript 2", LocalDateTime.of(2023,9,12,4,21));
        Exam exam2 = new Exam(new Student("Bauer",4563), "C++ 1", LocalDateTime.of(2023,12,10,3,1));
        Exam exam3 = new Exam(new Student("Schneider",8639), "Typescript 2", LocalDateTime.of(2023,9,12,4,21));
        Exam exam4 = new Exam(new Student("Maier",6590), "Java programming", LocalDateTime.of(2023,9,10,7,21));
        Exam exam5 = new Exam(new Student("Auer",4583), "Java programming", LocalDateTime.of(2023,9,10,7,21));
        Exam exam6 = new Exam(new Student("Zimmer",6469), "C++ 1", LocalDateTime.of(2023,9,10,7,21));
        System.out.println(Exam.getNumbOfExamsCreated()+ " exams have been created");
        System.out.println("=========================");
        System.out.println("We build now the stack of exams ...");
        stack.pushAll(List.of(exam1,exam2,exam3,exam4,exam5,exam6));

        System.out.println(stack);
        System.out.println("=========================");
        System.out.println("now the professor corrects a random amount of tests:");

        final List<Exam> exams = stack.popRandomValues();
        System.out.println(exams);
        System.out.println("the professor corrected " + exams.size()+ " exam(s)");
        System.out.println("now there are still "+ stack.getSize()+ " exam(s) to correct");
        System.out.println("Maybe he will have time tomorrow again");
        System.out.println("ByeBye 😊");

        // also don't forget to test the same output with an array
        System.out.println(Arrays.toString(stack.toArray()));

        stack.clearAll();


    }


}
