package ex01.program.Jeokiyo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	//3. 클래스변수 선언
	Connection con = null;  //오라클 접속에 필요
	PreparedStatement preStmt = null; //SQL문 실행에 필요
	ResultSet rs = null; //쿼리문 처리 후 결과값 저장에 필요
	int cnt = 0;	

	void conn() {
			//1.오라클 접속에 필요한 클래스를 메모리에 로딩
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			//2.url,id,pass 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "bitcamp";
			String pass = "bitcamp";

			//4. 오라클 접속
			try {
				con = DriverManager.getConnection(url,id,pass);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
//한식
	public VO korFood() {
//		List list = new ArrayList();
		VO vo = new VO();
		try {
			conn();
			//셀렉트문 입력 
			String userSelect="SELECT * "
							+ "FROM restinfo "
							+ "WHERE category = '한식'";
			preStmt = con.prepareStatement(userSelect);
			rs = preStmt.executeQuery();
			while(rs.next()) {
				String RestName = rs.getString("RestName");
				String Category  = rs.getString("Category");
				int Grade = rs.getInt("Grade");			
				int MiniPrice = rs.getInt("MiniPrice");
				
				vo.setRestName(RestName);
				vo.setCategory(Category);
				vo.setGrade(Grade);
				vo.setMiniPrice(MiniPrice);
				
//				list.add(vo);

			 }
			rs.close();
			preStmt.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

}
