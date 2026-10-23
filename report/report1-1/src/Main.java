import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println("당신의 나이는 " + age + "살 입니다.");
        System.out.println("당신의 체중은 " + weight + "kg 입니다.");
        System.out.println("당신의 신장은 " + height + "cm 입니다.");

        scanner.close();
    }
}