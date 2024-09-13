import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(arr, n-1));

    }
    private static int solution(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        int max = solution(arr, index - 1);
        return Math.max(arr[index], max);
    }
}