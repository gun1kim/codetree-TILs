import java.util.*;

public class Main {
    public static int getDays(int m, int d) {
        int totalDays = 0;
        int[] dayOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i < m; i++) {
            totalDays += dayOfMonth[i];
        }
        totalDays += d;
        return totalDays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String y = sc.next();
        int diff = getDays(m2, d2) - getDays(m1, d1);

        int answer = 0;
        answer += diff / 7;
        String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};
        for (int i = 0; i <= diff % 7; i++) {
            if (dayOfWeek[i].equals(y)) {
                answer += 1;
            }
        }
        System.out.print(answer);
    }
}