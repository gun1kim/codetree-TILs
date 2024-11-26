import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // 우, 하, 우하, 좌하
    public static int[] dx = {0, 1, 1, 1};
    public static int[] dy = {1, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[19][19];

        // 입력 처리
        for (int i = 0; i < 19; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 오목 검사
        for (int x = 0; x < 19; x++) {
            for (int y = 0; y < 19; y++) {
                if (arr[x][y] != 0) { // 바둑알이 있는 경우만 검사
                    for (int d = 0; d < 4; d++) {
                        if (check(arr, x, y, d)) {
                            System.out.println(arr[x][y]); // 승리 색상 출력
                            int centerX = x + 2 * dx[d] + 1;
                            int centerY = y + 2 * dy[d] + 1;
                            System.out.println(centerX + " " + centerY); // 가운데 좌표 출력
                            return;
                        }
                    }
                }
            }
        }

        // 승부가 나지 않은 경우
        System.out.println(0);
    }

    private static boolean check(int[][] arr, int x, int y, int direction) {
        int color = arr[x][y];
        int count = 1;

        // 다섯 개 연속 검사
        for (int i = 1; i < 5; i++) {
            int nx = x + i * dx[direction];
            int ny = y + i * dy[direction];
            if (!isRange(nx, ny) || arr[nx][ny] != color) {
                return false;
            }
            count++;
        }

        // 여섯 번째 바둑알 검사 (양쪽 끝이 연결되지 않도록)
        int nx = x + 5 * dx[direction];
        int ny = y + 5 * dy[direction];
        if (isRange(nx, ny) && arr[nx][ny] == color) {
            return false;
        }

        // 시작 이전 바둑알 검사
        int px = x - dx[direction];
        int py = y - dy[direction];
        if (isRange(px, py) && arr[px][py] == color) {
            return false;
        }

        return true; // 유효한 오목
    }

    private static boolean isRange(int x, int y) {
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }
}