import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        class C {
            String id;
            int lv;

            public C() {
                this.id = "codetree";
                this.lv = 10;
            }
            public C(String id, int lv) {
                this.id = id;
                this.lv = lv;
            }

            void print() {
                System.out.println("user " + this.id + " lv " + this.lv);
            }
        }
        Scanner sc = new Scanner(System.in);
        C c1 = new C();
        c1.print();
        C c2 = new C(sc.next(), sc.nextInt());
        c2.print();

    }
}