package com.org.dao;

public class EmpDaoJDBCImpl implements EmpDao {
	 public EmpDaoJDBCImpl() {
		  System.out.println("Emp Dao JDBC Impl ");
			// TODO Auto-generated constructor stub
		}
	@Override
	public void store() {
		System.out.println("store() called in EmpJDBCImpl");
	}

	@Override
	public void delete() {
		System.out.println("delete() called in EmpJDBCImpl");
	}

}
