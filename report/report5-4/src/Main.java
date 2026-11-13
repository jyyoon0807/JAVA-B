import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 구매 금액을 입력하세요: ");
        int amount = scanner.nextInt();

        if (amount < 0) {
            System.out.println("오류: 구매 금액은 음수일 수 없습니다.");
        } else {
            System.out.print("멤버십 회원입니까? (true 또는 false): ");
            boolean isMember = scanner.nextBoolean();

            // 조건: 총 구매 금액이 5만 원 이상 OR (멤버십 회원 AND 구매 금액이 3만 원 이상)
            if (amount >= 50000 || (isMember && amount >= 30000)) {
                System.out.println("무료배송이 적용됩니다.");
            } else {
                System.out.println("무료배송 대상이 아닙니다.");
            }
        }

        scanner.close();
    }
}