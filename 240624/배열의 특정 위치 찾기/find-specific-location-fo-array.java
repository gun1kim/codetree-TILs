import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 1; i < 10; i+=2) {
            sum += arr[i];
        }   
        double avg = (double) sum / 5;

        System.out.printf("%d %.1f", sum, avg);
    }
}