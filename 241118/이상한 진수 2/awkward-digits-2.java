import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int answer = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
            }
            else {
                arr[i] = '0';
            }

            String str = "";
            for(char c : arr) {
                str += c;
            }
            int num = Integer.parseInt(str);

            int temp = 0;
            for (int j = 0; j < str.length(); j++) {
                temp += Math.pow(2, str.length() - 1 - j)  *(str.charAt(j) - '0');
            }

            answer = Math.max(answer, temp);

            arr[i] = (arr[i] == '0') ? '1' : '0';
        }

        System.out.print(answer);

    }
}