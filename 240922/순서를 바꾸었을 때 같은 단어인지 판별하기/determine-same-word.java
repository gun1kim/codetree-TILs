import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[(int)(a.charAt(i) - 'a')]++;
        }
        for (int i = 0; i < b.length(); i++) {
            arr[(int)(b.charAt(i) - 'a')]--;
        }

        String answer = "Yes";
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                answer = "No";
                break;
            }
        }

        System.out.print(answer);
    }
}