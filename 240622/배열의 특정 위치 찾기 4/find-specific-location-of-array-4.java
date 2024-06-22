import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n == 0) break;
            else if (n % 2 == 0) {
                count += 1;
                sum += n;
            }
        }     
        System.out.println(count + " " + sum);  
    }
}