import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int s1;
    int s2;
    int s3;

    public Student(String name, int s1, int s2, int s3) {
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public int compareTo(Student s) {
        return (this.s1 + this.s2 + this.s3) - (s.s1 + s.s2 + s.s3);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " + students[i].s1 + " " + students[i].s2 + " " + students[i].s3);
        }
    }
}