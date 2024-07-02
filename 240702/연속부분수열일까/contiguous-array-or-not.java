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

        System.out.println(solution(n1, n2, arr1, arr2));
    }

    private static String solution(int n1, int n2, int[] arr1, int[] arr2) {
        for (int i = 0; i <= n1 - n2; i++) {
            boolean flag = true;
            for (int j = 0; j < n2; j++) {
                if (arr1[i + j] != arr2[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return "Yes";
            }
        }
        return "No";
    }
}