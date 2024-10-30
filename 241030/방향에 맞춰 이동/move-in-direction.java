import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};
        int x = 0, y = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int d = sc.nextInt();
            if (dir == 'N') {
                for (int j = 0; j < d; j++) {
                    x += dx[3];
                    y += dy[3];
                }
            }
            else if (dir == 'S') {
                for (int j = 0; j < d; j++) {
                    x += dx[1];
                    y += dy[1];
                }
            }
            else if (dir == 'W') {
                for (int j = 0; j < d; j++) {
                    x += dx[2];
                    y += dy[2];
                }
            }
            else if (dir == 'E') {
                for (int j = 0; j < d; j++) {
                    x += dx[0];
                    y += dy[0];
                }
            }
        }

        System.out.print(x + " " + y);
    }
}