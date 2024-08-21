import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.print(isLeapYear(y));
    }

    private static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            return true;
        }
        else if (y % 400 == 0) {
            return true;
        }
        else if (y % 100 == 0) {
            return false;
        } 
        else {
            return false;
        }
    }
}