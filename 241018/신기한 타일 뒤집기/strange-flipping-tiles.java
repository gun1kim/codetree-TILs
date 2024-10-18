import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] check = new int[2000001];  
        int cur = 1000000;  

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {  
                while (x > 0) {
                    check[cur] = 1;
                    x --;
                    if (x > 0) cur--;
                }
            } else { 
                while (x > 0) {
                    check[cur] = 2;
                    x --;
                    if (x > 0) cur ++;
                }
            }
        }

        int white = 0, black = 0;
        
        for (int c : check) {
            if (c == 1) {
                white++;
            } else if (c == 2) {
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}