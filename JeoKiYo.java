package ex01.program.Jeokiyo;

import java.util.Arrays;

public class JeoKiYo {

	public static void main(String[] args) throws Throwable {
		int time = 1500;
		
//		View.open();
//		System.out.println();
//		Thread.sleep(time);
//		View.showStart();
//		System.out.println();
//		Thread.sleep(time);
//		View.join();
//		System.out.println();
//		Thread.sleep(time);
//		View.foodCategories();
//		System.out.println();
//		Thread.sleep(time);
//		View.choiceResturants();
//		System.out.println();
//		Thread.sleep(time);
//		View.resturant();
//		System.out.println();
//		Thread.sleep(time);
//		View.orderList();
//		System.out.println();
//		Thread.sleep(time);
//		View.payment();
//		System.out.println();
//		Thread.sleep(time);
//		View.payment2();
//		System.out.println();
//		Thread.sleep(time);
//		View.end();
//		System.out.println();
//		Thread.sleep(time);
		
//		Controller jeo = new Controller();
//		jeo.totalRun();
		
		Controller c = new Controller();
		c.restName("일식");
		
//		String i = jeo.categoryRun();
//		jeo.restInfoRun(i);
		
		DAO dao = new DAO();
		
//		dao.conn();
//		dao.korFood();
//		VO vo = dao.korFood();
//		System.out.println(vo.getRestName());
		

	}

}
