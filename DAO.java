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
	

	public List restList(String category) {
		List list = new ArrayList();

		try {
			conn();
			// 셀렉트문 입력
			String userSelect = "SELECT rest_name, minprice " +
								" FROM restaurant " +
								" WHERE category = ?";
			
			preStmt = con.prepareStatement(userSelect);
			preStmt.setString(1, category);
			rs = preStmt.executeQuery();

			while (rs.next()) {
	
				String RestName = rs.getString("rest_name");
				int MinPrice = rs.getInt("minprice");
				VO vo = new VO();
				vo.setRestName(RestName);
				vo.setMinPrice(MinPrice);

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
	
	
	public List restInfo(String Rest) {
		List list = new ArrayList();

		
		try {
			conn();
			// 셀렉트문 입력
			String userSelect = "SELECT  r.rest_reginum, r.rest_name, r.rest_ad, r.rest_phonenum, u.foodname, u.unitprice, r.minprice" +
								" FROM restaurant r, unitrestmenu u" +
								" WHERE r.rest_reginum = u.rest_reginum" +
								" AND r.rest_name = ?";
			
			preStmt = con.prepareStatement(userSelect);
			preStmt.setString(1, Rest);
			rs = preStmt.executeQuery();

			while (rs.next()) {
	
				String RestName = rs.getString("rest_name");
				String Address = rs.getString("rest_ad");
				String FoodName = rs.getString("foodname");
				String Phone = rs.getString("rest_phonenum");
				int MinPrice = rs.getInt("minprice");
				int UnitPrice = rs.getInt("unitprice");
				VO vo = new VO();
				vo.setRestName(RestName);
				vo.setAddress(Address);
				vo.setFoodName(FoodName);
				vo.setPhone(Phone);
				vo.setMinPrice(MinPrice);
				vo.setUnitPrice(UnitPrice);
				
				list.add(vo);

			}
			rs.close();
			preStmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}//각 카테고리 식당 메뉴 select 검색
	


	
	


	
}
