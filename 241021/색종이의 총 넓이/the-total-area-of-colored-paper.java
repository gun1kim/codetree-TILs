import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() + 100;
            int b = sc.nextInt() + 100;
            for (int x = a; x < a + 8; x++) {
                for (int y = b; y < b + 8; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (arr[i][j] == 1) {
                    answer += 1;
                }
            }
        }

        System.out.print(answer);
    }
}