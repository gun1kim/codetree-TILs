import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }

    private static int solution(int n) {
        if (n <= 1) return 0;

        if (n % 2 == 0) {
            return solution(n / 2) + 1;
        }
        else {
            return solution(n / 3) + 1;
        }
    }
}