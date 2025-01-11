import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s = sc.next(); 
        LinkedList<Character> ll = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            ll.add(s.charAt(i));
        }

        ListIterator<Character> it = ll.listIterator(ll.size());

        for (int i = 0; i < m; i++){
            char c = sc.next().charAt(0);
            if (c == 'L') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            }
            else if (c == 'P') {
                char add = sc.next().charAt(0);
                it.add(add);
            }

            else if (c == 'R') {
                if (it.hasNext()) {
                    it.next();
                }
            }
            else if (c == 'D') {
                while (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            }
        }

        it = ll.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        // next(), previous(), remove(), add()
        // hasNext(), hasPrevious()
    }
}