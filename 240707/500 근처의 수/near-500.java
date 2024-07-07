import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int maxBelow500 = Integer.MIN_VALUE;
        int minAbove500 = Integer.MAX_VALUE;
        
        for (int number : numbers) {
            if (number < 500) {
                if (number > maxBelow500) {
                    maxBelow500 = number;
                }
            } else if (number > 500) {
                if (number < minAbove500) {
                    minAbove500 = number;
                }
            }
        }
        
        System.out.println(maxBelow500 + " " + minAbove500);
    }
}