import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= m; i++) {
            int num = sc.nextInt();
            arr[num] += 1;
            if (arr[num] >= k) {
                System.out.print(num);
                return;
            }
        }
        System.out.print(-1);
    }
}