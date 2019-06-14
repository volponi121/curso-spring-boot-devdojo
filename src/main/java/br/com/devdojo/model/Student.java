package br.com.devdojo.model;

import java.util.*;

public class Student {
	private int id;
	private String name;
	public static List<Student> studentList;

	static {
		studentRepository();
	}

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Student(String name) {
		this.name = name;
	}

	private static void studentRepository() {
		studentList = new ArrayList<Student>(Arrays.asList(new Student(0, "Aluno1"), new Student(1, "Aluno2")));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static List<Student> getStudentList() {
		return studentList;
	}

	public static void setStudentList(List<Student> studentList) {
		Student.studentList = studentList;
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

}
