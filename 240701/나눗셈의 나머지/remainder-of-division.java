import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[10];
        int result = 0;

        while (a > 0) {
            arr[a % b] += 1;
            a /= b;
        }

        for (int i = 0; i < 10; i++) {
            result += Math.pow(arr[i], 2);
        }
        System.out.println(result);
    }
}