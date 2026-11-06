import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요(℃): ");
        double celsius = scanner.nextDouble(); //[cite: 8]

        // 화씨 온도 변환 공식 적용[cite: 8]
        double fahrenheit = celsius * 9.0 / 5.0 + 32; //[cite: 8]

        System.out.println("해당하는 화씨 온도 (°F): " + fahrenheit); //[cite: 8]

        scanner.close();
    }
}