package PAYCO;

import java.util.*;

public class Login {

	public static void login() {

		Scanner sc = new Scanner(System.in);

		while(true){

			System.out.println("------------------- �� �� �� -------------------");
			System.out.print("���̵� �Է����ּ���. : ");
			String id = sc.next();
			System.out.print("��й�ȣ�� �Է����ּ���. : ");
			String password = sc.next();

			if(UserDataMap.userList.containsKey(id)) {
				if(UserDataMap.userList.get(id).getPassword().equals(password)) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
					break;
				}
				else { 
					System.out.println("�α��ο� �����Ͽ����ϴ� �ٽ��ѹ� �Է����ּ���");
				}

			}
			else {
				System.out.println("�������� �ʴ� ���̵��Դϴ�");
			}					
			break;
		}
	}
}
