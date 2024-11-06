import java.util.*;

public class Main {
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            arr[r][c] = 1;
            int count = 0;
            for (int j = 0; j < 4; j++) {
                int nr = r + dx[j];
                int nc = c + dy[j];
                if (nr > 0 && nr <= n && nc > 0 && nc <= n && arr[nr][nc] == 1) {
                    count += 1;
                }
            }
            if (count == 3) {
                System.out.println(1);
            }
            else { 
                System.out.println(0);
            }
        }
    }
}