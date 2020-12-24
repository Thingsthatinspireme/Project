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
				String RestAddress = rs.getString("rest_ad");
				String FoodName = rs.getString("foodname");
				String Phone = rs.getString("rest_phonenum");
				int MinPrice = rs.getInt("minprice");
				int UnitPrice = rs.getInt("unitprice");
				VO vo = new VO();
				vo.setRestName(RestName);
				vo.setRestAddress(RestAddress);
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
	

	public List logUserInfo(String UserId) {
		List list = new ArrayList();

		
		try {
			conn();
			// 셀렉트문 입력
			String userSelect = "SELECT user_phonenum, user_ad" +
								" FROM users" +
								" WHERE user_id = ?";
			
			preStmt = con.prepareStatement(userSelect);
			preStmt.setString(1, UserId);
			rs = preStmt.executeQuery();

			while (rs.next()) {
	
				String UserPhoneNum = rs.getString("user_phonenum");
				String UserAddress = rs.getString("user_ad");
			
				VO vo = new VO();
	
				vo.setUserPhoneNum(UserPhoneNum);
				vo.setUserAddress(UserAddress);
	
				
				list.add(vo);

			}
			rs.close();
			preStmt.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}//로그인한 사람의 정보 검색 
	

	
//	public void addOrder(VO vo) {
//		try {
//			conn();
//			String userInsert = "INSERT INTO member(UserName,UserId,UserPw,UserPhoneNum,UserAdd) VALUES(?,?,?,?,?)";
//			preStmt = con.prepareStatement(userInsert); //pre는 statement에 쿼리문을 넣는다.
//			//for (int i = 0; i < 100; i++) {
//				preStmt.setString(1, vo.getUserName());
//				preStmt.setString(2, vo.getUserId());
//				preStmt.setInt(3, vo.getUserPw());
//				preStmt.setInt(4, vo.getUserPhoneNum());
//				preStmt.setInt(5, vo.getUserAdd());
////			}
//			preStmt.executeUpdate(); //insert 와 update는 이걸로 그냥은 여기에 쿼리문을 넣는다.
//			preStmt.close();
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	} //주문정보 데베로넘기기 


	
}
