package practice.manito.ex01;

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
	
	public List manittoKeyword() {
		List list = new ArrayList();

		try {
			conn();
			// 셀렉트문 입력
			String userSelect = "SELECT *" +
								" FROM KEYWORD ";
			
			preStmt = con.prepareStatement(userSelect);
			rs = preStmt.executeQuery();

			while (rs.next()) {
	
				int manittoNum = rs.getInt("manittoNum");
				String keyword1 = rs.getString("key1");
				String keyword2 = rs.getString("key2");
				String keyword3 = rs.getString("key3");
			
				VO vo = new VO();
				vo.setManittoNum(manittoNum);
				vo.setKeyword1(keyword1);
				vo.setKeyword2(keyword2);
				vo.setKeyword3(keyword3);
			

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
}	
	