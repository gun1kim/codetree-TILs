import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (validateDate(y, m, d)) {
            System.out.print(judge(m));
        }
        else {
            System.out.println("-1");
        }
    }

    private static boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                return (y % 400 == 0);
            }
            else {
                return true;
            }
        }
        return false;
    }
    
    private static boolean validateDate(int y, int m, int d) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(y)) {
            days[2] = 29;
        }

        if (m >= 1 && m <= 12 && d >= 1 && d <= days[m]) {
            return true;
        }
        return false;
    }

    private static String judge(int m) {
        if (m >= 3 && m <= 5) {
            return "Spring";
        }
        else if (m >= 6 && m <= 8) {
            return "Summer";
        } 
        else if (m >= 9 && m <= 11) {
            return "Fall";
        } 
        else {
            return "Winter";
        }
    }
}