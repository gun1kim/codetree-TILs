import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(facto(n));
    }

    private static int facto(int n) {
        if (n == 0) return 1;
        else if (n == 1) return 1;
        else {
            return facto(n-1) * n;
        }
    }
}