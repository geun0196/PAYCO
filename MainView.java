package PAYCO;

import java.util.*;

public class MainView {
	
	public static void main(String[] args) {
		int menu;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------P A Y C O 접 속-------------------");
		while(true){
			System.out.print("비회원 메뉴를 입력해주세요(1-로그인 / 2-회원가입 / 3-가맹점) : ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				Login.login();
			} else if(menu == 2) {
				SignUp.signup();
			} else if(menu == 3) {
				System.out.println("-------------조회 가능한 상점 리스트------------ ");
				//리스트 보여주고
				Franchisee.showStoreList();
				
				//사용자 입력하면 그 상점의 리스트를 출력
				System.out.print("조회 가능한 상점 : ");
				String serach = sc.next();
				Franchisee.showFranchiseeList();
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
		
		
		//CardPayment card = new CardPayment("11번가","자바",17000,"123-432-111","0070",0);
		//card.payProcess();
		
	}

}
}
