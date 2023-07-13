package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
		
		
		
		return null;
		
	}
}