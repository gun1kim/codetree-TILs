import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[2000001];
        int[] b = new int[2000001];
        int cur = 1000000;
        int timeA = 0;
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            if (d == 'L') {
                for (int j= cur; j > cur - t; j--) {
                    a[j] = timeA;
                    timeA ++;
                }
                cur -= t;
            }
            else if (d == 'R') {
                for (int j = cur; j < cur + t; j++) {
                    a[j] = timeA;
                    timeA ++;
                }
            }
            cur += t;
        }
        
        cur = 1000000;
        int timeB = 0;
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            if (d == 'L') {
                for (int j = cur; j > cur - t; j--) {
                    b[j] = timeB;
                    timeB ++;
                }
                cur -= t;
            }
            else if (d == 'R') {
                for (int j = cur; j < cur + t; j++) {
                    b[j] = timeB;
                    timeB ++;
                }
            }
            cur += t;
        }
        int answer = 0;
        for (int i = 0; i < 2000001; i++) {
            if (a[i] == b[i] && a[i] != 0 && b[i] != 0) {
                answer = a[i];
                System.out.print(answer);
                return;
            }
        }
        System.out.print(-1);

    }
}