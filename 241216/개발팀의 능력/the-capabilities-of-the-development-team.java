import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && j != k && i != k) {
                        if (allDiff(arr, i, j, k)) {
                            answer = Math.min(answer, calc(arr, i, j, k));
                            found = true;
                        }
                    }
                }
            }
        }
        if (!found) {
            System.out.print(-1);
        }
        else {
            System.out.print(answer);
        }
    }

    private static boolean allDiff(int[] arr, int a, int b, int c) {
        int team1 = arr[a] + arr[b];
        int team2 = arr[c];
        int team3 = sum(arr) - team1 - team2;

        return team1 != team2 && team2 != team3 && team1 != team3;
    }

    private static int calc(int[] arr, int a, int b, int c) {
        int team1 = arr[a] + arr[b];
        int team2 = arr[c];
        int team3 = sum(arr) - team1 - team2;

        return Math.max(team1, Math.max(team2, team3)) - Math.min(team1, Math.min(team2, team3));
    }
    private static int sum(int[] arr) {
        int total = 0;
        for (int ability : arr) {
            total += ability;
        }
        return total;
    }
}