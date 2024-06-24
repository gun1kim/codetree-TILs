import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];   
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < 101; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                idx = i-1;
                break;
            }
        }

        for (int i = idx - 2; i <= idx; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}