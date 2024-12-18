import java.util.*;

public class Main {
    public static final int n = 6;
    public static int[] arr = new int[6];
    public static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                answer = Math.min(answer, getDiff(i, j));
            }
        }
        System.out.print(answer);
    }

    private static int getDiff(int a, int b) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }

        int sum1 = arr[a] + arr[b];
        int sum2 = 0;
        int sum3 = 0;

        int tempMin = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == a || i == b || j == a || j == b) continue;

                sum2 = (arr[i] + arr[j]);
                sum3 = total - sum1 - sum2;

                int[] arr = {sum1, sum2, sum3};
                Arrays.sort(arr);
                int diff = arr[2] - arr[0];
                tempMin = Math.min(tempMin, diff);
            }
        }

        return tempMin;
    }
}