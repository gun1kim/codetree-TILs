import java.util.Scanner;

public class Main {
    // 1번 카운트와 2번 카운트를 계산하는 함수
    private static boolean matchesCondition(String candidate, String guess, int count1, int count2) {
        int actualCount1 = 0; // 정확한 위치의 숫자
        int actualCount2 = 0; // 틀린 위치의 숫자

        for (int i = 0; i < 3; i++) {
            if (candidate.charAt(i) == guess.charAt(i)) {
                actualCount1++;
            } else if (candidate.contains(String.valueOf(guess.charAt(i)))) {
                actualCount2++;
            }
        }

        return actualCount1 == count1 && actualCount2 == count2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 질문 개수
        String[] guesses = new String[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];

        // 질문 입력받기
        for (int i = 0; i < n; i++) {
            guesses[i] = sc.next();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }

        // 가능한 모든 세 자리 수 생성
        String[] candidates = new String[504];
        int index = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j) continue;
                for (int k = 1; k <= 9; k++) {
                    if (i == k || j == k) continue;
                    candidates[index++] = "" + i + j + k;
                }
            }
        }

        // 모든 후보에 대해 조건 만족 여부 확인
        int validCount = 0;
        for (int i = 0; i < candidates.length; i++) {
            boolean isValid = true;

            for (int j = 0; j < n; j++) {
                if (!matchesCondition(candidates[i], guesses[j], count1[j], count2[j])) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                validCount++;
            }
        }

        // 결과 출력
        System.out.println(validCount);
    }
}