package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.org.dao.EmpDao;

@Service
public class EmpServiceImpl {
  private EmpDao empdao;
  
  @Autowired
  public EmpServiceImpl(@Qualifier(value = "empDaoJDBCImpl") EmpDao empdao) {
		System.out.println("---EmployeeServiceImpl() created---");
		this.empdao = empdao;
	}


//public void setEmpdao(EmpDao empdao) {
//	this.empdao = empdao;
//}


public void save() {
	System.out.println("save() called in EmpORMImpl");
	empdao.store();
}


public void remove() {
	System.out.println("remove() called in EmpORMImpl");
	empdao.delete();
}



}
