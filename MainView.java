package PAYCO;

import java.util.*;

public class MainView {
	
	public static void main(String[] args) {
		int menu;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------P A Y C O �� ��-------------------");
		while(true){
			System.out.print("��ȸ�� �޴��� �Է����ּ���(1-�α��� / 2-ȸ������ / 3-������) : ");
			menu = sc.nextInt();
			
			if(menu == 1) {
				Login.login();
			} else if(menu == 2) {
				SignUp.signup();
			} else if(menu == 3) {
				System.out.println("-------------��ȸ ������ ���� ����Ʈ------------ ");
				//����Ʈ �����ְ�
				Franchisee.showStoreList();
				
				//����� �Է��ϸ� �� ������ ����Ʈ�� ���
				System.out.print("��ȸ ������ ���� : ");
				String serach = sc.next();
				Franchisee.showFranchiseeList();
			} else {
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");
			}
		
		
		//CardPayment card = new CardPayment("11����","�ڹ�",17000,"123-432-111","0070",0);
		//card.payProcess();
		
	}

}
}
