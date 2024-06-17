import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String answer = "";
        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();   
            String[] s = input.split(" " );
            char flag = s[0].charAt(0);
            int t = Integer.parseInt(s[1]);
            if (flag == 'Y' && t >= 37) {
                count += 1;
            }
        }

        if (count >= 2) {
            answer += "E";
        }

        System.out.println(answer);
    }
}