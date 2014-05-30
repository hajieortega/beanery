/*
 * CountryBean.java
 *
 * Created on May 25, 2007, 2:42 PM
 */

package beanery.Bean;

import java.beans.*;
import java.io.Serializable;

/**
 * @author SonnyGauran
 */
public class CountryBean extends Object implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    String country;       
    public CountryBean () { }
    public void getCountry(String code){
	// return country by code
    }
    public void getCountries(){
	// return array of countries
    }
    
}
