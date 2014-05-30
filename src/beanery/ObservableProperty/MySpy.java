package beanery.ObservableProperty;

public class MySpy implements SalaryListener {
	public void salaryCheck (SalaryEvent se) {
		System.out.println (se.getMessage ());
	}
	
}