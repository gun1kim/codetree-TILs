import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (palindrome(a)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }

    private static boolean palindrome(String s) {
        boolean flag = false;
        int length = s.length()-1;
        for (int i = 0; i < s.length(); i ++) {
            if (!(s.charAt(i) == (s.charAt(length)))) {
                flag = false;
                return flag;
            }
            length -= 1;
        }
        return true;
    }
}