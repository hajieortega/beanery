/*
 * WebsiteBean.java
 *
 * Created on May 25, 2007, 2:32 PM
 */

package beanery.Bean;

import java.beans.*;
import java.io.Serializable;

/**
 * @author SonnyGauran
 */
public class WebsiteBean extends Object implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String name;
    
    private PropertyChangeSupport propertySupport;

}
