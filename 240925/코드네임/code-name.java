import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Agent {
            char code;
            int score;
            public Agent() {

            }
            public Agent(char code, int score) {
                this.code = code;
                this.score = score;
            }
        }
        Scanner sc = new Scanner(System.in);
        Agent[] arr = new Agent[5];

        int mn = 100;
        for (int i = 0; i < 5; i++) {
            arr[i] = new Agent(sc.next().charAt(0), sc.nextInt());
        }

        Agent lowest = arr[0];
        for (int i = 1; i < 5; i++) {
            if (arr[i].score < lowest.score) {
                lowest = arr[i];
            }
        }

        System.out.print(lowest.code + " " + lowest.score);
    }
}