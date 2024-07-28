import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[26];
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                count ++;
            }
            else {
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        
        sb.append(s.charAt(s.length()-1)).append(count);
        String answer = sb.toString();

        System.out.println(sb.length());
        System.out.println(answer);
    }
}