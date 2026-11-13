public class Main {
    public static void main(String[] args) {
        int wellDepth = 300; // cm
        int currentHeight = 0;
        int day = 0;

        while (currentHeight < wellDepth) {
            day++;
            currentHeight += 55; // 낮에 올라감

            System.out.printf("%d일차 낮 - 올라간 높이: %dcm (현재 위치: %dcm)\n", day, 55, currentHeight);

            if (currentHeight >= wellDepth) {
                System.out.println("우물을 탈출했습니다!");
                break;
            }

            currentHeight -= 13; // 밤에 미끄러짐
            System.out.printf("%d일차 밤 - 미끄러진 후 위치: %dcm\n", day, currentHeight);

            if (day >= 7) {
                break;
            }
        }

        if (currentHeight >= wellDepth && day <= 7) {
            System.out.println("결과: 이 달팽이는 일주일(7일) 안에 방울꽃 곁을 지킬 수 있습니다! (소요 일수: " + day + "일)");
        } else {
            System.out.println("결과: 일주일 안에 탈출하기 어렵습니다.");
        }
    }
}