public class Student {
    String lastName;
    int studentId;

    public Student(String lastName, int studentId) {
        this.lastName = lastName;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
