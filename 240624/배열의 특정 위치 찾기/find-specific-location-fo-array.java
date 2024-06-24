import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int sum2 = 0;
        for(int i = 1; i < 10; i+=2) {
            sum += arr[i];
        }   
        for(int i = 2; i < 10; i+=3) {
            sum2 += arr[i];
        }
        double avg = (double) sum2 / 3.0;
        avg = Math.round(avg) * 10.0 / 10.0 ;

        System.out.printf("%d %.1f", sum, avg);
    }
}