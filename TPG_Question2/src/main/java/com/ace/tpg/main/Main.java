package com.ace.tpg.main;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ace.tpg.student.Student;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Main program class for TPG Question no. 1
 * 
 */
public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		//System.out.println("Created by: ALVIN C. ESTANISLAO, a.c.e");
		//System.out.println("=== Start of Test ===");
		LOGGER.debug("Created by: ALVIN C. ESTANISLAO, a.c.e");
		LOGGER.debug("=== Start of Test ===");
		
		Student[] students = new Student[5];
		
		students[0] = new Student("Tina", 33, 3.68);
		students[1] = new Student("Louis", 85, 3.85);
		students[2] = new Student("Samil", 56, 3.75);
		students[3] = new Student("Samar", 19, 3.75);
		students[4] = new Student("Lorry", 22, 3.76);
		
		
		//System.out.println("Before sort: ");
		LOGGER.debug("Before sort: ");
		for(Student s: students){
			//System.out.println(s);
			LOGGER.debug(s.toString());
		}
		//System.out.println(Arrays.toString(students));
		//LOGGER.debug(Arrays.toString(students));
		//Arrays.sort(students, Student.StudentIdComparator);
		Arrays.sort(students, Student.StudentComparator);
		
		//System.out.println("After sort: ");
		LOGGER.debug("After sort: ");
		for(Student s: students){
			//System.out.println(s);
			LOGGER.debug(s.toString());
		}
		//System.out.println(Arrays.toString(students));
		//LOGGER.debug(Arrays.toString(students));
		//System.out.println("=== End of Test ===");
		LOGGER.debug("=== End of Test ===");
	}

}

