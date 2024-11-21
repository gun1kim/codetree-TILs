import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] checkpoints = new int[n][2];

        for (int i = 0; i < n; i++) {
            checkpoints[i][0] = sc.nextInt();
            checkpoints[i][1] = sc.nextInt();
        }

        int minDistance = calculateShortestDistance(n, checkpoints);

        System.out.print(minDistance);
    
    }

    private static int calculateDistance(int[] point1, int[] point2) {
        return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
    }

    private static int calculateShortestDistance(int n, int[][] checkpoints) {
        int minDistance = Integer.MAX_VALUE;

        for (int skip = 1; skip < n - 1; skip++) {
            int cur = 0;
            int[] prevPoint = checkpoints[0];

            for (int i = 1; i < n; i++){
                if (i == skip) continue;

                cur += calculateDistance(prevPoint, checkpoints[i]);
                prevPoint = checkpoints[i];
            }

            minDistance = Math.min(minDistance, cur);
        }
        return minDistance;
    }
}