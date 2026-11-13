import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("3개의 정수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("모두 0");
        } else if (a < 0 || b < 0 || c < 0) {
            System.out.println("음수 포함");
        } else if (a > 0 && b > 0 && c > 0) {
            System.out.println("모두 양수");
        } else {
            System.out.println("음수 포함"); // 0과 양수가 섞인 경우 등의 처리
        }

        scanner.close();
    }
}