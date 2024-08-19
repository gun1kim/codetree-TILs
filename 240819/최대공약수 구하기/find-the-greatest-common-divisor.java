import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n, m));
    }

    private static int gcd(int n, int m) {
        int num = 0;
        for (int i = 1; i < n; i ++) {
            if (n % i == 0 && m % i == 0) {
                num = i;
            } 
        }
        return num;
    }
}