import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j <= b; j++) {
                arr[j] += 1;
            }
        }

        int max = 0;
        for (int i = 1; i < n + 1; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.print(max);
    }
}