package com.umg.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/EmployeeControllerServlet")
public class EmployeeControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeDbUtil employeeDbUtil;
	
	@Resource(name="jdbc/employees")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		try {
			employeeDbUtil = new EmployeeDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		try {
			String theCommand = request.getParameter("opcion");
			
			if (theCommand == null) {
				theCommand = "LIST";
			}
			
			switch (theCommand) {
			case "LIST":
				listEmployees(request, response);
				break;
			
			case "Nuevo":
				addEmployee(request, response);
				break;
				
			default:
				listEmployees(request, response);
				
			}
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}			
		
	}
	
	
	private void addEmployee(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String birthDate = request.getParameter("birthDate");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		String hireDate = request.getParameter("hireDate");
		
		Employee theEmployee = new Employee(birthDate, firstName, lastName, gender,hireDate);
		
		employeeDbUtil.addEmployee(theEmployee);
		
		listEmployees(request, response);
		
	}

	
	
	
	private void listEmployees(HttpServletRequest request, HttpServletResponse response) 
		throws Exception {

		List<Employee> employees = employeeDbUtil.getEmployees();
		
		request.setAttribute("EMPLOYEE_LIST", employees);
				
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-employees.jsp");
		dispatcher.forward(request, response);
	}

}













