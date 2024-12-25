import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && j != k && i != k) {
                        int x1 = arr[i][0], y1 = arr[i][1];
                        int x2 = arr[j][0], y2 = arr[j][1];
                        int x3 = arr[k][0], y3 = arr[k][1];

                        boolean isXParallel = (y1 == y2 || y2 == y3 || y1 == y3);
                        boolean isYParallel = (x1 == x2 || x2 == x3 || x1 == x3);

                        int area = Math.abs(((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x2 * y1) + (x3 * y2) + (x1 * y3)));
                        answer = Math.max(answer, area);
                    }
                }
            }
        }
        
        System.out.print(answer);
    }
}