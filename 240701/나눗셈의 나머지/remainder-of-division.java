import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[b];
        int result = 0;

        while (a > 1) {
            arr[a % b] += 1;
            a /= b;
        }

        for (int count : arr) {
            result += count * count;
        }
        System.out.println(result);
    }
}