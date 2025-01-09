import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("push_back")) {
                int num = sc.nextInt();
                list.add(num);
            }
            else if (s.equals("get")) {
                int idx = sc.nextInt();
                System.out.println(list.get(idx - 1));
            }
            else if (s.equals("size")) {
                System.out.println(list.size());
            }
            else if (s.equals("pop_back")) {
                list.remove(list.size() - 1);
            }
        }
    }
}