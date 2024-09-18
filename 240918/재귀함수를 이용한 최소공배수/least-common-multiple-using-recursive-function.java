import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(arr, n));
    }

    private static int gcd(int a, int b) {
        if (b == 0) { 
            return a;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private static int solution(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else {
            return lcm(solution(arr, n-1), arr[n-1]);
        }
    }
}