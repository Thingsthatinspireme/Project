package ex01.program.Jeokiyo;

import java.util.ArrayList;
import java.util.List;

public class Controller {

	DAO dao = new DAO();
	
	
	VO restName(String cat) {
		
		List list = dao.restInfo(cat);
		VO v = null;
		for (int i = 0; i < list.size(); i++) {
			v = (VO) list.get(i);
			System.out.println(v.getRestName());
			System.out.println(v.getCategory());
			System.out.println(v.getMiniPrice());
			
		}
		return v;
	}
	
	VO restCategory(String cat) {
		
		List list = dao.restInfo(cat);
		VO v = null;
		for (int i = 0; i < list.size(); i++) {
			v = (VO) list.get(i);
//			System.out.println(v.getRestName());
//			System.out.println(i);
		}
		return v;
	}
	
	
	VO restMiniPrice(String cat) {
		
		List list = dao.restInfo(cat);
		VO v = null;
		for (int i = 0; i < list.size(); i++) {
			v = (VO) list.get(i);
//			System.out.println(v.getRestName());
//			System.out.println(i);
		}
		return v;
	}
	
	
	
	
	
	public void order() {
		int choice = VO.getOrder();
				
		ArrayList<Integer> basket= new ArrayList<Integer>(); 
		
		
		
		
	}
	
	public String categoryRun() {
		View.foodCategories();
		
		String cat;
				
		int choice = VO.getSetMenu();
		
		switch (choice) {
		case 1: 
			cat = "한식";
			restList(cat);
			
			View.restaurantInfo(vo1.getRestName(), vo1.getCategory(), choice);
			return vo1.getRestName();
		case 2: 
			cat = "중식";
			List list2 = dao.restInfo(cat);
			VO vo2 = (VO) list2.get(2);
			View.restaurantInfo(vo2.getRestName(), vo2.getCategory(), choice);
			return vo2.getRestName();
		case 3: 
			cat = "일식";
			List list3 = dao.restInfo(cat);
			VO vo3 = (VO) list3.get(2);
			View.restaurantInfo(vo3.getRestName(), vo3.getCategory(), choice);
			return vo3.getRestName();
		case 4: 
			cat = "일식";
			List list4 = dao.restInfo(cat);
			VO vo4 = (VO) list4.get(2);
			View.restaurantInfo(vo4.getRestName(), vo4.getCategory(), choice);
			return vo4.getRestName();
		default : System.out.println("잘못선택하셨습니다");
		}
		return " ";
	}	//식당 카테고리 선정 -> 식당 리스트로 들어가기 

	public void restInfoRun(String RestName) {
		DAO dao = new DAO();
		int choice = VO.getSetMenu();
		
		String rest = RestName;
        		
		switch (choice) {
		case 1:
			VO vo1 = dao.restMenu(rest);
			View.restaurantMenu(vo1.getRestName(), vo1.getAddress(), vo1.getFoodMenu(), vo1.getPhone(), vo1.getMiniPrice(), vo1.getUnitPrice());
			break;
		case 2:
			VO vo2 = dao.restMenu(rest);
			View.restaurantMenu(vo2.getRestName(), vo2.getAddress(), vo2.getFoodMenu(), vo2.getPhone(), vo2.getMiniPrice(), vo2.getUnitPrice());
			break;
		case 3:
			VO vo3 = dao.restMenu(rest);
			View.restaurantMenu(vo3.getRestName(), vo3.getAddress(), vo3.getFoodMenu(), vo3.getPhone(), vo3.getMiniPrice(), vo3.getUnitPrice());
			break;
		case 4:
			VO vo4 = dao.restMenu(rest);
			View.restaurantMenu(vo4.getRestName(), vo4.getAddress(), vo4.getFoodMenu(), vo4.getPhone(), vo4.getMiniPrice(), vo4.getUnitPrice());
			break;
		default:
			System.out.println("잘못선택하셨습니다");

		}
	}//식당 리스트에서 장바구니로 넘어가기 
	
	
	public void restMenuRun() {
		DAO dao = new DAO();
		
        
		int choice = VO.getOrder();
		switch (choice) {
		case 1:
			
		case 2:
		

		case 3:

		case 4:
			
		case 5:
			
		case 6:
			
		case 7:
			
		case 8:
			
		case 9:
		
		case 10:	

		default:
			System.out.println("잘못선택하셨습니다");

		}
	}
		
	
	public void totalRun() {
		String i = categoryRun();
		restInfoRun(i);
	}
}
