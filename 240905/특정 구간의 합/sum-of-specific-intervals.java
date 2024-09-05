import java.util.Scanner;

public class Main {
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            System.out.println(solution(a1, a2));
        }
    }
    private static int solution(int a1, int a2){ 
        int sum = 0;
         for (int i = a1 - 1; i < a2; i++) {
            sum += arr[i];
        }
        return sum;
    }
}