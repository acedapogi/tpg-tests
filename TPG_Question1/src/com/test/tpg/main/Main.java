package com.test.tpg.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.test.tpg.ace.IPValidationRegex;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Main program class for TPG Question no. 1
 * 
 */
public class Main {

		public static void main(String[] args){	
			System.out.println("Created by: ALVIN C. ESTANISLAO, a.c.e");
			System.out.println("=== Start of Test ===");
			try {
				//read addresses from test file
				List<String> addresses = readFile();
				for(String address: addresses){
					IPValidationRegex ipValidationRegex = new IPValidationRegex(address);
					System.out.println("This address -> "+ipValidationRegex.getIpAddress()+" has valid format: "+ipValidationRegex.validateAddress());
				}
				
				
				System.out.println("=== End of Test ===");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		public static List<String> readFile() throws IOException{
			List<String> addresses = new ArrayList<String>();
			File f = new File("D://ACE/testIP.txt"); //asssumed file location
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			while((line = br.readLine())!=null){
				addresses.add(line);
			}
			return addresses;
		}
}
