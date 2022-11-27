package PAYCO;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	public static void showFranchiseeList() {
		WhereLocation whereLocation = new WhereLocation();
		whereLocation.location(new Seoul());
		whereLocation.location(new Ulsan());
		whereLocation.location(new Jinju());
	}
	
	public void addStore(String str) {
		stores.add(str);
	}

}
