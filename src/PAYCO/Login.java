package PAYCO;

import java.util.*;

public class Login {

	public static void login() {

		Scanner sc = new Scanner(System.in);

		while(true){

			System.out.println("------------------- 로 그 인 -------------------");
			System.out.print("아이디를 입력해주세요. : ");
			String id = sc.next();
			System.out.print("비밀번호를 입력해주세요. : ");
			String password = sc.next();

			if(UserDataMap.userList.containsKey(id)) {
				//로그인 성공하면 After로그인 메인뷰로 이동
				if(UserDataMap.userList.get(id).getPassword().equals(password)) {
					System.out.println("로그인에 성공하였습니다.");
					AfterLoginMainView.afterLoginMainView();
					break;
				}
				else { 
					System.out.println("로그인에 실패하였습니다 다시한번 입력해주세요");
				}

			}
			else {
				System.out.println("존재하지 않는 아이디입니다");
			}					
			break;
		}
	}
}
