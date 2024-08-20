import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }

    private static int solution(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int n) {
        if (n == 1 || n == 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}