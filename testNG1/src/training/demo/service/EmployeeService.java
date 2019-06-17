package training.demo.service;

import training.demo.model.Employee;

public class EmployeeService 
{
	/**
	 * 
	 * @param e Employee 	
	 * @return double
	 */
	public double CalculateSalary(Employee e)
	{
		return e.getSal()*12;
	}
	
	/**
	 * 
	 * @param e Employee
	 * @return double Apprisal
	 */
public double calculateApprisal(Employee e) {
		
		if(e.getSal()>10000) {
			
			return 500;
		}else {
			
			return 1000;
		}
}
}
