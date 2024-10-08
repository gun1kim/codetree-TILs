import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int[] dayOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        
        int tot1 = 0;
        for (int i = 1; i < m1; i++) {
            tot1 += dayOfMonth[i];
        }
        tot1 += d1;

        int tot2 = 0;
        for (int i = 1; i < m2; i++) {
            tot2 += dayOfMonth[i];
        }
        tot2 += d2;

        int diff = tot2 - tot1;

        // 요일 계산
        if (diff < 0) {
            diff = (diff % 7 + 7) % 7;
        } else {
            diff = diff % 7;
        }

        System.out.println(days[diff]);
    }
}