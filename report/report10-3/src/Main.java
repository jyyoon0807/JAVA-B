import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ISBN 처음 12자리 숫자를 입력하세요 (예: 978899543210): ");
        String isbn12 = scanner.next();

        if (isbn12.length() != 12) {
            System.out.println("12자리를 정확히 입력해주세요.");
            return;
        }

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(isbn12.charAt(i));
            int weight = (i % 2 == 0) ? 1 : 3;
            sum += digit * weight;
        }

        int remainder = sum % 10;
        int checkDigit = (remainder == 0) ? 0 : (10 - remainder);

        System.out.println("가중치의 합: " + sum);
        System.out.println("계산된 체크 기호: " + checkDigit);
        System.out.println("완성된 ISBN: " + isbn12 + "-" + checkDigit);

        scanner.close();
    }
}