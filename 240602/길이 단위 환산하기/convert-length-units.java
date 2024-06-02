import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ft = sc.nextDouble();

        double cm = ft * 30.48;
        cm = Math.round(cm * 10) / 10.0;

        System.out.println(cm);
    }
}