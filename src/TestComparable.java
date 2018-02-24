import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student(8,"John");
        students[1] = new Student(7,"Mike");
        students[2] = new Student(9,"Bill");
        students[3] = new Student(6,"Maria");
        students[4] = new Student(15,"Yoel");
        students[5] = new Student(10,"Leo");

        Arrays.sort(students);

        for (Student s: students){
            System.out.println(s);
        }
    }
}