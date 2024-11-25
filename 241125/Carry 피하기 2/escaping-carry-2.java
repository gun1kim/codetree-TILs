import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    if (isNoCarry(a, b, c)) {
                        int sum = a + b + c;
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }
        System.out.print(answer);
    }

    private static boolean isNoCarry(int a, int b, int c) {
        while (a > 0 || b > 0 || c > 0) {
            int digitA = a % 10;
            int digitB = b % 10;
            int digitC = c % 10;

            if (digitA + digitB + digitC >= 10) {
                return false;
            }

            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }
}