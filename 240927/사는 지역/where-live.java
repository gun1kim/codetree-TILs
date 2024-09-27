import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Info {
            String name;
            String addr;
            String city;

            public Info(String name, String addr, String city) {
                this.name = name;
                this.addr = addr;
                this.city = city;
            }

            public void printInfo() {
                System.out.println("name " + this.name);
                System.out.println("addr " + this.addr);
                System.out.println("city " + this.city);    
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Info> infos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            infos.add(new Info(sc.next(), sc.next(), sc.next()));
        }

        Info lastInfo = infos.get(0); 
         for (int i = 1; i < n; i++) {
            if (infos.get(i).name.compareTo(lastInfo.name) > 0) {
                lastInfo = infos.get(i);
            }
        }
        lastInfo.printInfo();
    }
}