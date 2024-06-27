import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int i = 1;
        while (true) {
            if (count == 2) {
                break;
            }
            System.out.print(n * i + " ");
            if (n * i % 5 == 0) {
                count += 1;
            }
            i += 1;
            
        }
    }
}