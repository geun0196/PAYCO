package PAYCO;

import java.util.*;

public class UserDataMap {
	
	public static HashMap<String,UserInfo> userList = new HashMap<>(); 

	public static void getAllData() { //HashMap에 있는 유저의 정보를 모두 들고옴
		for (Map.Entry<String, UserInfo> pair : userList.entrySet()) {
			  System.out.println(String.format("id : %s, password : %s", pair.getKey(), pair.getValue().getPassword()));
			  System.out.println(String.format("쿠폰 개수 : %d", pair.getValue().getCoupon()));
			  System.out.println(String.format("포인트 : %d", pair.getValue().getPoint()));
		}
	}
	
	public static int getHavePoint(){ // 유저의 포인트 정보 들고옴
		for (Map.Entry<String, UserInfo> pair : userList.entrySet()) {
			  int temp = pair.getValue().getPoint();
			  return temp;
		}
		return 0;
	}
	
	public static void setPoint(int point){ // 유저의 포인트 정보 세팅
		for (Map.Entry<String, UserInfo> pair : userList.entrySet()) {
			  pair.getValue().setPoint(point);
		}
	}
}
