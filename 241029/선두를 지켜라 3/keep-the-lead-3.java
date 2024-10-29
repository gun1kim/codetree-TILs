import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1000001];
        int posA = 0;
        int maxTime = 0;
        int timeA = 0;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posA += v;
                a[timeA++] = posA;
            }
        } 
        maxTime = timeA;
        
        int[] b = new int[1000001];
        int posB = 0;
        int timeB = 0;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                posB += v;
                b[timeB++] = posB;
            }
        }

        int changes = 0;
        String prev = "";
        for (int i = 0; i < maxTime; i++) {
            String cur;
            if (a[i] > b[i]) {
                cur = "A";
            }
            else if (a[i] < b[i]) {
                cur = "B";
            }
            else {
                cur = "AB";
            }

            if (!cur.equals(prev)) {
                changes++;
                prev = cur;
            }
        }
        System.out.print(changes);
    }
}