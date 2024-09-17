import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(solution(n, 0));
    }
    private static int solution(int n, int count) {
        if (n == 1) {
            return count;
        }
        if (n % 2 == 0) {
            return solution(n/2, count+1);
        } 
        else{
            return solution(n * 3 + 1, count + 1);
        }
    }
}