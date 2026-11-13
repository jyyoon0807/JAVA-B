public class Main {
    public static void main(String[] args) {
        System.out.println("--- for문 이용 ---");
        for (int chicken = 0; chicken <= 37; chicken++) {
            int dog = 37 - chicken;
            if ((2 * chicken) + (4 * dog) == 102) {
                System.out.println("닭: " + chicken + "마리, 개: " + dog + "마리");
                break;
            }
        }

        System.out.println("\n--- while문 이용 ---");
        int c = 0;
        while (c <= 37) {
            int d = 37 - c;
            if ((2 * c) + (4 * d) == 102) {
                System.out.println("닭: " + c + "마리, 개: " + d + "마리");
                break;
            }
            c++;
        }

        System.out.println("\n--- do-while문 이용 ---");
        int cd = 0;
        do {
            int dg = 37 - cd;
            if ((2 * cd) + (4 * dg) == 102) {
                System.out.println("닭: " + cd + "마리, 개: " + dg + "마리");
                break;
            }
            cd++;
        } while (cd <= 37);
    }
}