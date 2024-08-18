import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        int result = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (a.compareTo(s) == 0) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}