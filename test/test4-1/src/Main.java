import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("**** 삼각형 분석 프로그램 ****");
        System.out.print("첫 번째 변 a : ");
        int a = keyboard.nextInt();
        System.out.print("두 번째 변 b : ");
        int b = keyboard.nextInt();
        System.out.print("세 번째 변 c : ");
        int c = keyboard.nextInt();

        System.out.println("----------------------------------");

        // 삼각형 성립 조건: 어떤 두 변의 길이의 합은 항상 나머지 한 변의 길이보다 커야 함
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("삼각형이 성립합니다.");

            // 종류 판정
            String type = "";

            // 변의 길이를 오름차순 정렬 (x <= y <= z)
            int x = a, y = b, z = c;
            if (x > y) { int temp = x; x = y; y = temp; }
            if (y > z) { int temp = y; y = z; z = temp; }
            if (x > y) { int temp = x; x = y; y = temp; }

            boolean isRight = (x * x + y * y == z * z);

            if (a == b && b == c) {
                type = "정 삼각형";
            } else if (a == b || b == c || a == c) {
                type = "이등변 삼각형";
                if (isRight) type += " (직각 삼각형)";
            } else {
                if (isRight) {
                    type = "일반 삼각형 (직각 삼각형)";
                } else {
                    type = "일반(부등변) 삼각형";
                }
            }

            // 면적 계산 (Heron's formula)
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("삼각형의 종류 : " + type);
            System.out.printf("삼각형의 면적 : %.2f cm²\n", area);

        } else {
            System.out.println("삼각형 아님");
        }
    }
}