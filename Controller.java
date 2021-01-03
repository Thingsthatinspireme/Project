package practice.manito.ex01;

import java.util.List;

public class Controller {
	DAO dao = new DAO();
	VO vo = new VO();
	List list;

	VO[] manittoList() {
		list = dao.manittoKeyword();
		VO[] maList = new VO[list.size()];
		for (int i = 0; i < list.size(); i++) {
			maList[i] = (VO) list.get(i);
		}
		return maList;
	}
	
	
	void selectManitto(VO[] maList, int num) {
	
	
		int[] cnt = new int[maList.length];
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = 0;
		}
	
		int i = 0;
			for (i = 0; i < maList.length; i++) {
				System.out.println(i+ "의 값");
				if (maList[num-1].getKeyword1().equals(maList[i].getKeyword1()) && num-1 != i) {
					cnt[i]+= 1;
				}	
//				System.out.println(maList[num-1].getKeyword1());
//				System.out.println(maList[i].getKeyword1());
//				System.out.println(cnt[i]);
				if (maList[num-1].getKeyword2().equals(maList[i].getKeyword2()) && num-1 != i) {
					cnt[i]+= 1;
				}	
//				System.out.println(cnt[i]);
				if (maList[num-1].getKeyword3().equals(maList[i].getKeyword3()) && num-1 != i) {
					cnt[i]+= 1;
				}	
//				System.out.println(cnt[i]);
			}
	
		int manitto = cnt[0];
		for (i = 0; i < cnt.length; i++) {
			if (manitto < cnt[i])
				manitto = i;
		}

	
		System.out.println("당신의 마니또는" + maList[manitto].getManittoNum() + "입니다.");
		
	} // 키워드가 제일 많이 일치하는 대상 뽑기 

}
