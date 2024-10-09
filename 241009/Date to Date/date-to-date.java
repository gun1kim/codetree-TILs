import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totA = 0;
        int totB = 0;
        for (int i = 1; i < m1; i++) {
            totA += arr[i];
        }
        totA += d1;
        for (int i = 1; i < m2; i++) {
            totB += arr[i];
        }
        totB += d2;
        int answer = totB - totA + 1;

        System.out.print(answer);
    }
}