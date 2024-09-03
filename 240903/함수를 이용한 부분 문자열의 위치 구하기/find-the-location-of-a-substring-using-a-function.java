import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String n = sc.next();
        int index = m.indexOf(n);
        System.out.print(index);
    }
}