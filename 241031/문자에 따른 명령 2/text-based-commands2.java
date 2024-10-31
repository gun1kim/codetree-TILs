import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0;
        int dir = 0;
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                dir = (dir + 3) % 4;
            }
            else if (s.charAt(i) == 'R') {
                dir = (dir + 1) % 4;
            }
            else if (s.charAt(i) == 'F') {
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.print(x + " " + y);
    }
}