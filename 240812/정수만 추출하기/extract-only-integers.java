import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        int aInt = extractInteger(a);
        int bInt = extractInteger(b);
        int result = aInt + bInt;
        System.out.print(result);
    }

    private static int extractInteger(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                sb.append(c);
            }
            else {
                break;
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
 }