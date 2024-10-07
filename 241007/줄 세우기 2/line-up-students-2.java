import java.util.*;
class Student {
    int h;
    int w;
    int idx;

    public Student(int h, int w, int idx) {
        this.h = h;
        this.w = w;
        this.idx = idx;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(students, (a, b) -> a.h == b.h ? b.w - a.w : a.h - b.h);

        for (int i = 0; i < n; i++) {
            System.out.println(students[i].h + " " + students[i].w + " " + students[i].idx);
        }
    }
}