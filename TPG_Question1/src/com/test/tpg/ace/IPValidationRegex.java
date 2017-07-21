package com.test.tpg.ace;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Class implementation for TPG Question no. 1
 * 
 */
public class IPValidationRegex {
	
	private String ipAddress;
	
	public IPValidationRegex() {
		super();
	}
	
	
	public IPValidationRegex(String ipAddress) {
		super();
		this.ipAddress = ipAddress;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public boolean validateAddress(){
		boolean isValid = false;
		String regEx =  "\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
						"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
						"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\."+
						"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
		if(this.ipAddress!=null){
			isValid = this.ipAddress.matches(regEx);
		}
		return isValid;
	}

}
