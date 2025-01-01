import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int answer = 0;
        
        for (int i = x; i <= y; i++) {
            int temp = 0;
            int num = i;
            while (num > 0) {
                temp += num % 10;
                num /= 10;
            }

            answer = Math.max(answer, temp);
        }
        System.out.print(answer);
    }
}