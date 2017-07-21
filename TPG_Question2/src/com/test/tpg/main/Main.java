package com.test.tpg.main;

import java.util.Arrays;

import com.test.tpg.ace.Student;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Main program class for TPG Question no. 1
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Created by: ALVIN C. ESTANISLAO, a.c.e");
		System.out.println("=== Start of Test ===");
		
		
		Student[] students = new Student[5];
		
		students[0] = new Student("Tina", 33, 3.68);
		students[1] = new Student("Louis", 85, 3.85);
		students[2] = new Student("Samil", 56, 3.75);
		students[3] = new Student("Samar", 19, 3.75);
		students[4] = new Student("Lorry", 22, 3.76);
		
		
		System.out.println("Before sort: ");
		for(Student s: students){
			System.out.println(s);
		}
		//System.out.println(Arrays.toString(students));
		
		//Arrays.sort(students, Student.StudentIdComparator);
		Arrays.sort(students, Student.StudentComparator);
		
		System.out.println("After sort: ");
		for(Student s: students){
			System.out.println(s);
		}
		//System.out.println(Arrays.toString(students));
		
		System.out.println("=== End of Test ===");
	}

}
