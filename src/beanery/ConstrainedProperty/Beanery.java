/*
 * Beanery.java
 * @author SonnyGauran
 */

package beanery.ConstrainedProperty;

import java.beans.PropertyChangeListener;


public class Beanery {
    
    public Beanery () { }
    public static void main(String args[]) {
	EmployeeBean minion = new EmployeeBean();
	
	EmployeeStalker spy = new EmployeeStalker();
	//minion.addPropertyChangeListener (spy);
	minion.addVetoableChangeListener (spy);
	//minion.addSalaryListener (spy);
	
	minion.setName ("Nobody");
	minion.setDepartment ("Some Department");

	minion.setSalary (27000);
	System.out.println("Salary: "+ minion.getSalary ());
	
    }
    
}
