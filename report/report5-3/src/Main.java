public class Main {
    public static void main(String[] args) {
        int totalSeconds = 54321;

        int hours = totalSeconds / 3600;       // 시간 계산
        int remainder = totalSeconds % 3600;   // 남은 초
        int minutes = remainder / 60;          // 분 계산
        int seconds = remainder % 60;          // 최종 남은 초

        System.out.printf("%d 초 = %d 시간 %d 분 %d 초\n", totalSeconds, hours, minutes, seconds);
    }
}