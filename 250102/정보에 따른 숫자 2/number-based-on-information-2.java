import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // S와 N의 위치를 저장할 배열 (0: 빈칸, 1: S, 2: N)
        int[] positions = new int[1001];
        
        // T개의 알파벳 정보 입력 받기
        for (int i = 0; i < T; i++) {
            String c = sc.next();
            int x = sc.nextInt();
            positions[x] = c.equals("S") ? 1 : 2;
        }
        
        int count = 0;
        
        // a부터 b까지 각 위치에 대해 검사
        for (int k = a; k <= b; k++) {
            // k에서 왼쪽과 오른쪽으로 탐색하여 가장 가까운 S와 N 찾기
            int leftS = k, rightS = k;
            int leftN = k, rightN = k;
            
            // 왼쪽으로 탐색
            while (leftS >= 0 && positions[leftS] != 1) leftS--;
            while (leftN >= 0 && positions[leftN] != 2) leftN--;
            
            // 오른쪽으로 탐색
            while (rightS <= 1000 && positions[rightS] != 1) rightS++;
            while (rightN <= 1000 && positions[rightN] != 2) rightN++;
            
            // S까지의 최소 거리 계산
            int distS = Integer.MAX_VALUE;
            if (leftS >= 0) {
                distS = Math.min(distS, k - leftS);
            }
            if (rightS <= 1000) {
                distS = Math.min(distS, rightS - k);
            }
            
            // N까지의 최소 거리 계산
            int distN = Integer.MAX_VALUE;
            if (leftN >= 0) {
                distN = Math.min(distN, k - leftN);
            }
            if (rightN <= 1000) {
                distN = Math.min(distN, rightN - k);
            }
            
            // S까지의 거리가 N까지의 거리보다 작거나 같으면 카운트
            if (distS <= distN) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}