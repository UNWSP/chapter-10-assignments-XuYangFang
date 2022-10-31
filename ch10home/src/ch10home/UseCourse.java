package ch10home;
import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter the department of the course: ");
			String department = keyboard.nextLine();
			
			System.out.print("Enter the number of the course: ");
			int number = keyboard.nextInt();
			
			System.out.print("Enter the credit of the course: ");
			int credit = keyboard.nextInt();

			if(department.equalsIgnoreCase("BIO") || department.equalsIgnoreCase("CHM") || department.equalsIgnoreCase("CIS") || department.equalsIgnoreCase("PHY"))
			    {

			       LabCourse labCourse = new LabCourse(department, number, credit);
			       labCourse.display();
			    }

			    else
			    {

			    	CollegeCourse collegeCourse = new CollegeCourse(department, number, credit);
			    	collegeCourse.display();
			    }

			    keyboard.close();

		
			
		}

	}






   

  
