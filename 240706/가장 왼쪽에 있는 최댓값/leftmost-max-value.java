import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int end = n; 
        while (end > 0) {
            int maxIndex = 0;
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            System.out.print((maxIndex + 1) + " "); 
            end = maxIndex;
        }
    }
}