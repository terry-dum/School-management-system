package SchoolManagementSystemMoney;

import java.util.ArrayList;
import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarn;
	private static int totalMoneySpent;


	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers=teachers;
		this.students=students;
		totalMoneyEarn=0;
		totalMoneySpent=0;
	}


	public List<Teacher> getTeachers() {
		return teachers;
	}


	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}


	public List<Student> getStudents() {
		return students;
	}


	public void addStudents(Student student) {
		students.add(student);
	}


	public int getTotalMoneyEarn() {
		return totalMoneyEarn;
	}


	public static void updateTotalMoneyEarn(int moneyEarned) {
		totalMoneyEarn += moneyEarned;
	}


	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}


	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarn -= moneySpent;
	}
	
	
}
