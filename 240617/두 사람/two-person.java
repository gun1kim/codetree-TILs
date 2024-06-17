import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String personA = sc.nextLine().trim();
        String personB = sc.nextLine().trim();

        String[] a = personA.split(" ");
        String[] b = personB.split(" ");
        int ageA = Integer.parseInt(a[0]);
        char genA = a[1].charAt(0);
        int ageB = Integer.parseInt(b[0]);
        char genB = b[1].charAt(0);

        if (isOver19AndMale(ageA, genA) || isOver19AndMale(ageB, genB)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }

    private static boolean isOver19AndMale(int age, char gender) {
        return age >= 19 && gender == 'M';
    }
}