import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                int b = sc.nextInt();
                int c = sc.nextInt();
                char temp = arr[b-1];
                arr[b-1] = arr[c-1];
                arr[c-1] = temp;
                
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]);
                }

                System.out.println();
                
            }
            else if (a == 2) {
                char b = sc.next().charAt(0);
                char c = sc.next().charAt(0);
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == b) {
                        arr[j] = c;
                    }
                }
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }
}