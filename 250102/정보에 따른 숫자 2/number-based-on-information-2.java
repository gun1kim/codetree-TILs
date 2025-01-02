import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 처리
        int T = sc.nextInt(); // 알파벳 개수
        int a = sc.nextInt(); // 시작 위치
        int b = sc.nextInt(); // 끝 위치

        char[] positions = new char[1001]; // 위치를 저장할 배열 (1 ~ 1000)

        // 배열 초기화
        Arrays.fill(positions, ' '); // 기본값 공백

        // 알파벳 위치 입력
        for (int i = 0; i < T; i++) {
            char c = sc.next().charAt(0); // 알파벳
            int x = sc.nextInt();        // 위치
            positions[x] = c;            // 위치에 알파벳 저장
        }

        int specialCount = 0;

        // a부터 b까지의 위치를 탐색
        for (int i = a; i <= b; i++) {
            int minDistS = getMinDistance(i, positions, 'S');
            int minDistN = getMinDistance(i, positions, 'N');

            // 특별한 위치인지 확인
            if (minDistS <= minDistN) {
                specialCount++;
            }
        }

        // 결과 출력
        System.out.println(specialCount);
    }

    // 특정 위치에서 가장 가까운 알파벳 위치까지의 거리 계산
    private static int getMinDistance(int currentPos, char[] positions, char target) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 1; i <= 1000; i++) {
            if (positions[i] == target) {
                minDistance = Math.min(minDistance, Math.abs(currentPos - i));
            }
        }

        return minDistance;
    }
}