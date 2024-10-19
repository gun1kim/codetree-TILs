import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] check = new int[200001];
        int[] cntW = new int[200001];
        int[] cntB = new int[200001];
        int cur = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if (d == 'L') {
                while (x --> 0) {
                    check[cur] = 1;
                    cntW[cur]++;
                    if (x > 0) cur--;
                }
            }
            else if (d == 'R') {
                while (x --> 0) {
                    check[cur] = 2;
                    cntB[cur]++;
                    if (x > 0) cur ++;
                }
            }
        }
        int white = 0;
        int black = 0;
        int gray = 0;
        for(int i = 0; i < 200001; i++) {
            if (cntW[i] >= 2 && cntB[i] >= 2) gray++;
            else if (check[i] == 1) white++;
            else if (check[i] == 2) black++;
        }
        System.out.print(white + " " + black + " " + gray);
    }
}