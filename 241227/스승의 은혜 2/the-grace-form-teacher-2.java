import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                int price = (i == j) ? arr[j] / 2 : arr[j];
                if (sum + price <= b) {
                    sum += price;
                    count++;
                } 
                else {
                    break;
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.print(answer);
    }
}