/*
 * SalaryListener.java
 * @author SonnyGauran
 */

package beanery.BoundProperty;

import java.util.EventListener;

public interface SalaryListener extends EventListener {
    public void salaryCheck(SalaryEvent se);
}
