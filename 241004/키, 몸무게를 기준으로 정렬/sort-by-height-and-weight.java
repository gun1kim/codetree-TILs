import java.util.*;
class Person {
    String name;
    int h;
    int w; 
    
    public Person(String name, int h, int w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            persons[i] = new Person(sc.next(), sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(persons, new Comparator<Person>(){
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.h == p2.h) {
                    return p2.w - p1.w;
                }
                return p1.h - p2.h;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(persons[i].name + " " + persons[i].h + " "  + persons[i].w);
        }
    }
}