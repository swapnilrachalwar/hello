package training.demo.c;

import org.testng.annotations.Test;

import training.demo.model.Employee;
import training.demo.service.EmployeeService;

public class NewTest 
{
	Employee e=new Employee();
	EmployeeService es=newEmployeeService();
	
  @Test
  public void TestEarlySalary() 
  {
	  e.setEid(1);
	  e.setEname("swapnil");
	  e.setSal(50000);
	  double yearlysal=es.CalculateSalary(e);
	  AssertJUnit.assertEquals(yearlySal, 600000D);
  }
}
