import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Bomb {
        String code;
        char color;
        int second;

        public Bomb() {

        }

        public Bomb(String code, char color, int second) {
            this.code = code;
            this.color = color;
            this.second = second;
        }

        public void print() {
            System.out.println("code : " + this.code);
            System.out.println("color : " + this.color);
            System.out.println("second : " + this.second);
        }
    }
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char color = sc.next().charAt(0);
        int second = sc.nextInt();
        Bomb bomb = new Bomb(code, color, second);
        bomb.print();
    }
}