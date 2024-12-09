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

        int answer = 0;
        for (int c = 0; c <= 100; c++) {
            int sum = 0;
            int left = Math.max(0, c - k);
            int right = Math.min(c + k, 100);

            for (int i = left; i <= right; i++) {
                sum += arr[i];
            }
            
            answer = Math.max(answer, sum);
        }

        System.out.print(answer);
    }
}