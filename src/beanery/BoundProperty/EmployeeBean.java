/*
 * EmployeeBean.java
 * @author SonnyGauran
 */
package beanery.BoundProperty;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.Vector;


public class EmployeeBean implements Serializable {
    
    
    private String name;
    private String department;
    private double salary;
    private int[] phone = new int[10];
    private boolean married;
    private Vector listeners;
    private PropertyChangeSupport pcs;
    
    public EmployeeBean () {
	super();
	this.pcs = new PropertyChangeSupport(this);
	setName("Default Employee");
	setDepartment("Default Department");
	this.salary = 20000;
	setMarried(false);
	listeners = new Vector();
	
    }
    // Name
    public String getName() {
	
	return this.name;
    }
    public void setName(String name) {
	pcs.firePropertyChange ("name", this.name, name);
	this.name = name;
    }
    
    // Department
    public String getDepartment() { return this.department; }
    public void setDepartment(String department) { this.department = department; }

    
    // Salary
    public double getSalary() { return this.salary; }
    public void setSalary(double salary) {
	// Originally, just
	// this.salary = salary;
	
	// Then,
	/*
	this.salary = salary;
	if (getSalary() > 25000) {
	    SalaryEvent se = new SalaryEvent(this, "Salary Too High");
	    Enumeration list = getListeners().elements();
	    while(list.hasMoreElements ()){
		SalaryListener listen = (SalaryListener) list.nextElement ();
		listen.salaryCheck (se);
	    }
	}
	*/
	
	// Now,
	double old = this.salary;
	this.salary = salary;
	pcs.firePropertyChange ("salary", new Double(old), new Double(this.salary));
	
	if (getSalary() > 25000) {
	    
	    SalaryEvent se = new SalaryEvent(this, "Salary Too High");
	    Enumeration list = getListeners().elements();
	    while(list.hasMoreElements ()){
		SalaryListener listen = (SalaryListener) list.nextElement ();
		listen.salaryCheck (se);
	    }
	}
    }
    
    // Phone
    public int getPhone(int index) { return this.phone[index]; }
    public void setPhone(int index, int value) { this.phone[index] = value; }
    // New
    public int[] getPhone() { return this.phone; }
    
    
    // Marital Status
    public boolean isMarried() { return this.married; }
    public void setMarried (boolean married) { this.married = married; }
    
    
    // methods
    
    // Salary
    public void incrementSalary() { setSalary(getSalary()+1000); }
    public void decrementSalary() { setSalary(getSalary()-1000); }
    
    public double calculateTaxOnSalary(double taxRate) {
	return taxRate * getSalary() * 12;
    }
    
    
    public Vector getListeners() {
	return this.listeners;
    }
    public void addSalaryListener(SalaryListener sl) { getListeners().add(sl); }
    public void removeListener(SalaryListener sl) { getListeners().remove (sl); }
    
    public void addPropertyChangeListener (PropertyChangeListener pcl) {
	pcs.addPropertyChangeListener (pcl);
    }
    public void removePropertyChangeListener(PropertyChangeListener pcl) {
	pcs.removePropertyChangeListener (pcl);
    }
}
