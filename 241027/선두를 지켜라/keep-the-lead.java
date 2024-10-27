import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[1000001];
        int[] b = new int[1000001];
        int distanceA = 0;
        int distanceB = 0;
        int time = 0;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                distanceA += v;
                a[++time] = distanceA;
            }
        }

        time = 0;
        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            for (int j = 0; j < t; j++) {
                distanceB += v;
                b[++time] = distanceB;
            }
        }

        int[] first = new int[time+1];
        for (int i = 1; i < first.length; i++) {
            if (a[i] >= b[i]) {
                first[i] = 1;
            } 
            else { 
                first[i] = 2;
            }
        }
        
        int answer = 0;
        for (int i = 1; i < time; i++) {
            if (first[i] != first[i+1]) {
                answer += 1;
            }
        }

        System.out.print(answer);
    }
}