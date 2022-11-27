package PAYCO;

import java.util.ArrayList;
import java.util.Arrays;

interface Store{
	public void location();
}

class Seoul implements Store {
	public void location() {
		System.out.println("���� ������");
	}
}

class Ulsan implements Store {
	public void location() {
		System.out.println("��� ������");
	}
}

class Jinju implements Store {
	public void location() {
		System.out.println("���� ������");
	}
}

class WhereLocation{
	public void location(Store store) {
		store.location();
	}
}

public class Franchisee {

	static ArrayList<String> stores = new ArrayList<String>(Arrays.asList("A����", "B����", "C����", "D����"));

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
