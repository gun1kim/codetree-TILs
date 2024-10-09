import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int day = 11;
        int hours = 11;
        int minutes = 11;

        if (a < day || (a == day && b < hours) || (a == day && b == hours && c < minutes)) {
            System.out.print("-1");
            return;
        }
        int totalA = a  * 24 * 60 + b  * 60 + c;
        int totalB = day * 24 * 60 + hours * 60 + minutes;

        int answer = totalA - totalB;
        System.out.print(answer);
    }

}