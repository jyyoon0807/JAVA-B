import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 'Scannerr' -> 'Scanner' 오타 수정

        System.out.print("원의 반지름: ");
        int radius = scanner.nextInt();

        double boxArea = (2.0 * radius) * (2.0 * radius); // 정사각형 면적
        double circleArea = radius * radius * 3.14;       // 원의 면적
        double area = boxArea - circleArea;               // 구하는 면적 (빨간색 영역)

        System.out.println("정사각형 면적 : " + boxArea + " Cm2");
        System.out.println("원의 면적 : " + circleArea + " Cm2");
        System.out.println("구하는 면적 : " + area + " Cm2");

        scanner.close();
    }
}