import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 0; i < n; i++) {
          s += sc.next();
        }
        int length = s.length();

        int i = 0; 
        while (i < length) {
          if (i + 5 <= length) {
               System.out.println(s.substring(i, i + 5));
          }
          else { 
               System.out.println(s.substring(i));
          }
          i += 5;
        }
    }
}