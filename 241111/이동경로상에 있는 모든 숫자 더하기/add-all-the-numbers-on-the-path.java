import java.util.*;

public class Main {
    // 북 서 남 동
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, -1, 0, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int answer = 0;
        int x = n / 2;
        int y = n / 2;
        answer += arr[x][y];
        int dir = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                dir = (dir + 1) % 4;
            }
            else if (c == 'R') {
                dir = (dir + 3) % 4;
            }
            else if (c == 'F') {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    x = nx;
                    y = ny;
                    answer += arr[x][y];
                }
            }
        }
        System.out.print(answer);
    }
}