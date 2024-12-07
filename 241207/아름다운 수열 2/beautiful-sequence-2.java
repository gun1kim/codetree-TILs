import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);

        int answer = 0;
        for (int i = 0; i <= n - m; i++) {
            int[] temp = new int[m];
            for (int j = i; j < i + m; j++) {
                temp[j - i] = a[j];
            }
            Arrays.sort(temp);
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if (temp[j] != b[j]) {
                    flag = false;
                }
            }
            if (flag) answer ++;
        }
        System.out.print(answer);
    }
}