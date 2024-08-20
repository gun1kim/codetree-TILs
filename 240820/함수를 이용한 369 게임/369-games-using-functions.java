import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(solution(a, b));
    }

    private static int solution(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (contains369(i) || isMultipleOfThree(i)) {
                count += 1;
            }
        }
        return count;
    }

    private static boolean contains369(int n) {
        String strN = Integer.toString(n);
        return strN.contains("3") || strN.contains("6") || strN.contains("9");
    }

    private static boolean isMultipleOfThree(int n) {
        return n % 3 == 0;
    }
}