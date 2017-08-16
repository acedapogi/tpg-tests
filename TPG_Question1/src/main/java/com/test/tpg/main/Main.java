package com.test.tpg.main;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.tpg.ace.IPValidationRegex;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Main program class for TPG Question no. 1
 * 
 */
public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
		public static void main(String[] args){	
			//System.out.println("Created by: ALVIN C. ESTANISLAO, a.c.e");
			//System.out.println("=== Start of Test ===");

			LOGGER.debug("Created by: ALVIN C. ESTANISLAO, a.c.e");
			LOGGER.debug("=== Start of Test ===");
			try {
				//read addresses from test file
				List<String> addresses = readFile();
				for(String address: addresses){
					IPValidationRegex ipValidationRegex = new IPValidationRegex(address);
					//System.out.println("This address -> "+ipValidationRegex.getIpAddress()+" has valid format: "+ipValidationRegex.validateAddress());
					LOGGER.debug("This address -> "+ipValidationRegex.getIpAddress()+" has valid format: "+ipValidationRegex.validateIPAddress());
				}
				
				
				//System.out.println("=== End of Test ===");
				LOGGER.debug("=== End of Test ===");
			} catch (Exception e) {
				LOGGER.error("An Exception occured: "+e.getMessage());
				//e.printStackTrace();
			}
		}
		
		
		
		public static List<String> readFile() throws Exception{
			List<String> addresses = new ArrayList<String>();
			
			//assumed file location outside project resource
			File f = new File("D:\\ACE\\testIP.txt"); 
			
			FileReader fr = null;
			BufferedReader br=null;
			try {
				fr = new FileReader(f);
				br = new BufferedReader(fr);
				String line = "";
				while((line = br.readLine())!=null){
					LOGGER.debug("Line: "+line);
					addresses.add(line);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (IOException e) {
				LOGGER.error("An IOException occured: " + e.getMessage());
				//e.printStackTrace();
			}
			finally
	        {
	            try {

	                if(br != null)
	                    br.close();
	                if(fr != null)
	                    fr.close();

	                } catch (IOException e) {
	                    LOGGER.error("Exception occured: " + e.toString());
	            }
	        }
			
			return addresses;
		}
}