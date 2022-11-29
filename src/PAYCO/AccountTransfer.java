package PAYCO;

import java.util.*;

public class AccountTransfer {
	
	public static void transfer() {
		Scanner sc = new Scanner(System.in);

		System.out.print("보낼 사람을 입력하세요 : ");
		String person = sc.next();
		System.out.print("보낼 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		System.out.printf("%s에게 %d가 송금되었습니다.\n", person, money);
	}
}
