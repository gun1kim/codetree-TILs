import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        for (int i = a; i <= b; i++) {
            if (judgePrime(i)) {
                if (judgeSumEven(i)) {
                    count += 1;
                }
            }
        }

        System.out.print(count);
    }

    private static boolean judgePrime(int a) {
        int count = 0;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                count +=1;
            }
        }
        if (count >= 1) {
            return false;
        }
        else {
            return true;
        }
    }

    private static boolean judgeSumEven(int a) {
        int sum = a / 10 + a % 10;
        if (sum % 2 == 0) {
            return true;
        }
        else { 
            return false;
        }
    }
}