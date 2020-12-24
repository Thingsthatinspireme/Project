package ex01.program.Jeokiyo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Controller {

	DAO dao = new DAO();
	VO vo  = new VO();
	static int OrderNum = 0;

	
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


	VO[] logUserInfo (String UserId, VO[] infoUser) {
		List list = dao.logUserInfo(UserId);
		for (int i = 0; i < list.size(); i++) {
			infoUser[i] = (VO) list.get(i);
			
		}
		return infoUser;
	}//restInfo를 통한 해당 식당의 총 정보 불러오기	
	
	
	void category() {
		View.foodCategories();//로그인창에 넣어서 연결시켜줘야 함 
	}

	VO[] categoryRun(){

		String Category = null;

		VO[] infoCate = new VO [4];
				
		int choice = VO.getSetMenu();

		switch(choice) {

		case 1: 
			Category = "한식"; 
			break; 
		case 2:	
			Category = "중식"; 
			break; 
		case 3: 
			Category = "일식"; 
			break; 
		case 4: 
			Category = "일품"; 
			break; 
		default : 
			System.out.println("잘못 선택하셨습니다.");	
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
		case 0:
			category(); break;
		case 1: 
			RestName = infoCate[choice-1].getRestName(); 
			break;
		case 2: 
			RestName = infoCate[choice-1].getRestName(); 
			break;
		case 3: 
			RestName = infoCate[choice-1].getRestName(); 
			break;
		case 4: 
			RestName = infoCate[choice-1].getRestName(); 
			break;
		default : 
			System.out.println("잘못 선택하셨습니다.");
		}
		
		
		infoRest = restInfo(RestName, infoRest);
		String Address = infoRest[0].getRestAddress();
		String Phone = infoRest[0].getPhone();
		int MinPrice = infoRest[0].getMinPrice();
		 
		View.restaurantMenu(infoRest);
		
		return infoRest;
	}//식당 리스트에서 장바구니로 넘어가기 
	
	
	ArrayList<VO> orderRun(VO[] infoRest) {
		

		int MinPrice = infoRest[0].getMinPrice();
		int choice =0;
		int Total = 0;
		int cnt = 0;
		

		ArrayList<VO> basket= new ArrayList<VO>();
		
		System.out.println("주문하실 메뉴를 선택해주세요 ☞");	
		
		while(true) {
			choice = VO.getOrder();
			int FoodCnt = 1;
			if(choice == 0)
				break;
						
			basket.add(infoRest[choice-1]);
			Total += basket.get(cnt).getUnitPrice();
			
			
			System.out.println(infoRest[choice-1].getFoodName()+ "가 장바구니에 추가됐습니다.");
			System.out.println("총 금액 :" + Total);
	
			System.out.println("-------------------------------------------");
			
			if( Total < infoRest[choice-1].getMinPrice()) {
				View.orderPopUp();
			}else{
				System.out.println("장바구니로가려면 0번을 눌러주세요☞");
				System.out.println();
				System.out.println("계속 고르려면 추가 할 메뉴번호를 눌러주세요 ☞");
				System.out.println("-------------------------------------------");
			}
			
		}
		
		View.orderList(basket, Total);
		return basket;
	}//식당 메뉴창에서 주문메세지 나오게 한것 

	
	public void payment(ArrayList<VO> basket, String UserId) throws InterruptedException {
		VO[] infoUser = new VO[1];
		int Total = 0;
		
		for (int i = 0; i < basket.size(); i++) {
			Total += basket.get(i).getUnitPrice();
		}
		
		infoUser = logUserInfo(UserId, infoUser);
		System.out.println("배달 주문하시려면 1번을 눌러주세요☞ ");
		int choice = VO.getOrder();
		if(choice == 1) 
			View.payment(infoUser, basket, Total); //결제창 출력
				
		String pay[] = {"현금/카드 ", "휴대폰 결제", "까까오페이"};
		System.out.println("결제 방식을 입력해주세요 ☞ ");
		choice = VO.getOrder();
		
		boolean boo = true;
		while(boo) {
			switch (choice) {
			case 1 :
				System.out.println(pay[choice-1] +" 결제를 선택하셨습니다"); 
				break;
			case 2 :
				System.out.println(pay[choice-1] +" 결제를 선택하셨습니다"); 
				break;
			case 3 : 
				System.out.println(pay[choice-1] +" 결제를 선택하셨습니다"); 
				break;
			default :
				System.out.println("결제방식을 선택해주세요");
			}
			System.out.println("결제하시려면 4번을 눌러주세요");
			choice = VO.getOrder();
			if(choice == 4) {
				View.payment2(); //결제를 시작합니다 출력
				Thread.sleep(1500);
				System.out.println();
				View.payment3(); //결제중입니다 출력
			}	
			boo = false;
		
		}		
	}//결제창
	
		
	public void totalRun() throws InterruptedException {
		
		VO[] infoCate = null;
		VO[] infoRest = null;
		String UserId = "parkbloger";
		ArrayList<VO> basket;

			category();
			infoCate = categoryRun();
			infoRest = restInfoRun(infoCate); // 식당 메뉴
			basket= orderRun(infoRest); //주문
			payment(basket, UserId);

	}
}
