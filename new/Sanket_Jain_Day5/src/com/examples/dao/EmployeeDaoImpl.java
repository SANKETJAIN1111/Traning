package com.examples.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.examples.beans.Employee;
import com.examples.exceptions.EmployeeNotFoundException;
// performs CRUD operations for Employee 
public class EmployeeDaoImpl implements EmployeeDao {
	// store method to store employee data like name & salary
	public int store(Employee employee) {
		int status = -1;
		try {
			// 1st & 2nd step is done by DBUtil.getConnection()
			Connection connection = DBUtil.getConnection();
			// 3rd step is to prepare the statement
			String query = "insert into employee(name, salary) values(?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);
			// update the ? by setting values
			statement.setString(1, employee.getEmpName()); // sets name of employee to 1st ?
			statement.setDouble(2, employee.getEmpSalary()); // sets salary of employee to 2nd ?
			// now the query is ready with values, so you can execute using executeUpdate()
			status = statement.executeUpdate(); //returns number of rows affected
			// closing the resources
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	public Employee findById(int empId) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, empId);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
			if(employee == null) {
				// throw checked exception & propagate to caller
				throw new EmployeeNotFoundException("Sorry, "+empId+" not found");
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();;
		Employee employee = null;
		try {
//			Employee[] eList = new Employee[empList.size()];
//			if(!empList.isEmpty()) 
//				eList = empList.toArray(eList);
//				return eList;
			Connection connection = DBUtil.getConnection();
			String query = "select * from employee";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			//System.out.println(result.getFetchSize());
			while(result.next()) {
				employee = new Employee( result.getInt(1), result.getString(2), result.getDouble(3));
				empList.add(employee);
				//System.out.printf("Employee Details : "+ employee.toString());
			}
			result.close();
			statement.close();
			connection.close();
			if(employee == null) {
				// throw checked exception & propagate to caller
				System.out.println("Sorry, Data not found");
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return empList;
	}
	@Override
	public void update(int id, double salary) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
 		Employee employee = null;
		try {
			Connection connection = DBUtil.getConnection();
			//
			String query = "update employee set name = ?, salary = ? where id = ?";
			//String query1 = "update employee set name='sanket jain', salary = 1234.00 where id=1 ";
			PreparedStatement statement = connection.prepareStatement(query);
			//statement.setInt(1, id);
			statement.setInt(3, id);
			statement.setString(1, "sanetjain");
			statement.setDouble(2, salary);
			statement.executeUpdate();
			String fetch = "select * from employee where id = ?";
			statement = connection.prepareStatement(fetch);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			//int status = statement.executeUpdate();
			if(result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
				// throw checked exception & propagate to caller	
			}
			System.out.println("Database Updated successfully");
			//result.close();
			statement.close();
			connection.close();
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int deleteById(int id) throws EmployeeNotFoundException {
	
		int status  = -1;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "delete from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, id);
			status = statement.executeUpdate();
			status = statement.getUpdateCount();
			statement.close();
			connection.close();
			if(status < 1) {
				// throw checked exception & propagate to caller
				throw new EmployeeNotFoundException("Sorry, "+id+" not found");
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
}
