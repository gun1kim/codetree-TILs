import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } 
            else {
                list.add(n);
            }
        }
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " " );
        }
    }
}