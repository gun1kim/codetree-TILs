import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                int sum = arr[i] + arr[j];
                answer = Math.max(answer, sum);
            }
        }
        System.out.print(answer);
    }
}