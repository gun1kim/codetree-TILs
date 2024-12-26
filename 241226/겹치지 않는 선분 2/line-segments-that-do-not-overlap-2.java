import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2000001][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt() + 1000000;
            arr[i][1] = sc.nextInt() + 1000000;

        }        

        int answer = 0;

        for (int i = 0; i < n; i++) {
            boolean intersects = false;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int x1 = arr[i][0], y1 = arr[i][1];
                    int x2 = arr[j][0], y2 = arr[j][1];

                    if((x1 < x2 && y1 > y2) || (x2 < x1 && y2 > y1)) {
                        intersects = true;
                        break;
                    }
                }
            }
            if (!intersects) {
                answer ++;
            }
        }
        System.out.print(answer);
    }
}