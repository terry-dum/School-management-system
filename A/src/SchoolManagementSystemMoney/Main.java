package SchoolManagementSystemMoney;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher lizy=new Teacher(1,"lizy",3000);
		Teacher liza=new Teacher(2,"liza",7000);
		Teacher liko=new Teacher(3,"liko",4000);
		Teacher liba=new Teacher(4,"liba",5000);
		
		List<Teacher> teacherList=new ArrayList<>();
		teacherList.add(lizy);
		teacherList.add(liza);
		teacherList.add(liko);
		teacherList.add(liba);
		
		Student leba=new Student(1, "leva", 4);
		Student leza=new Student(2, "leza", 3);
		Student leko=new Student(3, "leko", 7);
		List<Student> studentList=new ArrayList<>();
		studentList.add(leba);
		studentList.add(leza);
		studentList.add(leko);
		
		School sjk=new School(teacherList, studentList);
		
		leba.payFees(32000);
		leza.payFees(6000);
		System.out.println(sjk.getTotalMoneyEarn());
		
		//school pay salayr
		lizy.receiveSalary(lizy.getSalary());
		System.out.println("scholl pay to " + lizy.getName()+"and now has "+sjk.getTotalMoneyEarn());
		
		liza.receiveSalary(liza.getSalary());
		System.out.println("scholl pay to " + liza.getName()+"and now has "+sjk.getTotalMoneyEarn());
		
		System.out.println(leba);
		System.out.println(sjk.getTeachers());
	}

}
