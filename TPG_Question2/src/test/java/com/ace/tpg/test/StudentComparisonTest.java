package com.ace.tpg.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.ace.tpg.student.Student;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Junit test class for TPG Question no. 2
 * 
 */
public class StudentComparisonTest {

	private Student[] students = new Student[7];
	
	@Before
	public void setUp() throws Exception {
		students[0] = new Student(33, "Tina", 3.68);
        students[1] = new Student(85, "Louis", 3.85);
        students[2] = new Student(56, "Samil", 3.75);
        students[3] = new Student(19, "Samar", 3.75);
        students[4] = new Student(22, "Lorry", 3.76);
        students[5] = new Student(50, "Samil", 3.75);
        students[6] = new Student(20, "Samar", 3.75);

        System.out.println("Student List BEFORE SORT : ");
        for (Student student: students) {
            System.out.println(student.toString());
        }
	}

	@Test
	public void testComparison() {
		Arrays.sort(students, Student.StudentComparator);
		System.out.println("Student List AFTER SORT : ");
		for (Student student: students) {
            System.out.println(student.toString());
        }
	}

}
