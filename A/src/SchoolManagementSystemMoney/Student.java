package SchoolManagementSystemMoney;

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id, String name, int grade) {
			feesPaid = 0;
			feesTotal = 30000;
			this.id = id;
			this.name = name;
			this.grade = grade;
			
	}
	
	//not changing student name and id
	
	
	public void setGrade(int grade) { 
		this.grade = grade; 
		} 
	
	
	/*
	 * add fees to feesPaid 
	 * school receive the fees
	 */
	public void updateFeesPaid(int fee) {
		feesPaid+=fee;
		
	}
	
	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarn(feesPaid);
	}
	
	public int getRemainFees() {
		return feesTotal-feesPaid;
	}
	
	//get
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	@Override
	public String toString() {
		return "Student name: " + name + "Total fees paid: " + feesPaid;
	}
}
 
	

 