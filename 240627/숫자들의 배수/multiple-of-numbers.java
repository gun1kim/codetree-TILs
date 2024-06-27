import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int i = 1;
        while (true) {
            if (count == 2) {
                System.out.println(n * i);
                break;
            }
            System.out.print(n * i + " ");
            i += 1;
            if (n * i % 5 == 0) {
                count += 1;
            }
        }
    }
}