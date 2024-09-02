import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String a = sc.next();
        

        if (solution(a)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    private static boolean solution(String a) {
        int[] count = new int[26];

        for (char c : a.toCharArray()) {
            count[c - 'a']++;
        }

        int diffCharCount = 0; 
        for (int c : count) {
            if (c > 0) {
                diffCharCount++;
            }
        }

        return diffCharCount >= 2;
    }
}