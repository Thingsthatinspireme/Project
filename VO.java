package ex01.program.Jeokiyo;

import java.util.Scanner;

public class VO {
	private static Scanner sc = new Scanner(System.in);
	
	String RestName;
	String Category;
	String Address;
	String FoodMenu;
	String Phone;
	int MinPrice;
	int UnitPrice;
	
	
	
	public static Scanner inputKeyboard() {
		return sc;
	}
		
	public static int getSetMenu() {
		System.out.println("번호를 선택해주세요 ☞");	
		return sc.nextInt();
	}//번호선택메소드
	
	public static int getOrder() {
		return sc.nextInt();
	}//주문 입력받는 메소드
	
	public static int getBack() {

		return sc.nextInt();
	}//뒤로가기 입력받을라고 만들어놨는데 아직 구현 X
	
	public String getRestName() {
		return RestName;
	}
	public void setRestName(String restName) {
		RestName = restName;
	}//식당이름 
	
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}//식당 카테고리
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}//식당 번호
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}//식당 주소
	
	
	public String getFoodName() {
		return FoodMenu;
	}
	public void setFoodName(String foodMenu) {
		FoodMenu = foodMenu;
	}//식당 메뉴	
	
	
	public int getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}//메뉴 단가 
	
		
	public int getMinPrice() {
		return MinPrice;
	}
	public void setMinPrice(int miniPrice) {
		MinPrice = miniPrice;
	}//최소 주문금액


}
