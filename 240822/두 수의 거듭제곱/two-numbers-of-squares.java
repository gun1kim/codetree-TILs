import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(multiple(a, b));
    }

    private static int multiple(int a, int b) {
        int n = a;
        int num = 1;
        for (int i = 0; i < b; i++) {
            num = num * n;
        }
        return num;
    }
}