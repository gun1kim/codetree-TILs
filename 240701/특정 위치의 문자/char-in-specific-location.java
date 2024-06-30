import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};

        char target = sc.next().charAt(0);
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                flag = true;
            }
        }

        if (flag) {
            System.out.println(index);
        }
        else {
            System.out.println("None");
        }
    }
}