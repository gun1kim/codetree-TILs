import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxVal = 1;
        int minVal = 1000;

        for (int i = 0; i < 10; i++) {
            if (arr[i] < 500 && arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i] > 500 && arr[i] < minVal) {
                minVal = arr[i];
            }
        }

        System.out.println(maxVal + " " + minVal);
    }
}