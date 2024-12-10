import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printASC(n);
        System.out.println();
        printDESC(n);
    }

    private static void printASC(int n) {
        if (n == 0) return;

        printASC(n-1);
        System.out.print(n + " ");
    }

    private static void printDESC(int n) {
        if (n == 0) return;

        System.out.print(n + " ");
        printDESC(n-1);
    }
}