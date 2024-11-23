import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minDistance = Integer.MAX_VALUE;

        for (int start = 0; start < n; start++) {
            int cur = 0;
            for (int i = 0; i < n; i++) {
                int distance = (i - start + n) % n;
                cur += distance * arr[i];
            }

            minDistance = Math.min(minDistance, cur);
        }

        System.out.print(minDistance);
    }
}