import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        int answer = 0;
        for (int start = 1; start <= 3; start++) {
            int score = 0;
            int cur = start;

            for (int turn = 0; turn < n; turn++) {
                int a = arr[turn][0];
                int b = arr[turn][1];
                int c = arr[turn][2];

                // 컵 교환 
                if (cur == a) {
                    cur = b;
                } else if (cur == b) {
                    cur = a;
                }

                // c번 컵을 열었을 때 조약돌이 있으면 점수 획득
                if (cur == c) {
                    score++;
                }
            }

            answer = Math.max(answer, score);
        }

        System.out.print(answer);
    }
}