import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -999;
        int min = 999;

        while (true) {
            int n = sc.nextInt();
            if (n == 999 || n == -999) {
                break;
            }
            else {
                if (n > max) {
                    max = n;
                }
                if (min > n) {
                    min = n;
                }
            }
        }    
        System.out.println(max + " " + min);
    }
}