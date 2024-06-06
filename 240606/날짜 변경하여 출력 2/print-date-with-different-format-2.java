import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] strArr = s.split("-");
        String year = strArr[2];
        String month = strArr[0];
        String day = strArr[1];
        System.out.println(year + "." + month + "." + day);
    }
}