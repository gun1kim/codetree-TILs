import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();
        int result = -1;

        if (o.equals("+")) {
            result = a + c;    
        }
        else if (o.equals("-")) {
            result = a - c;
        }
        else if (o.equals("*")) {
            result = a * c;
        }
        else if (o.equals("/")) {
            result = a / c;
        }
        else {
            System.out.println("False");
            return;
        }
        System.out.printf("%d %s %d = %d", a, o, c, result);
    }
}