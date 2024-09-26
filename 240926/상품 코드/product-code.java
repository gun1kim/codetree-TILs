import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Product {
        String name;
        int code;

        public Product() {
            this.name = "codetree";
            this.code = 50;
        }
        
        public Product(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public void printInfo() {
            System.out.println("product " + this.code + " is " + this.name);
        }

    }
        Scanner sc = new Scanner(System.in);
        Product p1 = new Product();
        Product p2 = new Product(sc.next(), sc.nextInt());
        p1.printInfo();
        p2.printInfo();

    }
}