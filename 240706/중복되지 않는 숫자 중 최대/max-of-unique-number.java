import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[1001];
        boolean flag = false;
        int mx = -1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }

        for (int i = 1; i <= 1000; i++) {
            if (count[i] == 1) {
                if (i > mx) {
                    mx = i;
                }
            }
        }

        System.out.println(mx);
    }
}