import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        System.out.println(arr.get(1));
    }
}