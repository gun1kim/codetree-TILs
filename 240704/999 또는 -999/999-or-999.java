import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1000;
        int min = 1000;

        while (true) {
            int n = sc.nextInt();
            if (n == 999 || n == -999) {
                break;
            }
            else {
                if (n > max) {
                    max = n;
                }
                else if (min > n) {
                    min = n;
                }
            }
        }    
        System.out.println(max + " " + min);
    }
}