import java.util.*;

public class Main {
    public static int n;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MIN_VALUE;

        for (int i = 1; i <= 100; i++) {
            int res = solution(i);
            answer = Math.max(answer, res);
        }
        System.out.print(answer); 
    }
    private static int solution(int k) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == 2 * k) 
                    count ++;
            }
        }
        return count;
    }
}