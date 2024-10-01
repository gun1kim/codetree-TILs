import java.util.*;
class Student implements Comparable<Student>{
    int h; 
    int w;
    int index;

    public Student(int h, int w, int index) {
        this.h = h;
        this.w = w;
        this.index = index;
    }

    @Override
    public int compareTo(Student s) {
        if (this.h == s.h) {
            return (s.w - this.w);
        }
        if (this.w == s.w) {
            return this.index - s.index;
        }
        return s.h - this.h;
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
        Arrays.sort(students);
        
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].h + " " + students[i].w + " " + students[i].index);
        }
    }
}