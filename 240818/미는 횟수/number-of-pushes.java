import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int n = -1;

        for (int i = 0; i < a.length(); i++) {
            a = a.substring(a.length()-1, a.length()) + a.substring(0, a.length()-1);
            if (a.compareTo(b) == 0) {
                n = i + 1;
            }
        }

        System.out.println(n);
    }
}