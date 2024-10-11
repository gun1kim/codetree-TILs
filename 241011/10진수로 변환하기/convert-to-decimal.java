import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[10];
        String s = sc.next();   
        int num = Integer.parseInt(s, 2);
        System.out.print(num);
    }
}