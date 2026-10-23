import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요 ");
        int num1 = scanner.nextInt(); //[cite: 5]

        System.out.print("두번째 숫자를 입력하세요 ");
        int num2 = scanner.nextInt(); //[cite: 5]

        int sum = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + sum); //[cite: 5]

        scanner.close();
    }
}