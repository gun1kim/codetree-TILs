import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println(arr[1] + " " + arr[4] + " " + arr[7]);
    }
}