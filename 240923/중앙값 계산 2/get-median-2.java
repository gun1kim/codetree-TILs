import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++){
            arr.add(sc.nextInt());
            if ((i + 1) % 2 == 1) {
                int mid = (i + 1) / 2;
                System.out.print(arr.get(mid) + " ");
            }
        }
    }
}