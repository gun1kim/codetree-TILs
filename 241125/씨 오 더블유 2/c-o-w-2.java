import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int answer = 0; 

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (s.charAt(i) == 'C' && s.charAt(j) == 'O' && s.charAt(k) == 'W') {
                        answer += 1;
                    }
                }
            }
        }

        System.out.print(answer);
    }
}