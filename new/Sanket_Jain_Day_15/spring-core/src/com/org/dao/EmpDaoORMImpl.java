package com.org.dao;

public class EmpDaoORMImpl implements EmpDao {
	 public EmpDaoORMImpl() {
		  System.out.println("Emp Dao ORM Impl ");
			// TODO Auto-generated constructor stub
		}
	@Override
	public void store() {
		System.out.println("store() called in EmpORMImpl");
	}

	@Override
	public void delete() {
		System.out.println("delete() called in EmpORMImpl");
	}

}
