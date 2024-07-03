import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int index = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 2) count += 1;

            if (count == 3) {
                index = i + 1;
                break;
            }
        }    
        System.out.println(index);
    }
}