import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int mn = Math.min(Math.min(s1.length(), s2.length()), s3.length());
        int mx = Math.max(Math.max(s1.length(), s2.length()), s3.length());
        int answer = mx - mn;
        System.out.println(answer);
    }
}