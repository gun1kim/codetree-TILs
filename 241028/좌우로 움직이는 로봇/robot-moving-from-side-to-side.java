import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1000001];
        int[] b = new int[1000001];
        int timeA = 0;
        int posA = 0;
        int timeB = 0;
        int posB = 0;

        while (n --> 0) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                while (t --> 0) {
                    a[++timeA] = --posA;
                }
            }
            else {
                while (t --> 0) {
                    a[++timeA] = ++posA;
                }
            }
        }

        while (m --> 0) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                while (t --> 0) {
                    b[++timeB] = --posB;
                }
            }
            else {
                while (t --> 0) {
                    b[++timeB] = ++posB;
                }
            }
        }

        if (timeA > timeB) {
            for (int i = timeB + 1; i <= timeA; i++) {
                b[i] = b[timeB];
            }
        }
        else {
            for (int i = timeA + 1; i <= timeB; i++) {
                a[i] = a[timeA];
            }
        }

        int answer = 0;
        for (int i = 1; i <= Math.max(timeA, timeB); i++) {
            if (a[i] == b[i] && a[i-1] != b[i-1]) {
                answer += 1;
            }
        }
        
        System.out.print(answer);
    }
}