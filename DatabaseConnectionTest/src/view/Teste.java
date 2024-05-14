package view;

import java.sql.Connection;
import java.sql.SQLException;

import persistence.GenericDaoMYSQL;

public class Teste {

	public static void main(String[] args) {
		GenericDaoMYSQL dMySql = new GenericDaoMYSQL();
		
		try {
			Connection c = dMySql.getConnection();
			String sgbd = c.getMetaData().getDatabaseProductName();
			System.out.println(sgbd);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
