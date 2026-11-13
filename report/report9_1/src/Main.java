import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("높이 X(m) 를 입력하세요: ");
        double height = scanner.nextDouble();

        double totalDistance = height; // 첫 낙하 시 아래로 내려가는 거리

        for (int i = 1; i <= 10; i++) {
            System.out.printf("공의 %d번째 낙하 높이: %.4f m\n", i, height);

            if (i < 10) {
                double bounceHeight = height * (2.0 / 3.0);
                // 올라갔다가 다시 내려오는 거리 추가
                totalDistance += bounceHeight * 2;
                height = bounceHeight;
            }
        }

        System.out.printf("총 이동 거리: %.4f m\n", totalDistance);
        scanner.close();
    }
}