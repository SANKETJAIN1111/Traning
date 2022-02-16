package com.org.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
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
