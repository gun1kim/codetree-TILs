import java.util.*;

public class Main {
    public static int n;
    public static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = arr[i][0] - arr[j][0];
                int dy = arr[i][1] - arr[j][1];

                int distance = dx * dx + dy * dy;
                answer = Math.min(answer, distance);
            }
        }

        System.out.print(answer);
    }
}