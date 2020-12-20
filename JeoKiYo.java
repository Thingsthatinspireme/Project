package ex01.program.Jeokiyo;

public class JeoKiYo {

	public static void main(String[] args) throws Throwable {
		int time = 1500;
		
		JeokiyoView.open();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.showStart();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.join();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.foodCategories();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.choiceResturants();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.resturant();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.orderList();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.payment();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.payment2();
		System.out.println();
		Thread.sleep(time);
		JeokiyoView.end();
		System.out.println();
		Thread.sleep(time);
	}

}
