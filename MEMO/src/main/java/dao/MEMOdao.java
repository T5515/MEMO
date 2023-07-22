package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import bean.MEMObean;

public class MEMOdao{
	
	
	// インスタンスオブジェクトの生成->返却（コードの簡略化）
	public static MEMOdao getInstance() {
		return new MEMOdao();
	}
	
	
	public ArrayList<MEMObean> MEMOGET(MEMObean get) throws SQLException {
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		StringBuilder sb = new StringBuilder();
		sb.append("<table>");
		
		ArrayList<MEMObean> hyouji = new ArrayList<MEMObean>();
		
		try {
			
			////////////////////////////////////////////////////////// DB接続 ///////////////////////////////////////////////
			Properties pro = new Properties();
			
			String URL = "DB.propertise";
			InputStream input = new FileInputStream(URL);
			pro.load(input);
			
			String db = pro.getProperty("db");
			String user = pro.getProperty("user");
			String pass = pro.getProperty("pass");
			
			con = DriverManager.getConnection(db,user,pass);
			//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			MEMObean set = new MEMObean();
			
			String sql = "SELECT\r\n"
					+ "    T.title\r\n"
					+ "    , T.content \r\n"
					+ "FROM\r\n"
					+ "    T";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				sb.append("<tr>");
				sb.append("<td><p>" + (rs.getString("title")) + "</td>");
				sb.append("<td><input type=\"button\" name=\"title\" value=\"" + (rs.getString("id")) + "\" for=\"memo\"></td>");
				sb.append("</tr>");
			}
			sb.append("</table>");
			
			set.setpop(sb);
			hyouji.add(set);
			
			set = new MEMObean();
			
		} catch(SQLException | IOException e) {
			System.out.println("sql実行失敗");
			e.printStackTrace();
		
		} finally {
			if (con != null) {
				con.close();
			}
		}
		
		return null;
		
	}
}