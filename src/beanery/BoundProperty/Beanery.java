/*
 * Beanery.java
 * @author SonnyGauran
 */

package beanery.BoundProperty;


public class Beanery {

    public Beanery () { }
    public static void main(String args[]) {

	EmployeeBean minion = new EmployeeBean();
	EmployeeStalker spy = new EmployeeStalker();
	minion.addPropertyChangeListener (spy);
	minion.addSalaryListener (spy);
	
	minion.setName ("Nobody");
	minion.setDepartment ("Some Department");
	minion.setSalary (20000);

	minion.setSalary (21000);
	minion.setName ("Some other nobody");
	System.out.println("Salary: "+ minion.getSalary ());
	minion.setSalary (26000);
	System.out.println("Salary: "+ minion.getSalary ());
    }
    
}
