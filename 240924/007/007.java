import java.util.*;

public class Main {
    static class SecretInfo {
        public String secretCode;
        public String meetingPoint;
        public int time;

        public SecretInfo(String secretCode, String meetingPoint, int time) {
            this.secretCode = secretCode;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }

        public void printInfo() {
            System.out.println("secret code : " + this.secretCode);
            System.out.println("meeting point : " + this.meetingPoint);
            System.out.println("time : " + this.time);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String secretCode = sc.next();
        String meetingPoint = sc.next();
        int time = sc.nextInt();
        SecretInfo si = new SecretInfo(secretCode, meetingPoint, time);
        si.printInfo();
    }

}