import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double avg = 0.0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 250) {
                sum += arr[i];
                
            }
            else {
                avg = sum / (double) i;
                break;
            }
        }

        System.out.printf("%d %.1f", sum, avg);
    }
}