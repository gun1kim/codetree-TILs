import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int answer = 0;
        
        for (int i = x; i <= y; i++) {
            int temp;
            while (i > 0) {
                temp += i % 10;
                i /= 10;
            }

            answer = Math.max(answer, temp);
        }
        System.out.print(answer);
    }
}