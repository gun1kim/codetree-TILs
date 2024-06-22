import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        double avg = 0.0;
        int count = 0;
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
            else {
                count += 1;
            }
            sum += arr[i];
        }

        avg = (double) sum / count;
        System.out.printf("%d %.1f", sum, avg);
    }
}