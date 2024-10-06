import java.util.*;
class Num {
    int v;
    int idx;

    public Num(int v, int idx) {
        this.v = v;
        this.idx = idx;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Num[] nums = new Num[n];
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = new Num(sc.nextInt(), i);
        }
        Arrays.sort(nums, (a, b) -> a.v == b.v ? a.idx - b.idx : a.v - b.v);

        for (int i = 0; i < n; i++) {
            sorted[nums[i].idx] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }

    }
}