import java.util.*;

public class Main {
    public static int a;
    public static int b;
    public static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int answer = Integer.MIN_VALUE;
        
        for (int i = 0; i * a <= c; i++) {
            for (int j = 0; i * a + j * b <= c; j++) {
                int sum = i * a + j * b;
                answer = Math.max(answer, sum);
            }
        }
        System.out.print(answer);
    }
}