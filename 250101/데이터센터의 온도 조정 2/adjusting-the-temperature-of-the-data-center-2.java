import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        
        int[][] arr = new int[n][2];

        int answer = 0;


        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i <= 1000; i++) {
            int total = 0;
            for (int j = 0; j < n; j++) {
                int ta = arr[j][0];
                int tb = arr[j][1];

                if (i < ta) {
                    total += c;
                }
                else if (i > tb) {
                    total += h;
                }
                else {
                    total += g;
                }
            }
            answer = Math.max(answer, total);
        }

        System.out.print(answer);
    }
}