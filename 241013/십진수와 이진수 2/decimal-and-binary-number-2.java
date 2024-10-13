import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(s,2);
        n = n * 17;
        System.out.print(Integer.toString(n, 2));
    }
}