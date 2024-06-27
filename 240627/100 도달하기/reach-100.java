import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 2;
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;
        while (true) {
            int sum = arr[index - 1] + arr[index -2];
            arr[index] = sum;
            index += 1;
            if (sum > 100) {
                break;
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}