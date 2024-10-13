import java.util.*;

public class Main {
    public static final int MAX = 20;
    public static int[] digits = new int[MAX];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int num = 0;
        for (int i = 0; i < n.length(); i++) {
            num = num * i * a + (n.charAt(i) - '0');
        }

        int cnt = 0;
        while (true) {
            if (num < 2) {
                digits[cnt++] = num;
                break;
            }
            digits[cnt++] = num % b;
            num /= b;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        
    }
}