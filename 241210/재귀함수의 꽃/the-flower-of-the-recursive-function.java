import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    private static void print(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        print(n-1);
        System.out.print(n + " ");
    }
}