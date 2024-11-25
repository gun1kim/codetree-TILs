import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int answer = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '(' && s.charAt(i+1) == '(') {
                for (int j = i + 2; j < s.length() - 1; j++) {
                    if (s.charAt(j) == ')' && s.charAt(j+1) == ')') {
                        answer += 1;
                    }
                }
            }
        }
        System.out.print(answer);
    }
}