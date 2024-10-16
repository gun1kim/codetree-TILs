import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] check = new int[201]; // 위치 범위: -100 ~ 100 (중앙은 100)
        int cur = 100;  // 시작 위치

        // 명령 수행
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                for (int j = cur - 1; j >= cur - x; j--) {
                    check[j]++;
                }
                cur -= x;  // 현재 위치 업데이트
            } else if (d == 'R') {
                for (int j = cur + 1; j <= cur + x; j++) {
                    check[j]++;
                }
                cur += x;  // 현재 위치 업데이트
            }
        }

        // 2번 이상 지나간 구간 계산
        int answer = 0;
        for (int i = 0; i < 201; i++) {
            if (check[i] >= 2) {
                answer++;
            }
        }

        System.out.print(answer);
    }
}