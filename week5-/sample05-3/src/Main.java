void mail(){
    Scanner keyboard = new Scanner(System.in);
    int apple;
    int pear;
    int payment;


    System.out.print("사과 구입 개수 : ");
    apple = keyboard.nextInt();
    System.out.print("배 구입 개수 : ");
    pear = keyboard.naxtInt();
    System.out.print("지불 금액 입력 ");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;

    String result = payment >= price ? String.format("거스름돈 : %,d원",payment-price): "금액이 부족합니다"

System.out.printf("구입금액 :%,d원/n",price);
    System.out.printf("지불금액 :%,d원/n",payment);
    System.out.printIn(result)

}
