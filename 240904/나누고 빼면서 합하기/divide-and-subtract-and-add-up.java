import java.util.Scanner;

public class Main {
    private static int n;
    private static int m;
    private static int result = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (m > 1) {
            result += arr[m-1];
            if (m % 2 == 0) {
                m /= 2;
            }
            else {
                m -= 1;
            }
        }
        result += arr[0];
        
        System.out.print(result);
    }
}