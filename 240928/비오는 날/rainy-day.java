import java.util.*;

public class Main {
    public static void main(String[] args) {
        class Data {
            String date;
            String day;
            String weather;

            public Data(String date, String day, String weather) {
                this.date = date;
                this.day = day;
                this.weather = weather;
            }

            public void printData() {
                System.out.print(this.date + " " + this.day + " " + this.weather);
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Data> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Data(sc.next(), sc.next(), sc.next()));
        }

        Data nearest = null;

        for(Data data : list) {
            if (data.weather.equals("Rain")) {
                if (nearest == null || data.date.compareTo(nearest.date) < 0) {
                    nearest = data;
                }
            }
        }

        nearest.printData();
    }
}