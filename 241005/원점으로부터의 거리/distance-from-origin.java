import java.util.*;
class Point {
    int x;
    int y;
    int idx;

    public Point(int x, int y, int idx) {
        this.x = x;
        this.y = y;
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
            if (Math.abs(a.x + a.y) == Math.abs(b.x + b.y)) {
                return a.idx - b.idx;
            }
            return (Math.abs(a.x) + Math.abs(a.y)) - (Math.abs(b.x) + Math.abs(b.y));
        });

        for (int i = 0; i < n; i++) {
            System.out.println(points[i].idx);
        }
    }
}