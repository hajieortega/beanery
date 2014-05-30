package beanery.ObservableProperty;

public class MySalaryListener implements SalaryListener {
	public void salaryCheck (SalaryEvent se) {
		System.out.println (se.getMessage ());
	}
	
}