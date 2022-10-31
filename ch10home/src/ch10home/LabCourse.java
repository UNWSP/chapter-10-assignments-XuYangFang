package ch10home;

public class LabCourse extends CollegeCourse {
	
	
	int labfee;
	
	LabCourse(String dep, int cou, int cre) {
		super(dep, cou, cre);
		
		labfee = super.getfee() + 50;
		
		
	}
	
	
	public int getlabfee() {
		return labfee;
	}


	
	public void display()
	{
		System.out.println("Department is " + department + ", course number is " + coursenumber 
				+ ", credit is  " + credit + ", and this course is a lab course. So fee is " + labfee);
	}
	
	

}

