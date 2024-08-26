import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        for (int i = a; i <= b; i++) {
            if(solution(i))    
                result += 1;
        }
        System.out.print(result);
    }
    
    private static boolean solution(int n) {
        if (n % 2 == 0) return false;
        if (n % 5 == 0) return false;
        if (n % 3 == 0 && n % 9 != 0) return false;
        return true;
    }
}