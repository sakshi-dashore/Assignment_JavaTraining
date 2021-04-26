/**
 * 
 */
package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hp
 *
 */
public class EmployeeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101,"sakshi", 250000, "development"));
		employees.add(new Employee(102,"zoya", 250000, "devel"));
		employees.add(new Employee(103,"sak", 2500, "development"));

		System.out.println(employees.stream().filter(e->e.getDepartment().equals("development")).collect( Collectors.averagingDouble(Employee::getSalary)));


	}

}
