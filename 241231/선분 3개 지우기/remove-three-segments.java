import java.util.*;

public class Main {
    public static int[][] lines;
    public static int[] arr = new int[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        lines = new int[n][2];
        for (int i = 0; i < n; i++) {
            lines[i][0] = sc.nextInt();
            lines[i][1] = sc.nextInt();
        }

        int answer = 0;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (!hasOverlap(i, j, k, n)) {
                        answer ++;
                    }
                }
            }
        }
        System.out.print(answer);
    }
    private static boolean hasOverlap(int a, int b, int c, int n) {
        int[] coverage = new int[101];

        for (int i = 0; i < n; i++) {
            if (i == a || i == b || i == c) {
                continue;
            }

            int start = lines[i][0];
            int end = lines[i][1];

            for (int pos = start; pos <= end; pos++) {
                coverage[pos]++;
                if (coverage[pos] > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}