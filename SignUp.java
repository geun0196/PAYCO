package PAYCO;

import java.util.*;

public class SignUp {

	public static  void signup() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------- ȸ �� �� �� -------------------");
		
		while(true) {
			System.out.print("���̵� �Է����ּ���. : ");
			String id = sc.next();
			if(UserDataMap.userList.containsKey(id)) {// id�� �ؽ� ������ �־� �ߺ� üũ�� �� �� �ֵ��� �ߴ�.
				System.out.println("�̹� ��� ���� ���̵� �Դϴ�. ");
				continue;
			}
			else {
				System.out.print("��й�ȣ�� �Է����ּ���. : ");
				String password = sc.next();
				System.out.println("ȸ�����Կ� �����ϼ̽��ϴ�");
				UserDataMap.userList.put(id,new UserInfo(id, password));
				break;
			}
			
		}
	
	}
}
