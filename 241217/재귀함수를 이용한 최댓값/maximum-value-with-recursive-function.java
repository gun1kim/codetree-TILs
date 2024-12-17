import java.util.*;

public class Main {
    private static int[] arr = new int[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(max(n));
    }
    private static int max(int n) {
        if (n == 0) return arr[0];
        return Math.max(arr[n], max(n-1));
    }
}