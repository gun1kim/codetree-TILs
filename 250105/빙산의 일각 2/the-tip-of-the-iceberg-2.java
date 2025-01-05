import java.util.*;

public class Main {
    public static int n;
    public static int[] arr;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        // 빙산 높이 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = 0;
        // 가능한 모든 해수면 높이에 대해 롹인 
        for (int i = 0; i <= 1000; i++) {
            visited = new boolean[n];
            int groups = 0;

            // 각 빙산에 대해 DFS 수행
            for (int j = 0; j < n; j++) {
                if (!visited[j] && arr[j] > i) {
                    dfs(j, i);
                    groups++;
                }
            }
            answer = Math.max(answer, groups);
        }
        System.out.print(answer);
    }

    private static void dfs(int current, int waterLevel) {
        visited[current] = true;

        // 현재 위치에서 양옆을 확인 
        // 왼쪽 확인 
        if (current > 0 && !visited[current - 1] && arr[current - 1] > waterLevel) {
            dfs(current - 1, waterLevel);
        }
        // 오른쪽 확인
        if (current < n - 1 && !visited[current + 1] && arr[current + 1] > waterLevel) {
            dfs(current + 1, waterLevel);
        } 
    
    }
}