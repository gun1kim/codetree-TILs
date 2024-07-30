import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        boolean containsEe = s.contains("ee");
        boolean containsAb = s.contains("ab");

        String ee = containsEe ? "Yes" : "No";
        String ab = containsAb ? "Yes" : "No";

        System.out.println(ee + " " + ab);
    }
}