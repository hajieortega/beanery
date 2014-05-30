/*
 * SalaryListener.java
 * @author SonnyGauran
 */

package beanery.ObservableProperty;

import java.util.EventListener;

public interface SalaryListener extends EventListener {
    public void salaryCheck(SalaryEvent se);
}
