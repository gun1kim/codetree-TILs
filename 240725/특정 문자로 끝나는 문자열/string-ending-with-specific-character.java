import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        String[] result = new String[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        for(String s : arr) {
            if (s.charAt(s.length() - 1) == c) {
                result[count] = s;
                count ++;
            }
        }

        if (count == 0) {
            System.out.println("None");
        }
        else {
            for (int i = 0; i < count; i++) {
                System.out.println(result[i]);
            }
        }
    }
}