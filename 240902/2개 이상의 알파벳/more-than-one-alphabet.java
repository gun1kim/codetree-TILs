import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String a = sc.next();
        for (int i = 0 ; i < a.length(); i++) {
            arr[(int)(a.charAt(i) - 'a')] += 1;
        }

        boolean flag = true; 
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 1) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

    }
}