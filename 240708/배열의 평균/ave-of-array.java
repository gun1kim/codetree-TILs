import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }

        double[] rowsAvg = new double[2];
        for (int i = 0; i < 2; i++) {
            double sum = 0; 
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            rowsAvg[i] = sum / 4.0;
        }

        double[] colsAvg = new double[4];
        for (int j = 0; j < 4; j++) {
            double sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += arr[i][j];
            }
            colsAvg[j] = sum / 2.0;
        }

        double avg = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                avg += arr[i][j];
            }
        }
        avg = avg / 8.0;

        System.out.printf("%.1f %.1f\n", rowsAvg[0], rowsAvg[1]);
        System.out.printf("%.1f %.1f %.1f %.1f\n", colsAvg[0], colsAvg[1], colsAvg[2], colsAvg[3]);
        System.out.printf("%.1f", avg);
        
    }
}