package PAYCO;

import java.util.Scanner;

public class AfterLoginMainView {

	public static void afterLoginMainView() {

		int menu;
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.print("회원 메뉴를 입력해주세요(0-로그아웃 / 1-결제 / 2-송금 / 3-회원정보) : ");
			menu = sc.nextInt();
			if(menu == 0) {
				BeforLoginMainView.main(null);
			} else if(menu == 1) {
				System.out.print("구매하는 상품 : ");
				String p = sc.next();
				
				System.out.print("가격 : ");
				int money = sc.nextInt();
				int point = (money /100) * 10 ;
				
				System.out.print("카드 or 포인트 : ");
				String paymentMethod = sc.next();

				if(paymentMethod.equals("카드")) {
					CardPayment card = new CardPayment("PAYCO",p,money,"123-432-111","0070",0);
					card.payProcess();
					UserDataMap.setPoint(point);
					System.out.println("10퍼센트 포인트 적립 되었습니다");
				} else {
					// 보유 포인트가 삼품 가격보다 많으면 결제 성공
					if(UserDataMap.getHavePoint() >= money) {
						PointPayment cash = new PointPayment("PAYCO",p,money,"123-1283-1523");
						cash.payProcess();
						UserDataMap.setPoint(UserDataMap.getHavePoint()-money);
						System.out.println("정상 결제 되었습니다.");
					}
					else { // 보유 포인트가 삼품 가격보다 적으면 결제 실패
						System.out.println("보유하신 포인트가 부족합니다.");
					}
				}

			} else if(menu == 2) { // 송금
				AccountTransfer.transfer();
			} else if(menu == 3) { // 회원정보
				UserDataMap.getAllData();
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		}

	}

}
