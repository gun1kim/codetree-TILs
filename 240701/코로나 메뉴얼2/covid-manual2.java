import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 0; i < 3; i++) {
            char flag = sc.next().charAt(0);
            int t = sc.nextInt();
            if (flag == 'Y' && t >= 37) {
                a += 1;
            }
            else if (flag == 'Y' && t < 37) {
                c += 1;
            }
            else if (flag == 'N' && t >= 37) {
                b += 1;
            }
            else if (flag == 'N' && t < 37) {
                d += 1;
            }
        }

        System.out.print(a + " " + b + " " + c + " " + d);
        if (a >= 2) {
            System.out.println(" E");
        }
    }
}