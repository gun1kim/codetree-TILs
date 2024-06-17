import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String personA = sc.nextLine().trim();
        String personB = sc.nextLine().trim();

        int ageA = Integer.parseInt(personA.substring(0, personA.length() - 1).trim());
        char genA = personA.charAt(personA.length() - 1);
        int ageB = Integer.parseInt(personB.substring(0, personB.length() - 1).trim());
        char genB = personA.charAt(personB.length() - 1);
        

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