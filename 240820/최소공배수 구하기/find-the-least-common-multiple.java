import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = n * m / gcd(n,m);
        System.out.println(result);
    }


    private static int gcd(int n, int m) {
        int num = 1;
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                num = i;
            }
        }
        return num;
    }
}