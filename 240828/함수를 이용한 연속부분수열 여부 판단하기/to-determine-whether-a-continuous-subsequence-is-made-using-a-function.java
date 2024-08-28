import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        if (solution(arr1, arr2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    private static boolean solution(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        if (n2 > n1) {
            return false;
        }

        for (int i = 0; i <= n1-n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++){
                if (arr1[i + j] != arr2[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            }
        }
        return false;
    }
}