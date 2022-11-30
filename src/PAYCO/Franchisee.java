package PAYCO;

import java.util.ArrayList;
import java.util.Arrays;

//OCP를 위한 인터페이스 

interface Store{
	public void location();
}

class Seoul implements Store {
	public void location() {
		System.out.println("서울 가맹점");
	}
}

class Ulsan implements Store {
	public void location() {
		System.out.println("울산 가맹점");
	}
}

class Jinju implements Store {
	public void location() {
		System.out.println("진주 가맹점");
	}
}

class WhereLocation{
	public void location(Store store) {
		store.location();
	}
}

public class Franchisee {

	static ArrayList<String> stores = new ArrayList<String>(Arrays.asList("A상점", "B상점", "C상점", "D상점"));

	public static void showStoreList() {
		for (int i = 0; i < stores.size(); ++i) {
            System.out.print(stores.get(i) + "  ");
        }
        System.out.println();	
	}
	
	// 개방폐쇄원칙을 위해 기존의 클래스들은 수정하지 않고 새로운 객체를 넣어서 값을 변경
	public static void showFranchiseeList() {
		WhereLocation whereLocation = new WhereLocation();
		whereLocation.location(new Seoul());
		whereLocation.location(new Ulsan());
		whereLocation.location(new Jinju());
	}
	
	
	// 스토어에 원하는 지점 추가 설정
	public void addStore(String str) {
		stores.add(str);
	}

}
