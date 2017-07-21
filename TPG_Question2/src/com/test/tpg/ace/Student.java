package com.test.tpg.ace;

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
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String firstName, int id, double gpa) {
		this(id, firstName, gpa);
	}
	
	public Student(int id, String firstName, double gpa) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getGpa() {
		return gpa;
	}

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

	@Override
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
	
	public static Comparator<Student> StudentNameComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			String s1Name = s1.getFirstName().toUpperCase();
			String s2Name = s2.getFirstName().toUpperCase();
			//ascending
			return s1Name.compareTo(s2Name);
		}
	};
	
	public static Comparator<Student> StudentIdComparator = new Comparator<Student>(){
		public int compare(Student s1, Student s2){
			int s1Id = s1.getId();
			int s2Id = s2.getId();
			//ascending
			return s1Id - s2Id;
		}
	};
	
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
