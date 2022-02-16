package com.org.service;

import com.org.dao.EmpDao;


public class EmpServiceImpl {
  private EmpDao empdao;
  public EmpServiceImpl(EmpDao empdao) {
		System.out.println("---EmployeeServiceImpl() created---");
		this.empdao = empdao;
	}


public void setEmpdao(EmpDao empdao) {
	this.empdao = empdao;
}


public void save() {
	System.out.println("save() called in EmpORMImpl");
	empdao.store();
}


public void remove() {
	System.out.println("remove() called in EmpORMImpl");
	empdao.delete();
}



}
