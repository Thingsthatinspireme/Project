package ex01.program.Jeokiyo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	// 3. 클래스변수 선언
	Connection con = null; // 오라클 접속에 필요
	PreparedStatement preStmt = null; // SQL문 실행에 필요
	ResultSet rs = null; // 쿼리문 처리 후 결과값 저장에 필요
	int cnt = 0;

	void conn() {
		// 1.오라클 접속에 필요한 클래스를 메모리에 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// 2.url,id,pass 저장
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "bitcamp";
		String pass = "bitcamp";

		// 4. 오라클 접속
		try {
			con = DriverManager.getConnection(url, id, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	public List restInfo(String cat) {
		List list = new ArrayList();

		try {
			conn();
			// 셀렉트문 입력
			String userSelect = "SELECT restname, category, miniprice " +
								"FROM restaurant " +
								"WHERE category = ?";
			
			preStmt = con.prepareStatement(userSelect);
			preStmt.setString(1, cat);
			rs = preStmt.executeQuery();

			while (rs.next()) {
	
				
				String RestName = rs.getString("RestName");
				String Category = rs.getString("Category");
				int MiniPrice = rs.getInt("MiniPrice");
				VO vo = new VO();
				vo.setRestName(RestName);
				vo.setCategory(Category);
				vo.setMiniPrice(MiniPrice);

				list.add(vo);
			
			}
			rs.close();
			preStmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}//각 카테고리 식당 리스트 select 검색
	
	
	public VO restMenu(String rest) {
		//List list = new ArrayList();

		VO vo = new VO();
		int cnt = 0;

		try {
			conn();
			// 셀렉트문 입력
			String userSelect = "SELECT  r.restreginum, r.restname, r.category, r.address, r.phone, r.miniprice, u.foodmenu, u.unitprice " +
					" FROM restaurant r, unitrestmenu u" +
					" WHERE r.restreginum = u.restreginum" +
					" AND r.restname = ?";
			
			preStmt = con.prepareStatement(userSelect);
			preStmt.setString(1, rest);
			rs = preStmt.executeQuery();

			while (rs.next()) {
	
				String RestName = rs.getString("RestName");
				String Address = rs.getString("Address");
				String FoodMenu = rs.getString("FoodMenu");
				long Phone = rs.getLong("Phone");
				int MiniPrice = rs.getInt("MiniPrice");
				int UnitPrice = rs.getInt("UnitPrice");
				
				vo.setRestName(RestName);
				vo.setAddress(Address);
				vo.setFoodMenu(FoodMenu);
				vo.setPhone(Phone);
				vo.setMiniPrice(MiniPrice);
				vo.setUnitPrice(UnitPrice);

				//list.add(vo);
				cnt++;
			}
			rs.close();
			preStmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}//각 카테고리 식당 메뉴 select 검색
	


	
	


	
}
