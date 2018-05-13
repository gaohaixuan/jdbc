package cn.nytn.c3p0;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TheC3p0 {
	public static void main(String[] args) {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		Connection conn=null;
		Statement statem=null;
		
		try {
			conn = cpds.getConnection();
			statem = conn.createStatement();
			String sql="insert into biao02(name,pow) values('dasb','123')";
			int s = statem.executeUpdate(sql);
			System.out.println(s);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cpds.close();
		}
	}
}
