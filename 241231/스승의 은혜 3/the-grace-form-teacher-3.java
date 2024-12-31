import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int s = sc.nextInt();
            arr[i][0] = p;
            arr[i][1] = s;
        }


        int answer = 0; 


        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < n; j++) {
                int price = (i == j) ? arr[j][0] / 2 : arr[j][0];
                price += arr[j][1];
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