package com.umg.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeDbUtil {

	private DataSource dataSource;

	public EmployeeDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	public List<Employee> getEmployees() throws Exception {
		
		List<Employee> employees = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = dataSource.getConnection();
			String sql = "select * from employees where emp_no >= 499990";
			
			myStmt = myConn.createStatement();
		
			myRs = myStmt.executeQuery(sql);
			
			while (myRs.next()) {
				int empNo = myRs.getInt("emp_no");
				String birthDate = myRs.getString("birth_date");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String gender = myRs.getString("gender");
				String hireDate = myRs.getString("hire_date");

				Employee tempEmployee = new Employee(empNo, birthDate, firstName, lastName, gender,hireDate);

				employees.add(tempEmployee);
			}
			
			return employees;		
		}
		finally {

			close(myConn, myStmt, myRs);
		}		
	}

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {

		try {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();  
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	
	public void addEmployee(Employee employee) throws Exception{
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			myConn = dataSource.getConnection();
			String sql = "INSERT INTO employees (birth_date, first_name, last_name, gender, hire_date) "
					+ " VALUES (?,?,?,?,?)";
			
			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1,employee.getBirthDate());
			myStmt.setString(2,employee.getFirstName());
			myStmt.setString(3,employee.getLastName());
			myStmt.setString(4,employee.getGender());
			myStmt.setString(5,employee.getHireDate());
			
			myStmt.execute();
						
		}
		
		finally {
			close(myConn, myStmt, null);
		}
	}

}















