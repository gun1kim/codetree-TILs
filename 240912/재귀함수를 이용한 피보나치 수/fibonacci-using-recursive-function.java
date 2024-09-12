import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}