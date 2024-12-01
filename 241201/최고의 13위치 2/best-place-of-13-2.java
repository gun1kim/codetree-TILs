import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCoins = findMaxCoins(n, arr);
        System.out.print(maxCoins);
        

    }

    private static int findMaxCoins(int n, int[][] arr) {
        int maxCoins = 0;

        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 <= n - 3; c1++) {
                int coins1 = countCoins(arr, r1, c1, true);

                for (int r2 = 0; r2 < n; r2++) {
                    for (int c2 = 0; c2 <= n - 3; c2++) {
                        if (isNonOverLap(r1, c1, r2, c2)) {
                            int coins2 = countCoins(arr, r2, c2, true);
                            maxCoins = Math.max(maxCoins, coins1 + coins2);
                        }
                    }
                }
            }
        }
        return maxCoins;
    }

    private static int countCoins(int[][] arr, int r, int c, boolean isHorizontal) {
        int coins = 0; 

        for (int i = 0; i < 3; i++) {
            coins += arr[r][c+i];
        }

        return coins;
    }

    private static boolean isNonOverLap(int r1, int c1, int r2, int c2) {
        if (r1 == r2) {
            return (c1 + 3 <= c2) || (c2 + 3 <= c1);
        }
        return true;
    }



}