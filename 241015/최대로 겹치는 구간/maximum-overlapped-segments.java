import java.util.*;

public class Main {
    public static final int OFFSET = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[100];
        int[] x2 = new int[100];
        int[] check = new int[201];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();

            x1[i] += OFFSET;
            x2[i] += OFFSET;
        }

        for (int i = 0; i < n; i++) {
            for (int j = x1[i]; j < x2[i]; j++) {
                check[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i <= 200; i++) {
            if (check[i] > max) {
                max = check[i];
            }
        }
        System.out.print(max);
    }
}