import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(solution(a * b * c));
    }
    private static int solution(int n) {
        if (n < 10) return n % 10;
        else {
            return n % 10 + solution(n/10);
        }
    }
}