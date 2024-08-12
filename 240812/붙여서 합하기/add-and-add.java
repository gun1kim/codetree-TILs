import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int numAb = Integer.parseInt(a + b);
        int numBa = Integer.parseInt(b + a);
        int result = numAb + numBa;
        System.out.print(result);
    }
}