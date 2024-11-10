import java.util.*;

public class Main {
    public static final int DIR_NUM = 4;
    public static final int MAX = 1000;
    
    public static int n;
    public static char[][] arr = new char[MAX][MAX];
    
    public static int startNum;
    public static int x, y, dir;

    public static void initialize(int num) {
        if (num <= n) {
            x = 0;
            y = num - 1;
            dir = 0;
        }
        else if (num <= 2 * n) {
            x = num - n - 1;
            y = n - 1;
            dir = 1;
        }
        else if (num <= 3 * n) {
            x = n - 1;
            y = n - (num - 2 * n);
            dir = 2;
        }
        else {
            x = n - (num - 3 * n);
            y = 0;
            dir = 3;
        }
    }

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void move(int nextDir) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        x += dx[nextDir];
        y += dy[nextDir];
        dir = nextDir;
    }

    public static int simulate() {
        int moveNum = 0;
        while (inRange(x, y)) {
            if(arr[x][y] == '/') {
                move(dir ^ 1);
            }
            else {
                move(3 - dir);
            }
            moveNum += 1;
        }

        return moveNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }
        startNum = sc.nextInt();
        initialize(startNum);
        int moveNum = simulate();
        System.out.print(moveNum);
    }
}