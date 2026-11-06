import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("**** 부가가치세 납부세액 계산기 ****");
        System.out.print("매입원가 입력 (원) : ");
        double cost = keyboard.nextDouble();

        System.out.print("이익률 입력 (%) 예: 30 -> ");
        double profitRateInput = keyboard.nextDouble();

        System.out.print("세율 입력 (%) 예: 10 -> ");
        double taxRateInput = keyboard.nextDouble();

        // 공식에 따른 계산
        double profitRate = profitRateInput / 100.0;
        double taxRate = taxRateInput / 100.0;

        double price = cost * (1 + profitRate);    // 정가 (매출액)
        double outputTax = price * taxRate;        // 매출 세액 (정가의 10%)
        double inputTax = cost * taxRate;          // 매입 세액 (원가의 10%)
        double taxToPay = outputTax - inputTax;    // 납부세액 = 매출세액 - 매입세액

        System.out.println("----------------------------------");
        System.out.printf("매입원가 : %,.0f 원\n", cost);
        System.out.printf("정가 (매출액) : %,.0f 원\n", price);
        System.out.printf("매출 세액 : %,.0f 원\n", outputTax);
        System.out.printf("매입 세액 : %,.0f 원\n", inputTax);
        System.out.printf("관할 세무서에 낼 납부세액 : %,.0f 원\n", taxToPay);
    }
}