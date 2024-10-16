import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] check = new int[2001];
        int cur = 100;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if (d == 'L') {
                for(int j = cur; j > cur - x; j--) {
                    check[j] ++;
                }
                cur -= x;
            }
            else if (d == 'R') {
                for (int j = cur; j < cur + x; j++) {
                    check[j] ++;
                }
                cur += x;
            }
        } 
        int answer = 0; 
        for (int i = 0; i < 2001; i++) {
            if (check[i] >= 2) {
                answer +=1;
            }
        }
        System.out.print(answer);
    }
}