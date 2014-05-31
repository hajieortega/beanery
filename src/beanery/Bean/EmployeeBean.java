/*
 * EmployeeBean.java
 * @author SonnyGauran
 */
package beanery.Bean;
import java.io.Serializable;
/*
	// Specification of JavaBeans
	// 1. Serializable
	// 2. No-argument Constructor
	// 3. Instantiable
	// 4. Follow naming conventions with it's methods
*/
public class EmployeeBean implements Serializable {
    private String name;
    private String department;
    private double salary;
    private int[] phone;
    private boolean married;

    public EmployeeBean () {
	super();
	this.phone = new int[10];
    }
    //  (Simple property) Name
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    // (Simple property) Department
    public String getDepartment() { return this.department; }
    public void setDepartment(String department) { this.department = department; }
    // (Simple property) Salary
    public double getSalary() { return this.salary; }
    public void setSalary(double salary) { this.salary = salary; }
    // (Indexed Property) Phone
    public int getPhone(int index) { return this.phone[index]; }
    public void setPhone(int index, int value) { this.phone[index] = value; }
    // ( boolean Property) Marital Status
    public boolean  isMarried() { return this.married; }
    public void setMarried (boolean married) { this.married = married; }

    // methods
    // Salary
    public void incrementSalary() { setSalary(getSalary()+1000); }
    public void decrementSalary() { setSalary(getSalary()-1000); }

    @Override
    public String toString() {
        return super.toString();
    }
}
