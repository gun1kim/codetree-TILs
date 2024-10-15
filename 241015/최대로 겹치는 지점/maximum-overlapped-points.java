import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i <= 100; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][0] <= i && i <= arr[j][1]) {
                    cnt ++;
                }
            }

            max = Math.max(max, cnt);
        }

        System.out.print(max);
    }
}