import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String result = s1.replace(" ", "") + s2.replace(" ", "");
        System.out.println(result);
    }
}