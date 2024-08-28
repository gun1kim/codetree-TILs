import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (judgeDay(m, d)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    private static boolean judgeMonth(int m) {
        if (m >= 1 && m <= 12) {
            return true;
        }
        return false;
    }

    private static boolean judgeDay(int m, int d) {
        if (m == 2) {
            if (d >= 1 && d <= 28) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d >= 1 && d <= 31) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d >= 1 && d <= 30) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}