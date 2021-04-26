 package Assignment;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;




/**
 * Test class to test sorting of Employee object on different parameters.
 * each test method will test each Comparator implementation.
 * @author http://javarevisited.blogpot.com
 */
public class EmployeeUser {
  
 public static void main(String []args)
 {

        Employee e1 = new Employee(1, "sakshi", 1000);
        Employee e2 = new Employee(2, "zoya", 1300);
        Employee e3 = new Employee(3, "Bhavy", 10);
        Employee e4 = new Employee(4, "Chinu", 100);
        Employee e5 = new Employee(5, "AAA", 1200);
      
        List<Employee> listOfEmployees = new ArrayList<Employee>();
        listOfEmployees.add(e1);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
        listOfEmployees.add(e5);
        System.out.println("Unsorted List : " + listOfEmployees);
      
        Collections.sort(listOfEmployees);      
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e5, listOfEmployees.get(4));
        
        
        Collections.sort(listOfEmployees, Employee.NameComparator);
        assertEquals(e1, listOfEmployees.get(0));
        assertEquals(e4, listOfEmployees.get(4));
      
      
        Collections.sort(listOfEmployees, Employee.SalaryComparator);
        assertEquals(e3, listOfEmployees.get(0));
        assertEquals(e2, listOfEmployees.get(4));
      
        
 }
 
	private static void assertEquals(Employee e1, Employee employee) {
		// TODO Auto-generated method stub
		
	}
 
	
}