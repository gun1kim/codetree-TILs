import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int r = sc.nextInt();
        int c = sc.nextInt();
        char d = sc.next().charAt(0);
        int dx = 0, dy = 0;

        if (d == 'L') {
            dx = 0;
            dy = -1;
        }
        else if (d == 'R') {
            dx = 0;
            dy = 1;
        }
        else if (d == 'U') {
            dx = -1;
            dy = 0;
        }
        else if (d == 'D') {
            dx = 1; 
            dy = 0;
        }

        int x = r, y = c;
        for (int i = 0; i < t; i++) {
            int nx = x + dx;
            int ny = y + dy;

            if (nx < 1 || nx > n) {
                dx *= -1;
                continue;
            }
            if (ny < 1 || ny > n) {
                dy *= -1;
                continue;
            }

            x = nx;
            y = ny;
        }

        System.out.print(x + " " + y);
        
    }
}