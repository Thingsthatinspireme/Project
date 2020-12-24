package ex01.program.Jeokiyo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class View {
	private static Scanner sc = new Scanner(System.in);

	public static Scanner inputKeyboard() {
		return sc;
	}

	

	public static void open() {
	
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|  		.:+・✽비대면결제를 위한 배달앱✽・+:.		   |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                 저   기   요                                   |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	public static void showStart() {

		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                1. LOGIN                  |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|           \"혹시 저기요가 처음이신가요?\"         |");
		System.out.println("|                                          |");
		System.out.println("|               \"2. 회원가입\"                |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	public static void login() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|  ﾟ+o｡◈｡o+ﾟ+o｡◈｡o+  LOGIN  +o｡◈｡o+ﾟ+o｡◈｡o+   |");
		System.out.println("|                                          |");
		System.out.println("|            1. ID :                       |");
		System.out.println("|                                          |");
		System.out.println("|            2. PASSWORD :                 |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	public static void join() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|  ﾟ+o｡◈｡o+ﾟ+o｡◈｡o+  회원가입    +o｡◈｡o+ﾟ+o｡◈｡o+  |");
		System.out.println("|                                          |");
		System.out.println("|   1.ID :                                 |");
		System.out.println("|                                          |");
		System.out.println("|   2.PASSWORD :                           |");
		System.out.println("|                                          |");
		System.out.println("|   3.이름 :                                |"); 
		System.out.println("|                                          |");
		System.out.println("|   4.주민번호 :                             |");
		System.out.println("|                                          |");
		System.out.println("|   5.전화번호 :                             |");
		System.out.println("|                                          |");
		System.out.println("|   6.주소 :                                |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	public static void foodCategories() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|------------------------------------------|");
		System.out.println("| {\\___/} 🍗   🍗   🍗   🍗  🍗   🍗  🍗   🍗  🍗   🍗  🍗    |");  //광고는 가능 하다면 !                   
		System.out.println("| ( •   ▽ •)          '교촌 치킨'               |");  
		System.out.println("| /つ 🍗                  월요일은 허니 콤보 먹는 날                    |"); //그냥 랜덤돌려서 몇개 넣으면 될거같음
		System.out.println("|------------------------------------------|");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|        1. 한식                         2. 중식                   |");
		System.out.println("|                                          |");
		System.out.println("|        3. 일식                         4. 일품                   |");
		System.out.println("|                                          |");
		System.out.println("|                 0.뒤로가기                                  |"); 
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	}
	
	
//	{\__/}
//	( • ▽ •)
//	/つ 🍺 치킨엔 맥주!
//	

	
	public static void restaurantInfo(VO[] infoCate, int choice, String Category) {
		String emo = null;
		switch (choice) {
		case 1 : emo = "🍚"; break;
		case 2 : emo = "🍲"; break;
		case 3 : emo = "🍣"; break;
		case 4 : emo = "🍗";	 break;
		}
				
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("-------------------------------------------");
		System.out.println("\t\t      " + Category+ emo +"\t\t   ");
		System.out.println("-------------------------------------------");
		System.out.println();
		for (int i = 0; i < infoCate.length; i++) {
			System.out.print(" " + (i+1) + ". " + infoCate[i].getRestName() + "\t\t");
			System.out.print("최소 주문금액 : " + infoCate[i].getMinPrice());
			System.out.println();
			System.out.println();
		}
		System.out.println();
		System.out.println("                0. 뒤로가기                                 ");
		System.out.println();
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	} //간단하게 수정한 category
	
	

	

	public static void restaurantMenu(VO[] infoRest) {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("-------------------------------------------");
		System.out.println("\t\t" + infoRest[0].getRestName() +"\t\t     ");
		System.out.println("-------------------------------------------");
		System.out.println(" 최소 주문금액 : "+ infoRest[0].getMinPrice());
		System.out.println(" 주소 : "+ infoRest[0].getRestAddress() );
		System.out.println(" 전화번호 : "+ infoRest[0].getPhone() );
		System.out.println("-------------------------------------------");
		System.out.println("                📜   메뉴  📜                                          ");
		System.out.println();
		for (int i = 0; i < infoRest.length; i++) {
			System.out.println((i+1) + ". " + infoRest[i].getFoodName() + "\t\t\t" + infoRest[i].getUnitPrice() + "원");	
		}

		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("\t\t 0. 주문하기  🛍  ");
		System.out.println("\t\t 11. 돌아가기");
		System.out.println();
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	}
	

	public static void orderPopUp() {
		System.out.println("------------------------------");
		System.out.println("|                            |");
		System.out.println("| 최소주문 금액이 넘어야 결제가 됩니다  |");
		System.out.println("|      💵  더  추가해주세요 💵              |");
		System.out.println("|                            |");
		System.out.println("------------------------------");
		System.out.println();
	}
	
	public static void orderList(ArrayList<VO>basket, int Total) {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("--------------------------------------------");
		System.out.println("\t\t"+basket.get(0).getRestName()+"\t\t\t");
		System.out.println("--------------------------------------------");
		for (int i = 0; i < basket.size(); i++) {
			System.out.println(basket.get(i).getFoodName());
			System.out.println(basket.get(i).getUnitPrice());
			System.out.println("--------------------------------------------");
		}
	
		System.out.println("--------------------------------------------");
		System.out.println(" 총 주문금액 : " + Total);
		System.out.println("--------------------------------------------");
		System.out.println("\t" + "1." + Total + " 원 배달 주문 하기  🛍  ");
		System.out.println("                2. 뒤로 가기                                    ");  //최소금액이 넘지 않았습니다 문구 추가 
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	} //이걸로 장바구니 연결하시면 됩니다 
	
	public static void payment(VO[] infoUser, ArrayList<VO>basket, int Total) {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("--------------------------------------------");
		System.out.println("\t\t🏠  배달 정보  🏠 ");
	
		System.out.println("  주소 : "+ infoUser[0].getUserAddress());
		System.out.println();
		System.out.println("  연락처 : "+ infoUser[0].getUserPhoneNum());
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("\t\t💳  결제수단 💳  ");
		System.out.println("  1. 신용 / 체크카드 ");
		System.out.println("  2. 휴대폰결제 ");
		System.out.println("  3. 까까오페이 ");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("\t\t💰  결제금액  💰 ");
		System.out.println("  주문금액  \t\t\t" + Total + " 원");
		System.out.println("   배달팁                                                    2,000 원   ");  //이클립스에서 변수로 설정하기 
		System.out.println("--------------------------------------------");
		System.out.println("             4. " + Total + "원 결제하기   🛍  ");
		System.out.println("             5. 뒤로 가기                                          ");
		System.out.println();
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	}
	
	public static void payment2() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|              결제를 시작합니다...            |");
		System.out.println("|                                          |");
		System.out.println("|                🤑   💳  🤑                                              |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	}
	
	public static void payment3() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|              결제가 진행중입니다...           |");
		System.out.println("|                                          |");
		System.out.println("|                🤑   💳  🤑                                              |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	}
	

	public static void end() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|                                          |");
		System.out.println("|                결  제  완  료                                  |");
		System.out.println("|                                          |");
		System.out.println("|     배달 예상 소요시간  : 40 분                                 |");
		System.out.println("|     배달원 : 김땡땡 배달원                                         |");
		System.out.println("|                                          |");
		System.out.println("|     식당 : 김가네                                                      |");
		System.out.println("|     메뉴 : 직화 제육볶음                                            |");
		System.out.println("|           잔치국수                                                  |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println();
	}
	
}
