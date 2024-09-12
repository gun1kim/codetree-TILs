import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n));
    }
    private static int solution(int n) {
        if (n == 1) return 1;
        else if(n == 2) return 2;
        else {
            return n + solution(n-2);
        }   
    }
}