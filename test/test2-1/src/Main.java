import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("**** 시내 버스 요금 계산기 ****");
        System.out.print("나이(age) 입력 : ");
        int age = keyboard.nextInt();

        // 조건 연산자(삼항 연산자)를 이용한 요금 책정
        int fee = (age < 7) ? 0 :
                (age <= 18) ? 1000 :
                        (age <= 64) ? 1500 : 0;

        System.out.println("------------------------------");
        System.out.printf("입력된 나이 : %d세\n", age);
        if (fee == 0) {
            System.out.println("요금 : 무료");
        } else {
            System.out.printf("요금 : %,d원\n", fee);
        }
    }
}