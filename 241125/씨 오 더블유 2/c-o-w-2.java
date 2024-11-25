import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int countC = 0;
        int countO = 0;
        int countW = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'C') {
                countC += 1;
            }
            else if (s.charAt(i) == 'O') {
                countO += 1;
            }
            else if (s.charAt(i) == 'W') {
                countW += 1;
            }
        }

        int answer = countC * countO * countW;
        System.out.print(answer);
    }
}