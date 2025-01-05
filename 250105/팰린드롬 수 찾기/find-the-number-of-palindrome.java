import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int answer = 0;

        for (int i = x; i <= y; i++) {
            if (solution(i)) answer ++;    
        }
        System.out.print(answer);
    }
    private static boolean solution(int x) {
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        if (str.equals(reverse)) return true;
        else return false;
    }
}