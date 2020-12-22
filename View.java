package ex01.program.Jeokiyo;

import java.util.ArrayList;
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
		System.out.println("|  .:+・✽라이더까지 선택할 수 있는 비대면 배달앱✽・+:.  |");
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
		System.out.println("|                                          |"); //식당이름 메뉴이름 ....검색 만드는건 무리일지...
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	
//	{\__/}
//	( • ▽ •)
//	/つ 🍺 치킨엔 맥주!
//	

	
	public static void restaurantInfo(String RestName, String Category, int choice ) {
		String emo = null;
		switch (choice) {
		case 1 : emo = "🍚"; break;
		case 2 : emo = "🍲"; break;
		case 3 : emo = "🍣"; break;
		case 4 : emo = "🍗";	 break;
		}
				
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|------------------------------------------|");
		System.out.println("|\t\t       " + Category + emo +"\t\t   |");
		System.out.println("|------------------------------------------|");
		System.out.println("| 0. 식당 별점 순으로 보기                                              |");
		System.out.println("|------------------------------------------|");
		System.out.println("| 1. " + RestName +"\t\t\t|" );
		System.out.println("| 2. 조마루 감자탕                                                         |");
		System.out.println("| 3. 혜화동 왕돈까스                                                      |");
		System.out.println("| 4. 엽기떡볶이                                                             |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
//	public static void chiFood() {
//		
//		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 중식🍚                                                                                           |");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 0. 식당 별점 순으로 보기                                              |");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 1. 혜영반점                                                                |");
//		System.out.println("| 2. 천궁전 마라탕                                                         |");
//		System.out.println("| 3. 비트 양꼬치                                                            |");
//		System.out.println("| 4. 라화쿵푸                                                                |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
//	}
//	
//	public static void japFood() {
//		
//		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 일식🍚                                                                                          |");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 0. 식당 별점 순으로 보기                                              |");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 1. 스시하마                                                                |");
//		System.out.println("| 2. 비트돈부리                                                             |");
//		System.out.println("| 3. 잇쇼니라멘                                                             |");
//		System.out.println("| 4. 고메야                                                                   |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
//	}
//	
//	public static void speFood() {
//		
//		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 일품🍚                                                                                          |");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 0. 식당 별점 순으로 보기                                              |");
//		System.out.println("|------------------------------------------|");
//		System.out.println("| 1. 교촌치킨                                                                |");
//		System.out.println("| 2. 비트치킨                                                                |");
//		System.out.println("| 3. 맥도날드                                                                |");
//		System.out.println("| 4. 크라이치즈버거                                                       |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("|                                          |");
//		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
//	}
	
	public static void restaurantMenu(String RestName, String Address, String Menu, Long Phone, int MiniPrice, int UnitPrice) {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|------------------------------------------|");
		System.out.println("|\t\t       " + RestName +"\t\t     |");
		System.out.println("|------------------------------------------|");
		System.out.println("| 최소 주문금액 : "+ MiniPrice );
		System.out.println("| 주소 : "+ Address );
		System.out.println("| 전화번호 : "+ Phone );
		System.out.println("|------------------------------------------|");
		System.out.println("|                📜   메뉴  📜                                          |");
		System.out.println("|                                          |");
		System.out.println("| 1. " + Menu + "\t\t\t" + UnitPrice + "원|");
		System.out.println("| 2. 직화 제육 볶음                                          7500 원 |");
		System.out.println("| 3. 돈까스                                                     7000 원 |");
		System.out.println("| 4. 잔치국수                                                  6000 원 |");
		System.out.println("| 5. 오므라이스                                               6500 원 |");
		System.out.println("|                                          |");
		System.out.println("|------------------------------------------|");
		System.out.println("| 0. 주문하기  🛍                                                                         |");
		System.out.println("|                                          |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	public static void orderList() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|------------------------------------------|");
		System.out.println("|                 김   가   네                                   |");
		System.out.println("|------------------------------------------|");
		System.out.println("|  직화 제육 볶음                                                            |");
		System.out.println("|  1개                                                                           |");
		System.out.println("|  7500원                                                                     |");
		System.out.println("|------------------------------------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("|  잔치국수                                                                    |");
		System.out.println("|  1개                                                                           |");
		System.out.println("|  6000원                                                                     |");
		System.out.println("|------------------------------------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("| 총 주문금액                                               13,500 원  |");
		System.out.println("|------------------------------------------|");
		System.out.println("|          1. 13500원 배달 주문 하기  🛍                       |");
		System.out.println("|          2. 뒤로 가기                                             |");  //최소금액이 넘지 않았습니다 문구 추가 
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	public static void payment() {
		
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█   저  기  요    ▓█▓█▓█▓█▓█▓█▓█▓█");
		System.out.println("|------------------------------------------|");
		System.out.println("|               🏠  배달 정보  🏠                                      |");
		System.out.println("| 주소 소ㅑㄹ라소ㅑㄹ라                                                   |");
		System.out.println("|                                          |");
		System.out.println("| 010-****-****                            |");
		System.out.println("|------------------------------------------|");
		System.out.println("|              🚲  라이더 선택 🚲                                     |");
		System.out.println("| 이 지역 최고 별점 배달원                                                |");
		System.out.println("| 1. 김땡땡                                                                   |");
		System.out.println("| 2. 박땡떙                                                                   |");
		System.out.println("| 3. 이땡땡                                                                   |");
		System.out.println("|------------------------------------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("|               💳  결제수단 💳                                        |");
		System.out.println("| 4. 신용 / 체크카드                                                     |");
		System.out.println("| 5. 휴대폰결제                                                             |");
		System.out.println("| 6. 까까오페이                                                             |");
		System.out.println("|------------------------------------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("|               💰  결제금액  💰                                        |");
		System.out.println("|   주문금액                                               13,500 원  |");
		System.out.println("|   배달팁                                                    2,000 원  |");
		System.out.println("|------------------------------------------|");
		System.out.println("|            7. 15500원 결제하기   🛍                          |");
		System.out.println("|            8. 뒤로 가기                                         |");
		System.out.println("▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█▓█");
	}
	
	public static void payment2() {
		
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
	}
	
	
}
