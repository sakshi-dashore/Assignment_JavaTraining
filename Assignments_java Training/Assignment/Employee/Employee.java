
package Assignment;

import java.util.Comparator;




/**
 * @author Sakshi.Dashore
 *
 */
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int salary;
  
  
   
  
    public static final Comparator<Employee> SalaryComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary; // salary is also positive integer
        }
      
    };
  
    public static final Comparator<Employee> NameComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
      
    };
  
   
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';

    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
       
        return true;
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 47 * hash + this.id;
//        hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
//        hash = 47 * hash + this.salary;
//      
//        return hash;
//    }

}
