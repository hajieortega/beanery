package beanery.BoundProperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class EmployeeStalker implements SalaryListener, PropertyChangeListener {
	public void salaryCheck (SalaryEvent se) {
		System.out.println (se.getMessage ());
	}

	public void propertyChange (PropertyChangeEvent evt) {
	    System.out.println ("The Value of <"+evt.getOldValue ()+"> has been replaced with "+evt.getNewValue ()+".");
	}
	
}