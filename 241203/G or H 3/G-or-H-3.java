import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'G') {
                arr[p] = 1;
            }
            else if(c == 'H') {
                arr[p] = 2;
            }
        }
        int answer = Integer.MIN_VALUE;

        for (int i = 1; i <= 10000 - k; i++) {
            int sum = 0;
            for (int j = i; j <= i + k; j++) {
                sum += arr[j];
            }
            answer = Math.max(answer, sum);
        }
        System.out.print(answer);
    }
}