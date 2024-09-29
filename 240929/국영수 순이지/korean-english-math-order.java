import java.util.*;
class Student {
    String name;
    int kor;
    int eng;
    int math;
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public void print() {
        System.out.println(this.name + " " + this.kor + " " + this.eng + " " + this.math);
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

        Arrays.sort(students, (a, b) -> {
            if (b.kor != a.kor) {
                return b.kor - a.kor;
            }
            if (b.eng != a.eng) {
                return b.eng - a.eng;
            }

            return b.math - a.math;
        });

        for (int i = 0; i < n; i++) {
            students[i].print();
        }
    }
}