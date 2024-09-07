import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
    private static void solution(int n) {
        if (n >= 1) {
            System.out.println("HelloWorld");
            solution(n-1);
        }
    }
}