import java.util.*;

public class Main {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }

        int k = sc.nextInt();
        int x = 0, y = 0, dir = 0;
        // 위 -> 아래 
        if (k <= n) {
            x = 0;
            y = k - 1;
            dir = 2;
        }
        // 우 -> 좌
        else if (k <= 2 * n) {
            x = n - (k - n);
            y = n - 1;
            dir = 3;
        }
        // 아래 -> 위
        else if (k <= 3 * n) {
            x = n - 1;
            y = n - (k - n * 2);
            dir = 0;
        }
        // 좌 -> 우
        else {
            x = n - (k - n * 3);
            y = 0;
            dir = 1;
        }

        int answer = 0;
        while (x >= 0 && x < n && y >= 0 && y < n) {
            if (arr[x][y] == '/') {
                dir = (1 - dir);
            }
            else if (arr[x][y] == '\\') {
                dir = (3 - dir);
            }
            answer += 1;

            x += dx[dir];
            y += dy[dir];
        }
        
        System.out.print(answer);
    }
}