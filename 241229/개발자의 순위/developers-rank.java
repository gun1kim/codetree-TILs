import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();  
        int n = sc.nextInt();  
        
        int[][] ranks = new int[k][n];
        
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < n; j++) {
                ranks[i][j] = sc.nextInt();
            }
        }
        
        int pairs = 0;
        
        for(int a = 1; a <= n; a++) {
            for(int b = 1; b <= n; b++) {
                if(a == b) continue;
                
                boolean always = true;
                
                for(int game = 0; game < k && always; game++) {
                    int aIndex = findIndex(ranks[game], a);
                    int bIndex = findIndex(ranks[game], b);
                    
                    if(aIndex > bIndex) {
                        always = false;
                    }
                }
                
                if(always) pairs++;
            }
        }
        
        System.out.println(pairs);
    }
    
    private static int findIndex(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) return i;
        }
        return -1;
    }
}