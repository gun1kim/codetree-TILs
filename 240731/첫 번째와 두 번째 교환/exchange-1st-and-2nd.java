import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        char first = arr[0];
        char second = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == first) {
                arr[i] = second;
            }
            else if (arr[i] == second) {
                arr[i] = first;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}