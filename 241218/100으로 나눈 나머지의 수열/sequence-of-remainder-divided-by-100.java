import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(remains(n));
    }

    private static int remains(int n) {
        if (n == 1) return 2 ;
        else if (n == 2) return 4;
        else return remains(n - 2) * remains(n - 1) % 100;
    }
}