import java.util.*;

public class Main {
    public static int n;
    public static int[][] arr = new int[n][n];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            answer = Math.min(answer, calc(arr[i][0], arr[i][1]));
        }

        System.out.print(answer);

    }

    private static int calc(int x, int y) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == x && arr[i][1] == y) continue;
            else {
                minX = Math.min(minX, arr[i][0]);
                maxX = Math.max(maxX, arr[i][0]);
                minY = Math.min(minY, arr[i][1]);
                maxY = Math.max(maxY, arr[i][1]);
            }
        }

        return (maxX - minX) * (maxY - minY);
    }
}