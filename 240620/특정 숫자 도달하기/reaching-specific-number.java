import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        double avg = 0.0;
        boolean flag = false;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            if (arr[i] >= 250) {
                flag = true;
                break;
            } else {
                sum += arr[i];
                count += 1;
            }
        }

        if (!flag) {
            avg = (double) sum / 10;
        }
        else {
            avg = (double) sum / count;
        }
        System.out.printf("%d %.1f", sum, avg);
        
    }
}