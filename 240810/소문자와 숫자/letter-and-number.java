import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                System.out.print(Character.toLowerCase(c));
            }
            else if (Character.isDigit(c)) {
                System.out.print(c);
            }
        }
    }
}