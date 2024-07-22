import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int length = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            length += s.length();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a') count ++;
            }
        }

        System.out.println(length + " " + count);
    }
}