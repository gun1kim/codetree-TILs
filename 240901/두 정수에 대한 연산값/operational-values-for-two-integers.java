import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        solution(arr);

        System.out.print(arr[0] + " " + arr[1]);
        
    }
    private static int[] solution(int[] arr) {
        if (arr[0] > arr[1]) {
            arr[0] = arr[0] + 25;
            arr[1] = arr[1] * 2;
        }
        else {
            arr[0] = arr[0] * 2;
            arr[1] = arr[1] + 25;
        }

        return arr;
    }
}