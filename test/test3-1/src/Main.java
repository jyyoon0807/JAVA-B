import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("**** 시간 단위 변환 프로그램 ****");
        System.out.print("시간 입력 : ");
        double totalHours = keyboard.nextDouble();

        // 전체 시간을 초(second) 단위로 변환 후 정밀 계산
        long totalSeconds = Math.round(totalHours * 3600);

        long days = totalSeconds / (24 * 3600);
        long remainder = totalSeconds % (24 * 3600);

        long hours = remainder / 3600;
        remainder %= 3600;

        long minutes = remainder / 60;
        long seconds = remainder % 60;

        System.out.println("------------------------------");
        System.out.printf("%.2f 시간은 %d 일 %d 시간 %d 분 %d 초 입니다.\n",
                totalHours, days, hours, minutes, seconds);
    }
}