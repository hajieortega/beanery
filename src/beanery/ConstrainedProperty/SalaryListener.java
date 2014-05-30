/*
 * SalaryListener.java
 * @author SonnyGauran
 */

package beanery.ConstrainedProperty;

import java.util.EventListener;

public interface SalaryListener extends EventListener {
    public void salaryCheck(SalaryEvent se);
}
