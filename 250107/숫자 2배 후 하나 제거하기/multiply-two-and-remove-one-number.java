import java.util.*;

public class Main {
    public static int n;
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> result = new ArrayList<>();

                for (int k = 0; k < n; k++) {
                    if (k == j) continue;

                    if (k == i) {
                        result.add(arr[k] * 2);
                    } 
                    else {
                        result.add(arr[k]);
                    }
                }

                int sumDiff = 0; 
                for (int k = 0; k < result.size() - 1; k++) {
                    sumDiff += Math.abs(result.get(k) - result.get(k + 1));
                }

                answer = Math.min(answer, sumDiff);
            }
        }
        System.out.print(answer);
    }
}