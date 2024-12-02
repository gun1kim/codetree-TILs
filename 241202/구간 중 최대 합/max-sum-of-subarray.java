import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n - k; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < i + k; j++) {
                sum += arr[j];
            }
            answer = Math.max(answer, sum);
        }

        System.out.print(answer);
    }
}