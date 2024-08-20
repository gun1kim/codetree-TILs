import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        solution(n);
    }

    private static void solution(int n) {
        int sum = n / 10 + n % 10;
        if (n % 2 == 0 && sum % 5 == 0) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}