import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[b];
        int result = 0;

        while (a > 0) {
            arr[a % b] += 1;
            a /= b;
        }

        for (int i = 0; i < b; i++) {
            result += arr[i] * arr[i];
        }
        System.out.println(result);
    }
}