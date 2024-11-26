import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int[] dx = new int[]{1, 1, 1, -1, -1, -1, 0, 0};
    public static int[] dy = new int[]{-1, 0, 1, -1, 0, 1, -1, 1}

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

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (arr[i][j] == 0) continue;

                for (int k = 0; k < 8; k++) {
                    int count = 1;
                    int curX = i; 
                    int curY = j;
                    while (true) {
                        int nx = curX + dx[k];
                        int ny = curY + dy[k];
                        if (isRange(nx, ny) == false) {
                            break;
                        }
                        if (arr[nx][ny] != arr[i][j]) {
                            break;
                        }
                        count++;
                        curX = nx;
                        curY = ny;
                    }
                    if (count == 5) {
                        Systme.out.println(arr[i][j]);
                        System.out.print((i + 2 * dx[k] + 1) + " " + (j + 2  * dy[k] + 1));
                        System.exit(0); 
                    }
                }
            }
        }
        System.out.print(0);
    }
    private static boolean isRange(int x, int y) {
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }
}