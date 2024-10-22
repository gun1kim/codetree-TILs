import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[201][201];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;
            
            if ((i + 1) % 2 == 1) {
                for (int x = x1; x < x2; x++) {
                    for (int y = y1; y < y2; y++) {
                        arr[x][y] = 1;
                    }
                }
            }
            else {
                for (int x = x1; x < x2; x++) {
                    for (int y = y1; y < y2; y++) {
                        arr[x][y] = 2;
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (arr[i][j] == 2) {
                    answer += 1;
                }
            }
        }
        System.out.print(answer);
    }
}