/*
 * Beanery.java
 * @author SonnyGauran
 */

package beanery.Bean;

public class Beanery {
    public Beanery () { }
    public static void main(String args[]) {
	EmployeeBean minion = new EmployeeBean();
	minion.setName ("Nobody");
	minion.setDepartment ("Some Department");
	minion.setSalary (20000);
	minion.setPhone(0,2100);
	minion.setMarried(false);
	
	System.out.print (minion.getSalary());
	minion.incrementSalary ();
	System.out.print (minion.getSalary());
	
    }
}
