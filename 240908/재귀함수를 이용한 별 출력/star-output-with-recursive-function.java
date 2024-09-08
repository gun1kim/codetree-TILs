import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
    private static void solution(int n) {
        if (n == 0) return;
        solution(n-1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}