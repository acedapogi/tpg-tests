package com.test.tpg.ace;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Class implementation for TPG Question no. 1
 * 
 */
public class IPValidationRegex {
	
	private String ipAddress;
	
	public static final String IP_ADDRESS_REGEX =  "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
			"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
	
	private static final Logger LOGGER = LoggerFactory.getLogger(IPValidationRegex.class);
	
	
	/**
	 * This is the default constructor for IPValidationRegex class.
	 */
	public IPValidationRegex() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * The constructor for creating IPValidationRegex object.
	 * @param ipAddress the String value of the specified IP Address to validate
	 */
	public IPValidationRegex(String ipAddress) {
		super();
		this.ipAddress = ipAddress;
	}

	/**
	 * This is method retrieves the value of the assigned IP Adress to validate.
	 * @return the String value of the IP Adress to validate
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * This method is used to set the the value of the target IP Address to validate to the specified value.
	 * @param ipAddress the specified String value of the target IP Address 
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	/**
	 * This is the primary business method of the IPValidationRegex class used to validate
	 * whether the set target IP Address is a valid IP Address based on the pattern set by the
	 * pattern: IP_ADDRESS_REGEX.
	 * 
	 * @return boolean value that is true if the IP Address set is valid, otherwise returns false.
	 */
	public boolean validateIPAddress(){
		LOGGER.debug("The method validateIPAddress() is invoked.");
		boolean isValid = false;
		
		if(this.ipAddress!=null){
			isValid = this.ipAddress.matches(IPValidationRegex.IP_ADDRESS_REGEX);
		}
		return isValid;
	}

}