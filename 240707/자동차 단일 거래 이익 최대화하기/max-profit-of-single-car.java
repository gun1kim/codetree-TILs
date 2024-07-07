import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int mn = 1001;
        int mx = -1;
        int answer = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(answer);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < mn) {
                mn = arr[i];
                minIndex = i;
            }
            else if (arr[i] - mn > answer) {
                answer = arr[i] - mn;
            }
        }

        System.out.println(answer);
    }
}