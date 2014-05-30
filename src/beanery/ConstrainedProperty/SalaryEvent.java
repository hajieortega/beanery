/*
 * SalaryEvent.java
 * @author SonnyGauran
 */

package beanery.ConstrainedProperty;

import java.util.EventObject;

public class SalaryEvent extends EventObject {
    
    private String message;
    
    public SalaryEvent (Object source, String message) {
	    super(source);
	    setMessage(message);
    }
    protected void setMessage(String message) { this.message = message; }
    public String getMessage() { return this.message; }
}
