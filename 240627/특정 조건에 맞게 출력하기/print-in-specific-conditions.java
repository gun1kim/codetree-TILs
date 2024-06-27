import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[101];
        int index = 0;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            else {
                arr[index] = n;
                index += 1;
            }
        }

        for (int i = 0; i < index; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
            else {
                arr[i] = arr[i] + 3;
            }
            System.out.print(arr[i] + " ");
        }
    }
}