import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2001][2001];

        for (int i = 0; i < 3; i++) {
            int x1 = sc.nextInt() + 1000; 
            int y1 = sc.nextInt() + 1000;
            int x2 = sc.nextInt() + 1000;
            int y2 = sc.nextInt() + 1000;

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                     if (i != 2) {
                        arr[x][y] = 1;
                    }
                    else if (i == 2) {
                        arr[x][y] = 2;
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (arr[i][j] == 1) {
                    answer += 1;
                }
            }
        }

        System.out.print(answer);
    }
}