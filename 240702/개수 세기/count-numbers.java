import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int answer = 0; 
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == m) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}