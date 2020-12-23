package ex01.program.Jeokiyo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

	DAO dao = new DAO();
	
	
	VO[] restList(String Category, VO[] infoCate) {
		List list = dao.restList(Category);
		for (int i = 0; i < list.size(); i++) {
			infoCate[i] = (VO) list.get(i);
		}
		return infoCate;
	}//category를통한 식당 정보 불러오기	
		
	VO[] restInfo(String RestName, VO[] infoRest) {
		List list = dao.restInfo(RestName);
		for (int i = 0; i < list.size(); i++) {
			infoRest[i] = (VO) list.get(i);
			
		}
		return infoRest;
	}//restInfo를 통한 해당 식당의 총 정보 불러오기



	VO[] categoryRun() {

		String Category = null;

		VO[] infoCate = new VO [4];
		
		View.foodCategories();
		int choice = VO.getSetMenu();
		
		switch(choice) {
		case 1: Category = "한식"; break; 
		case 2:	Category = "중식"; break; 
		case 3: Category = "일식"; break; 
		case 4: Category = "일품"; break; 
		default : System.out.println("잘못 선택하셨습니다.");	
		}

		
		infoCate = restList(Category, infoCate);

		View.restaurantInfo(infoCate, choice, Category);

		return infoCate;
	
	}	//식당 카테고리 선정 -> 식당 리스트로 들어가기 

	VO[] restInfoRun(VO[] infoCate) {
	
		int choice = VO.getSetMenu();
		
		VO[] infoRest = new VO[10];

		String RestName = null;

		
		switch(choice) {
		case 1: RestName = infoCate[choice-1].getRestName(); break;
		case 2: RestName = infoCate[choice-1].getRestName(); break;
		case 3: RestName = infoCate[choice-1].getRestName(); break;
		case 4: RestName = infoCate[choice-1].getRestName(); break;
		default : System.out.println("잘못 선택하셨습니다.");
		}
		
		
		infoRest = restInfo(RestName, infoRest);
		String Address = infoRest[0].getAddress();
		String Phone = infoRest[0].getPhone();
		int MinPrice = infoRest[0].getMinPrice();
		 
		View.restaurantMenu(infoRest);
		
		return infoRest;
	}//식당 리스트에서 장바구니로 넘어가기 
	
	
	public void order(VO[] infoRest) {
		

		int MinPrice = infoRest[0].getMinPrice();
		int choice =0;
		int Total = 0;
		int cnt = 0;
		ArrayList<VO> basket= new ArrayList<VO>();
		
		System.out.println("주문하실 메뉴를 선택해주세요 ☞");	
		
		while(true) {
			choice = VO.getOrder();
			if(choice == 0)
				break;
						
			basket.add(infoRest[choice-1]);
			Total += basket.get(cnt).getUnitPrice();
			System.out.println(infoRest[choice-1].getFoodName()+" (가)이 장바구니에 추가됐습니다.");
			System.out.println("총 금액 :" + Total);
			System.out.println("-------------------------------------------");
			cnt++;
			if( Total < infoRest[choice-1].getMinPrice()) {
				View.orderPopUp();
			}else{
				System.out.println("결제하려면 '0번'을 눌러주세요 ☞");
				System.out.println();
				System.out.println("계속 고르려면 추가 할 메뉴번호를 눌러주세요 ☞");
				System.out.println("-------------------------------------------");
			}
			
		}
		
		View.orderList(basket, Total);
		
	}//식당 메뉴창에서 주문메세지 나오게 한것 

	
	public void payment() {
		
	}
	
	
	public void totalRun() {
		
		VO[] info = restInfoRun(categoryRun()); // 식당 메뉴
		order(info); //주문
	}
}
