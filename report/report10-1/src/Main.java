import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[7];
        double sum = 0;

        System.out.println("7인의 채점관 점수(60.0 ~ 100.0)를 입력하세요:");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextDouble();
        }

        // 정렬하여 최소값(인덱스 0)과 최대값(인덱스 6)을 쉽게 제외
        Arrays.sort(scores);

        for (int i = 1; i < 6; i++) {
            sum += scores[i];
        }

        double average = sum / 5.0;
        System.out.println("홍길동 선수의 최종 점수: " + average);
        scanner.close();
    }
}