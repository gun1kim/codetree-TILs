import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[101];
         
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int p = sc.nextInt();
            arr[p] = c;
        }

        int max = 0;
        int currentSum = 0;

        for (int i = 0; i <= k && i <= 100; i++) {
            currentSum += arr[i];
        }

        max = currentSum;
        for (int c = 1; c <= 100; c++) {
            if (c - k - 1 >= 0) {
                currentSum -= arr[c - k -1];
            }

            if (c + k <= 100) {
                currentSum += arr[c + k];
            }

            max = Math.max(max, currentSum);
        }

        System.out.print(max);

    }
}