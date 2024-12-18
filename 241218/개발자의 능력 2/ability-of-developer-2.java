import java.util.*;

public class Main {
    private static final int n = 6;
    private static int[] arr = new int[n];
    private static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] selected = new boolean[n];

        findMinDiff(arr, selected, 0, 0);

        System.out.print(answer);

    }

    private static void findMinDiff(int[] arr, boolean[] selected, int start, int depth) {
        if (depth == 3) {
            int[] sum = new int[3];
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (selected[i]) {
                    sum[index++] += arr[i];
                }
            }

            int max = Math.max(sum[0], Math.max(sum[1], sum[2]));
            int min = Math.min(sum[0], Math.min(sum[1], sum[2]));
            answer = Math.min(answer, max - min);

            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (!selected[i]) {
                selected[i] = true;
                findMinDiff(arr, selected, i + 1, depth + 1);
                selected[i] = false;
            }
        }
    }
}