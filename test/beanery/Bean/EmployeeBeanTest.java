/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beanery.Bean;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author manila
 */
public class EmployeeBeanTest {
    
    public EmployeeBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class EmployeeBean.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        EmployeeBean instance = new EmployeeBean();
        String expResult = "Nobody";
        
        instance.setName("Nobody");
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class EmployeeBean.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        EmployeeBean instance = new EmployeeBean();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartment method, of class EmployeeBean.
     */
    @Test
    public void testGetDepartment() {
        System.out.println("getDepartment");
        EmployeeBean instance = new EmployeeBean();
        String expResult = "";
        String result = instance.getDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartment method, of class EmployeeBean.
     */
    @Test
    public void testSetDepartment() {
        System.out.println("setDepartment");
        String department = "";
        EmployeeBean instance = new EmployeeBean();
        instance.setDepartment(department);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalary method, of class EmployeeBean.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        EmployeeBean instance = new EmployeeBean();
        double expResult = 0.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalary method, of class EmployeeBean.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 0.0;
        EmployeeBean instance = new EmployeeBean();
        instance.setSalary(salary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class EmployeeBean.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        int index = 0;
        EmployeeBean instance = new EmployeeBean();
        int expResult = 0;
        int result = instance.getPhone(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class EmployeeBean.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        int index = 0;
        int value = 0;
        EmployeeBean instance = new EmployeeBean();
        instance.setPhone(index, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isMarried method, of class EmployeeBean.
     */
    @Test
    public void testIsMarried() {
        System.out.println("isMarried");
        EmployeeBean instance = new EmployeeBean();
        boolean expResult = false;
        boolean result = instance.isMarried();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarried method, of class EmployeeBean.
     */
    @Test
    public void testSetMarried() {
        System.out.println("setMarried");
        boolean married = false;
        EmployeeBean instance = new EmployeeBean();
        instance.setMarried(married);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of incrementSalary method, of class EmployeeBean.
     */
    @Test
    public void testIncrementSalary() {
        System.out.println("incrementSalary");
        EmployeeBean instance = new EmployeeBean();
        instance.incrementSalary();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrementSalary method, of class EmployeeBean.
     */
    @Test
    public void testDecrementSalary() {
        System.out.println("decrementSalary");
        EmployeeBean instance = new EmployeeBean();
        instance.decrementSalary();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class EmployeeBean.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EmployeeBean instance = new EmployeeBean();
        String expResult = "My name is Ewan McGregor. I'm from the Janitorial Services. "+
                "Call me at ";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
