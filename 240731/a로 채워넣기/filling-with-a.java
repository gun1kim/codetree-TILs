import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        arr[1] = 'a';
        arr[arr.length-2] = 'a';

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}