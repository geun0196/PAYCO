package PAYCO;

import java.util.*;

public class SignUp {

	public static  void signup() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("------------------- 회 원 가 입 -------------------");
		
		while(true) {
			System.out.print("아이디를 입력해주세요. : ");
			String id = sc.next();
			if(UserDataMap.userList.containsKey(id)) {// id를 해쉬 값으로 넣어 중복 체크
				System.out.println("이미 사용 중인 아이디 입니다. ");
				continue;
			}
			else {
				System.out.print("비밀번호를 입력해주세요. : ");
				String password = sc.next();
				System.out.println("회원가입에 성공하셨습니다");
				UserDataMap.userList.put(id,new UserInfo(id, password)); //UserDataMap 클래스의 HashMap인 userList에 id와 UserInfo객체를 넣음 
				break;
			}
			
		}
	
	}
}