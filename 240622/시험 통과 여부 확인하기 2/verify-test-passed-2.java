import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int avg = (a + b + c + d) / 4;
            if (avg >= 60) {
                count += 1;
                System.out.println("pass");
            }
            else {
                System.out.println("fail");
            }
        }
        System.out.println(count);
    }
}