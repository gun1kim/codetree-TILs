import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mn = Math.min(Math.min(a,b), c);
        if (a == mn) {
            System.out.print("1 ");
        }
        else {
            System.out.print("0 ");
        }

        if (a == b && a == c && b == c) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}