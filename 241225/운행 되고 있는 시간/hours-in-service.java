import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[1001][2];
        //int[] l = new int[1001];
        //int[] r = new int[1001];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            //l[i] = sc.nextInt();
            //r[i] = sc.nextInt();
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int[] count = new int[1001];
            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = arr[j][0]; k < arr[j][1]; k++) {
                    count[k] ++;
                }
            }

            int time = 0; 
            for (int j = 1; j < 1001; j++) {
                if (count[j] > 0) time++;
            }

            answer = Math.max(answer, time);
        }

        System.out.print(answer);
    }
}