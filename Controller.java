package ex01.program.Jeokiyo;

import java.util.Scanner;

public class Controller {

	public void restaurantInfo() {

	}

	public void mainRun() {
		int choice;
		View.foodCategories();
		choice = Model.getSetMenu();
		switch (choice) {
		case 1: 
			View.korFood(); 
			break;
		case 2: 
			//View.chiFood(); 
			break;
		case 3: 
			 
			break;
		case 4: 
		
			break;
		default : System.out.println("잘못선택하셨습니다");
			

		}
	}
}
