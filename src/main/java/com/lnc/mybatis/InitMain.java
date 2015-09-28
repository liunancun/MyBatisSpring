package com.lnc.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InitMain {

	public static void main(String[] args) throws Exception {
		Class.forName("org.h2.Driver");

		Connection conn = DriverManager.getConnection(
				"jdbc:h2:tcp://localhost/~/test", "sa", "");
		Statement stmt = conn.createStatement();

		stmt.execute("DROP TABLE IF EXISTS T_USER");

		stmt.execute("CREATE TABLE T_USER(ID VARCHAR2(255) PRIMARY KEY, NAME VARCHAR2(255), SEX VARCHAR2(255), AGE VARCHAR2(255), DESC VARCHAR2(255))");

		stmt.executeUpdate("INSERT INTO T_USER VALUES('002', 'liunancun', '男', '28', 'liunancun-28')");

		stmt.close();
		conn.close();
	}

}
