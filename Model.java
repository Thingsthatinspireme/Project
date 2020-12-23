package ex01.program.Jeokiyo;

import java.util.Scanner;

public class Model {
	private String restName;
	private String menu;
	private int price; 
	
//	private static Scanner sc = new Scanner(System.in);
//	
//	public static Scanner inputKeyboard() {
//		return sc;
//	}
	
//	public static int getSetMenu() {
//		System.out.println("번호를 선택해주세요 ☞");
//		return sc.nextInt();
//	}
//	
//	public static int getOrder() {
//		System.out.println("주문하시겠습니까?>>");
//		return sc.nextInt();
//	}
//	
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public String getRestName() {
		return restName;
	}
	
	
	public void setMenu(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	
	
	

}
