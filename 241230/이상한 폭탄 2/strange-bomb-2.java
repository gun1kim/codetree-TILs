import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] bombs = new int[N];
        for (int i = 0; i < N; i++) {
            bombs[i] = sc.nextInt();
        }

        System.out.println(findMaxBombNumber(N, K, bombs));
    }

    private static int findMaxBombNumber(int N, int K, int[] bombs) {
        int maxNumber = -1; 

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= i + K && j < N; j++) { 
                if (bombs[i] == bombs[j]) {
                    maxNumber = Math.max(maxNumber, bombs[i]);
                }
            }
        }

        return maxNumber;
    }
}