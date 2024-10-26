import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int posA = 0, posB = 0;
        int timeA = 0, timeB = 0;

        int[][] movesA = new int[n][2];
        int[][] movesB = new int[m][2];

        for (int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            movesA[i][0] = (d == 'L' ? -1 : 1);  
            movesA[i][1] = t;  
        }

        for (int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            movesB[i][0] = (d == 'L' ? -1 : 1);
            movesB[i][1] = t;
        }

        int i = 0, j = 0; 

        while (i < n && j < m) {
            int moveA = movesA[i][0];
            int timeAEnd = timeA + movesA[i][1];

            int moveB = movesB[j][0];
            int timeBEnd = timeB + movesB[j][1];

            int minTime = Math.min(timeAEnd, timeBEnd);
            for (int t = timeA; t < minTime; t++) {
                posA += moveA;  
                posB += moveB; 

                if (posA == posB) {  
                    System.out.println(t + 1);  
                    return; 
                }
            }

            if (timeAEnd == minTime) i++;
            if (timeBEnd == minTime) j++;

            timeA = minTime;
            timeB = minTime;
        }

        System.out.println(-1);
    }
}