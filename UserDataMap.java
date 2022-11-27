package PAYCO;

import java.util.*;

public class UserDataMap {
	
	public static HashMap<String,UserInfo> userList = new HashMap<>(); 

	public static void getAllData() {
		System.out.println(1);
		for (Map.Entry<String, UserInfo> pair : userList.entrySet()) {
			  System.out.println(String.format("Key (id) is: %s, Value (password) is : %s", pair.getKey(), pair.getValue().getPassword()));
			}
	}
}
