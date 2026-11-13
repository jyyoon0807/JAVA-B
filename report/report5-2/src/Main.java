import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = scanner.nextInt();
        System.out.println("입력 점수: " + score);

        String grade = "";

        if (score < 0 || score > 100) {
            System.out.println("유효하지 않은 점수입니다. (0~100 사이 입력)");
        } else {
            if (score >= 95) grade = "A+";
            else if (score >= 90) grade = "A0";
            else if (score >= 85) grade = "B+";
            else if (score >= 80) grade = "B0";
            else if (score >= 75) grade = "C+";
            else if (score >= 70) grade = "C0";
            else if (score >= 65) grade = "D+";
            else if (score >= 60) grade = "D0";
            else grade = "F";

            System.out.println("학점 : " + grade);
        }

        scanner.close();
    }
}