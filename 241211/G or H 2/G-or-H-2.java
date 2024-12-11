import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            char c = sc.next().charAt(0);

            if (c == 'G') {
                arr[p] = 1;
            }
            else if (c == 'H') {
                arr[p] = 2;
            }
        }

        int answer = 0;

        for (int i = 0; i < 101; i++) {
            for (int j = i+1; j < 101; j++) {
                if (arr[i] == 0 || arr[j] == 0) continue;

                int countG = 0;
                int countH = 0;

                for (int k = i; k < j + 1; k++) {
                    if (arr[k] == 1) countG += 1;
                    if (arr[k] == 2) countH += 1;
                }

                if (countG == 0 || countH == 0 || countG == countH) {
                    int length = j - i;
                    answer = Math.max(answer, length);
                }
            }
        }

        System.out.print(answer);
    }
}