import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] * arr[i+1] > 0) {
                cnt += 1;
                answer = Math.max(answer, cnt);
            }
            else {
                cnt = 0;
            }
        }
        System.out.print(answer);
    }
}