import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }
    private static int solution(int n) {
        if (n < 10) return n*n;
        return solution(n / 10) + solution(n % 10);
    }
}