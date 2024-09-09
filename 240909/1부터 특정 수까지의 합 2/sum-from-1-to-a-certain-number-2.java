import java.util.Scanner;

public class Main {
    private static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
        System.out.print(sum);
    }

    private static int solution(int n) {
        if (n == 0) return 0;
        sum = n + solution(n-1);
        return sum;
    }
}