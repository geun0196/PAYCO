package PAYCO;

import java.util.*;

public class UserDataMap {
	
	public static HashMap<String,UserInfo> userList = new HashMap<>(); 

	public static void getAllData() {
		for (Map.Entry<String, UserInfo> pair : userList.entrySet()) {
			  System.out.println(String.format("id : %s, password : %s", pair.getKey(), pair.getValue().getPassword()));
			  System.out.println(String.format("쿠폰 개수 : %d", pair.getValue().getCoupon()));
			  System.out.println(String.format("포인트 : %d", pair.getValue().getPoint()));
		}
	}
	
	public static int getHavePoint(){
		for (Map.Entry<String, UserInfo> pair : userList.entrySet()) {
			  int temp = pair.getValue().getPoint();
			  return temp;
		}
		return 0;
	}
	
	public static void setPoint(int point){
		for (Map.Entry<String, UserInfo> pair : userList.entrySet()) {
			  System.out.println(String.format("id: %s 사용자, 10퍼센트 포인트 적립 되었습니다", pair.getKey()));
			  pair.getValue().setPoint(point);
		}
	}
}
