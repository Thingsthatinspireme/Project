package ex01.program.Jeokiyo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Controller {
	VO[] infoRest = new VO[10];
	VO[] infoCate = new VO [4];
	VO[] infoUser = new VO[1];
	DAO dao = new DAO();
	VO vo  = new VO();
	static int OrderNum;
	String Category = "";
	String RestName = "";
	int choice =0;
	int Total = 0;

	String UserId = "parkbloger";
	Random rd = new Random();
	int tip = rd.nextInt(20)*100+2000;
	
	HashMap <Integer, Integer>sameFood = new HashMap<Integer, Integer>();
	//앞의 Integer에는 basket의 인덱스넘버, 뒤에 Integer에는 추가된 갯수 
	ArrayList<VO> basket= new ArrayList<VO>();
	
	
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
	

	void categoryRun(){
		//카테고리 화면 출력 
		Random rd = new Random();
		int num = rd.nextInt(5);
		View.foodCategories(num);
		
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
	}	//식당 카테고리 선정 -> 식당 리스트로 들어가기 

	
	void restInfoRun() {
		
		infoCate = restList(Category, infoCate);
		View.restaurantsList(infoCate);
		
		int choice = VO.getSetMenu();
		
		switch(choice) {
		case 0:
			categoryRun();
			restInfoRun();
			break;
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
		

		
	}//식당 리스트에서 식당 메뉴로 넘어가기 
	

	void orderRun() {
//		int MinPrice = infoRest[0].getMinPrice();
		infoRest = restInfo(RestName, infoRest);
		View.restaurantMenu(infoRest); 
		Total = 0;
		int cnt = 0;
		basket.clear();
		sameFood.clear();
		//메뉴선택 시작
		System.out.println("주문하실 메뉴를 선택해주세요 ☞");	
		while(true) {
			choice = VO.getOrder();
			int same = 1;
			int key = 0;
			
			if(choice == 0) {
				
				System.out.println("다른 식당보기로 이동하시면 장바구니가 초기화 됩니다 ");
				restInfoRun();
				orderRun();
			}
			
			if(choice == 11) //장바구니로 넘어가기 
				break;
			
			if(cnt == 0) { 
				basket.add(infoRest[choice-1]);
				sameFood.put(0, 1);
			}else {				
				for (int i = 0; i < basket.size(); i++) {     //선택된 메뉴 중복인지 검사 
					if(basket.contains(infoRest[choice-1])) {
						if(infoRest[choice-1].getFoodName().equals(basket.get(i).getFoodName())) {	
//							System.out.println("i : "+ i);
//							System.out.println("전에시킨 갯수 : " + sameFood.get(i));
							same += sameFood.get(i);
							sameFood.put(i, same);
							System.out.println("총 시킨  갯수 : " + sameFood.get(i));
							key = i;
							break;
						}	
				}else { //중복이 아니라면 추가 
					basket.add(infoRest[choice-1]);
					sameFood.put(basket.size()-1, same);
//					System.out.println("새로추가된 메뉴 시킨갯수 : "+ sameFood.get(basket.size()-1));
					key = basket.size()-1;
					break;
					}
				}	
			} //중복검사 끝 

			Total += infoRest[choice-1].getUnitPrice();
			System.out.println(infoRest[choice-1].getFoodName() + " " + sameFood.get(key) + "개가 장바구니에 추가됐습니다.");
			System.out.println("총 금액 : " + Total);
			System.out.println("-------------------------------------------");
			cnt++; //총 몇개시키는지 셈
			if( Total < infoRest[choice-1].getMinPrice()) {  //주문금액이 주문최소금액보다 작으면 더골르라는 팝업
				View.orderPopUp();
			}else{  //최소금액보다 많이 나오면 결제하겠냐고 물어보기 
				System.out.println("장바구니로가려면 11번을 눌러주세요☞");
				System.out.println();
				System.out.println("계속 고르려면 추가 할 메뉴번호를 눌러주세요 ☞");
				System.out.println("-------------------------------------------");
			}
		}
	}//결제창
	
	
	void myBasket() {
		//장바구니창 시작 		
		View.orderList(basket, sameFood, Total, tip);
		infoUser = logUserInfo(UserId, infoUser);
		System.out.println("주문하시려면 1번을 눌러주세요☞ ");
		choice = VO.getOrder();
		if(choice == 0) {
			orderRun();
			myBasket();
		}
	}
	
	void payment() {
		//결제창 시작
				if(choice == 1) 
					View.payment(infoUser, Total, tip); //결제창 출력
				
				String pay[] = {"현금/카드 ", "휴대폰 결제", "까까오페이"};
				System.out.println("결제 방식을 입력해주세요 ☞ ");
					
				boolean boo = true;
				while(boo) {
					choice = VO.getOrder();
					switch (choice) {
					case 0 :
						myBasket();
						payment();
						break;
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
						System.out.println("결제방식을 다시 선택해주세요");
					}
					break;
			}	
	}
	
	void paySuccess() {

		System.out.println("결제하시려면 4번을 눌러주세요");
		choice = VO.getOrder();
		switch(choice) {
		case 0 : 
			myBasket();
			payment();
		case 4 : 
			View.payment2(); //결제를 시작합니다 출력
			System.out.println();
			View.payment3(); //결제중입니다 출력	
			//주문 데이터 DB로 넘기기 	
			Total += tip;	
			int RestRegiNum = basket.get(0).getRestRegiNum();
			OrderNum = dao.lastOrderNum()+1;
			dao.addOrder(OrderNum, UserId, RestRegiNum, Total);	
			dao.addOrderDetail(basket, OrderNum);
			System.out.println("결제완료");
			break;
		}	
	}
	
	 void end() {
	      
	      //배달소요시간
	      Random rd = new Random();
	      int i = rd.nextInt(31)+30;
	      View.end(i,basket, OrderNum);
	   }

		
	public void totalRun() throws InterruptedException {
		
		View.open();
		categoryRun();
		restInfoRun(); // 식당 메뉴
		orderRun(); //주문
		myBasket();
		payment();
		paySuccess();
		end();
	}
}
