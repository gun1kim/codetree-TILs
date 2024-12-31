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

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        int answer = 0; 


        for (int i = 0; i < n; i++) {
            int[] costs = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    costs[j] =  arr[j][0] / 2 + arr[j][1];
                }
                else {
                    costs[j] = arr[j][0] + arr[j][1];
                }
            }
                
            Arrays.sort(costs);

            int sum = 0, count = 0;
            for (int cost : costs) {
               if (sum + cost <= b) {
                    sum += cost;
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