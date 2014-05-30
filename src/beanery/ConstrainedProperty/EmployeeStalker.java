package beanery.ConstrainedProperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import javax.swing.JOptionPane;

public class EmployeeStalker implements SalaryListener, PropertyChangeListener, VetoableChangeListener {
	public void salaryCheck (SalaryEvent se) {
		System.out.println (se.getMessage ());
	}

	public void propertyChange (PropertyChangeEvent evt) {
	    System.out.println ("The Value of <"+evt.getOldValue ()+"> has been replaced with "+evt.getNewValue ()+".");
	}

	public void vetoableChange (PropertyChangeEvent evt) throws PropertyVetoException {
	    System.out.println ("The Value of <"+evt.getOldValue ()+"> will be replaced with "+evt.getNewValue ()+".");
	    
	    // Determine if the change should be vetoed, thereby preventing the change
	    //String allow= (String) JOptionPane.showInputDialog ("Allow? Y/N");
	    System.out.println (evt.getClass ());
	    System.out.println (evt.getSource ().getClass ());
	    System.out.println (evt.getClass ().getEnclosingMethod ());
            if (true) {
                throw new PropertyVetoException("No Transactions should be processed as of today. -admin\n", evt);
            }
	    
	}
	
}