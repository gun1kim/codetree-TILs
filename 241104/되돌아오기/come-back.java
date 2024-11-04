import java.util.*;

public class Main {
    public static int[] dx = {0, -1, 0, 1};
    public static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[1001][1001];
        int x = 0, y = 0;
        int answer = -1;
        int time = 0;
         
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int distance = sc.nextInt();
            int dir = 0;
            if (d == 'W') {
                dir = 0;
            }
            else if (d == 'N') {
                dir = 1;
            }
            else if (d == 'E') {
                dir = 2;
            }
            else if (d == 'S') {
                dir = 3;
            }
            for (int j = 0; j < distance; j++) {
                x += dx[dir];
                y += dy[dir];
                time += 1;
                if (x == 0 && y == 0 && answer == -1) {
                    answer = time;
                }
            }
        }

        System.out.print(answer);
        
    }
}