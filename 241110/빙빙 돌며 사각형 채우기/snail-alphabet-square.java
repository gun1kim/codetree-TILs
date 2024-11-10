import java.util.*;

public class Main {
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0; 
        int y = 0;
        int dir = 0;
        char[][] arr = new char[n][m];
        char[] abc = new char[26];
        for(int i = 0; i < abc.length; i++) {
            abc[i] = (char)(i + 65);
        }
        int num = 0; 
        while (num < n * m) {
            arr[x][y] = (char)('A' + (num % 26));
            num++;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != '\0') {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}