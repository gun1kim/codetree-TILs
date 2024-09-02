import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void solution(int[] arr) {
        if (arr[0] > arr[1]) {
            arr[0] = arr[0] * 2;
            arr[1] = arr[1] + 10;
        }
        else {
            arr[0] = arr[0] + 10;
            arr[1] = arr[1] * 2;
        }
    }
}