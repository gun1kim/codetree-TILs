import java.util.*;

public class Main {
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0, y = 0;
        int dir = 0;
        int time = 0;
        int answer = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'F') {
                x += dx[dir];
                y += dy[dir];
                time += 1;
                if (x == 0 && y == 0 && answer == -1) {
                    answer = time;
                }
            }
            else if (c == 'R') {
                dir = (dir + 1) % 4;
                time += 1;
            }

            else if (c == 'L') {
                dir = (dir - 1) % 4;
                time += 1;
            }
        }
        System.out.print(answer);
    }
}