import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            if (m >= 3 && m <= 5) {
                System.out.println("Spring");
            }
            else if (m >= 6 && m <= 8) {
                System.out.println("Summer");
            }
            else if (m >= 9 && m < 12) {
                System.out.println("Fall");
            }
            else if (m >= 1 && m <= 2 ||  m == 12) {
                System.out.println("Winter");
            }
    }
}