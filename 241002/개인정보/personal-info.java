import java.util.*;
class Person {
    String name;
    int h;
    double w;
    public Person(String name, int h, double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persons = new Person[5];
        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int h = sc.nextInt();
            double w = sc.nextDouble();
            persons[i] = new Person(name, h, w);
        }

        Arrays.sort(persons, Comparator.comparing(a -> a.name));
        System.out.println("name");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", persons[i].name, persons[i].h, persons[i].w);
        }

        System.out.println();
        System.out.println("height");
        Arrays.sort(persons, (a, b) -> b.h - a.h);
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d %.1f\n", persons[i].name, persons[i].h, persons[i].w);
        }
    }
}