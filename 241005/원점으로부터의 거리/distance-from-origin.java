import java.util.*;
class Point {
    int x;
    int y;
    int d;
    int idx;

    public Point(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.d = Math.abs(x) + Math.abs(y);
        this.idx = idx;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(points, (a, b) -> {
            if (a.d == b.d) {
                return a.idx - b.idx;
            }
            return a.d - b.d;
        });

        for (int i = 0; i < n; i++) {
            System.out.println(points[i].idx);
        }
    }
}