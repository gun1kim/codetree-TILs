import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // A와 B의 현재 위치와 시간 초기화
        int posA = 0, posB = 0;
        int timeA = 0, timeB = 0;

        // A와 B의 이동 경로 저장
        int[][] movesA = new int[n][2];
        int[][] movesB = new int[m][2];

        // A의 이동 정보 입력
        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            movesA[i][0] = (d == 'L' ? -1 : 1);  // L은 -1, R은 1로 방향 저장
            movesA[i][1] = t;  // 이동 시간 저장
        }

        // B의 이동 정보 입력
        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            movesB[i][0] = (d == 'L' ? -1 : 1);
            movesB[i][1] = t;
        }

        int i = 0, j = 0;  // A와 B의 이동 순서 추적

        // 두 사람의 경로를 동시에 추적
        while (i < n && j < m) {
            int moveA = movesA[i][0];
            int timeAEnd = timeA + movesA[i][1];

            int moveB = movesB[j][0];
            int timeBEnd = timeB + movesB[j][1];

            // 최소 시간만큼 반복하며 두 사람의 위치 추적
            int minTime = Math.min(timeAEnd, timeBEnd);
            for (int t = timeA; t < minTime; t++) {
                posA += moveA;  // A의 위치 업데이트
                posB += moveB;  // B의 위치 업데이트

                if (posA == posB) {  // 만난 경우
                    System.out.println(t + 1);  // 시간 출력
                    return;  // 프로그램 종료
                }
            }

            // 시간이 끝난 쪽의 인덱스를 증가시킴
            if (timeAEnd == minTime) i++;
            if (timeBEnd == minTime) j++;

            // 시간 업데이트
            timeA = minTime;
            timeB = minTime;
        }

        // 만난 적이 없으면 -1 출력
        System.out.println(-1);
    }
}