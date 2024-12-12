import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = n * n * n;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++){
                    if (Math.abs(i - a) <= 2 || Math.abs(j - b) <= 2 || Math.abs(k - c) <= 2) {
                        answer -= 1;
                    }
                }
            }
        }
        System.out.print(answer);
    }
}