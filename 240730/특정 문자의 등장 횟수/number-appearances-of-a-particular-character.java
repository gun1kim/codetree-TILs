import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countEe = 0;
        int countEb = 0;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.substring(i, i+2).equals("ee")) {
                countEe ++;
            }
            if (s.substring(i, i+2).equals("eb")) {
                countEb ++;
            }
        }
        

        System.out.println(countEe + " " + countEb);
    }
}