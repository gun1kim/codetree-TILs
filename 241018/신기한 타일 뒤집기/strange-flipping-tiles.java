import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] tiles = new int[2000001];  
        int cur = 1000000;  

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {  
                for (int j = cur; j > cur - x; j--) {
                    tiles[j] = 1;
                }
                cur -= x + 1;  
            } else { 
                for (int j = cur; j < cur + x; j++) {
                    tiles[j] = 2;
                }
                cur += x - 1; 
            }
        }

        int white = 0, black = 0;
        
        for (int tile : tiles) {
            if (tile == 1) {
                white++;
            } else if (tile == 2) {
                black++;
            }
        }

        System.out.println(white + " " + black);
    }
}