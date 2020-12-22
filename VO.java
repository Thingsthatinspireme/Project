package ex01.program.Jeokiyo;

import java.util.Scanner;

public class VO {
	private static Scanner sc = new Scanner(System.in);
	
	String RestName;
	String Category;
	String Address;
	String FoodMenu;
	int MiniPrice;
	int UnitPrice;
	Long Phone;
	
	
	public static Scanner inputKeyboard() {
		return sc;
	}
		
	public static int getSetMenu() {
		System.out.println("번호를 선택해주세요 ☞");
		return sc.nextInt();
	}
	
	public static int getOrder() {
		System.out.println("주문하실 메뉴의 번호를 눌러주세요 ☞");
		return sc.nextInt();
	}
	
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
	
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}//식당 번호
	
	
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}//식당 주소
	
	
	public String getFoodMenu() {
		return FoodMenu;
	}
	public void setFoodMenu(String foodMenu) {
		FoodMenu = foodMenu;
	}//식당 메뉴	
	
	
	public int getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}//메뉴 단가 
	
		
	public int getMiniPrice() {
		return MiniPrice;
	}
	public void setMiniPrice(int miniPrice) {
		MiniPrice = miniPrice;
	}//최소 주문금액
	
	
	



	

}
