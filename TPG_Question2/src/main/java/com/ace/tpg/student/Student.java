package com.ace.tpg.student;

import java.util.Comparator;

/**
 * 
 * @author Alvin C. Estanislao, a.c.e.
 * Class implementation for TPG Question no. 2
 * 
 */
public class Student implements Comparable<Student>{
	
	private int id;
	private String firstName;
	private double gpa;
	
	
	/**
	 * This is the deafult constructor for the Student class.
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is the constructor to create Student object with the specified values for
	 * the firstName, id, and gpa
	 * 
	 * @param firstName the specified String value of the Student's firstName
	 * @param id the specified int value of the Student's id
	 * @param gpa the specified double value of the Student's gpa
	 */
	public Student(String firstName, int id, double gpa) {
		this(id, firstName, gpa);
	}
	
	/**
	 * An overloaded version of the Student class constructor. It used to create and instance
	 * of the student object with the specified values of id, firstName and gpa in order.
	 *  
	 * @param id he specified int value of the Student's id
	 * @param firstName the specified String value of the Student's firstName
	 * @param gpa the specified double value of the Student's gpa
	 */
	public Student(int id, String firstName, double gpa) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.gpa = gpa;
	}

	/**
	 * This method is used to retrieve the int value of the assigned id of the
	 * Student object
	 * 
	 * @return the int value of the assigned id
	 */
	public int getId() {
		return id;
	}

	/**
	 * This method is used to set the value of the assigned id to the specified
	 * int value.
	 * 
	 * @param id the specified value of the Student's id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * This method is used to retrieve the String value of the assigned firstName of the
	 * Student object
	 * 
	 * @return the String value of the assigned firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This method is used to set the value of the assigned firstName to the specified
	 * String value.
	 * 
	 * @param firstName the specified value of the Student's firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This method is used to retrieve the double value of the assigned gpa of the
	 * Student object
	 * 
	 * @return the double value of the assigned gpa
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * This method is used to set the value of the assigned gpa to the specified
	 * double value.
	 * 
	 * @param gpa the specified value of the Student's gpa
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", gpa=" + gpa + "]";
	}

	/**
	 * This method is used to compare two Student objects based on the gpa
	 * as criteria. This is used to arrange student in descending gpa comparison order
	 */
	public int compareTo(Student o) {
		if(this.gpa<o.getGpa())
	          return 1;
	    else if(o.getGpa()<this.gpa)
	          return -1;
	    return 0;
	}
	
//	public static Comparator<Student> StudentGpaComparator = new Comparator<Student>(){
//		public int compare(Student s1, Student s2){
//			int s1Gpa = (int) Math.round(s1.getGpa());
//			int s2Gpa = (int) Math.round(s2.getGpa());
//			//descending
//			return s2Gpa - s1Gpa;
//		}
//	};
	
	/**
	 * This method is used to compare two Student objects based on the firstName
	 * as criteria. This is used to arrange student in ascending firtName comparison order
	 */
	public static Comparator<Student> StudentNameComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			String s1Name = s1.getFirstName().toUpperCase();
			String s2Name = s2.getFirstName().toUpperCase();
			//ascending
			return s1Name.compareTo(s2Name);
		}
	};
	
	/**
	 * This method is used to compare two Student objects based on the id
	 * as criteria. This is used to arrange student in ascending id comparison order
	 */
	public static Comparator<Student> StudentIdComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			int s1Id = s1.getId();
			int s2Id = s2.getId();
			//ascending
			return s1Id - s2Id;
		}
	};
	
	
	/**
	 * Compares the Student objects based on the required multiple criteria in this exercise:
	 * Primary criteria: gpa in descending order
	 * Secondary criteria: firstName in ascending order
	 * Last criteria: id in descending order
	 */
	public static Comparator<Student> StudentComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			int comp = s1.compareTo(s2);
			if(comp!=0){
				return comp;
			}else{
				comp = StudentNameComparator.compare(s1, s2);
				if(comp!=0){
					return comp;
				}else{
					comp = StudentIdComparator.compare(s1, s2);
					return comp;
				}
			}
		}
	};
	
}

