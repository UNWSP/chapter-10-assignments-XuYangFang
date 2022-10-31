package ch10home;

public class CollegeCourse {
	
	String department;
	int coursenumber;
	int credit;
	int fee;

	
	CollegeCourse(String dep, int cou, int cre)
	{
		department = dep;
		coursenumber = cou;
		credit = cre;
		
		fee = credit * 120;
		
	}
	
	public String getdepartment() {
		return department;
	}

	public int getcoursenumber() {
		return coursenumber;
	}

	public int getcredit() {
		return credit;
	}
	public int getfee() {
		return fee;
	}

	
	public void display()
	{
		System.out.println("Department is " + department + ", course number is " + coursenumber 
							+ ", credit is  " + credit + ", and fee is " + fee);
	}




}
