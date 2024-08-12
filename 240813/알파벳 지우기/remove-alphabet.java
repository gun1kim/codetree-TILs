import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int aInt = extractNum(a);
        int bInt = extractNum(b);

        int result = aInt + bInt;

        System.out.print(result);

    }

    private static int extractNum(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }
}