import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int answer = 0; 

        for (int i = x; i <= y; i++) {
            int num = i;
            int[] digit = new int[10];
            int allDigits = 0;
            while (num > 0) {
                digit[num % 10] ++;
                allDigits++;
                num /= 10;
            }

            boolean interesting = false;

            for (int j = 0; j < 10; j++) {
                if (digit[j] == allDigits - 1) 
                    interesting = true;
            }

            if (interesting) answer ++;
        }

        System.out.print(answer);
    }
}