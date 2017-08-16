package com.test.tpg.ace.junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.test.tpg.ace.IPValidationRegex;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Junit test class for TPG Question no. 1
 * 
 */
@RunWith(DataProviderRunner.class)
public class IPValidationRegexTest {

	private IPValidationRegex ipValidationRegex;
	
	@Before
	public void setUp() throws Exception {
		ipValidationRegex = new IPValidationRegex();
	}

    @DataProvider
    public static Object[][] generateValidTestData() {
        return new Object[][]{
                new Object[] {"8.8.8.8"},
                new Object[] {"127.0.0.1"},
                new Object[] {"192.168.0.1"},
                new Object[] {"172.28.128.4"},
                new Object[] {"130.250.111.20"},
                new Object[] {"22.2.20.1"}
        };
    }
    
	@Test
	@UseDataProvider("generateValidTestData")
	 public void validIPAddressTest(String ipAddress) {
			ipValidationRegex.setIpAddress(ipAddress);
	        boolean valid = ipValidationRegex.validateIPAddress();
	        System.out.println("Target Test IP Address is VALID : " + ipAddress + " , " + valid);
	        Assert.assertEquals(true, valid);
	 }

    @DataProvider
    public static Object[][] generateInvalidTestData() {
        return new Object[][]{
                new Object[] {"8.8.8"},
                new Object[] {"127.0"},
                new Object[] {"100"},
                new Object[] {"a.b.c.d"},
                new Object[] {"130.250.111.abc"},
                new Object[] {"8888.999.20.1"},
                new Object[] {"20.21.22"}
        };
    }
	
	@Test
	@UseDataProvider("generateInvalidTestData")
	 public void invalidIPAddressTest(String ipAddress) {
			ipValidationRegex.setIpAddress(ipAddress);
	        boolean valid = ipValidationRegex.validateIPAddress();
	        System.out.println("Target Test IP Address is INVALID : " + ipAddress + " , " + valid);
	        Assert.assertEquals(false, valid);
	 }

}
