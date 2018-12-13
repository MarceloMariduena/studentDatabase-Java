package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	// Properties
	private String firstName;
	private String lastName;
	private String course = "";
	private String courses = "";
	private String studentID;
	private int gradeYear;
	private int tuitionBalance;
	private static int costOfCourse = 1000;
	private static int id = 10000001;
	Scanner input = new Scanner(System.in);
	

	// Constructor: prompts user to enter student's name and year
	public Student() {
		System.out.print("Enter the student's first name: ");
		this.firstName = input.nextLine();
		
		System.out.print("Enter the student's last name: ");
		this.lastName = input.nextLine();
		
		System.out.println("1 - Freshman \n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter the student's class level: ");
		this.gradeYear = input.nextInt();
		
		setStudentID();
	}
	
	// Method overloading
	// Constructor which allows for parameter inputs
	public Student(String firstName, String lastName, int gradeYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeYear = gradeYear;
		
		setStudentID();
		
	}
	
	// Generates an ID
	private void setStudentID() {
		// the "" converts the numbers into a concatenated string
		id++;
		this.studentID = gradeYear + "" + id;

	}

	// Enroll in courses
	public void enroll() {
		System.out.println("Enter course to enroll (Q to quit): ");
		while (!course.equals("Q")) {
			course = input.nextLine();
			if (course.equals("Q")) {
				break;
			}
			courses += "  " + course + "\n";
			tuitionBalance += costOfCourse;
		} 
		tuitionBalance -= 1000;
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	// Pay for tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		int payment = input.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Shows status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " + gradeYear +
				"\nCourses Enrolled:" + courses +
				"Balance: $" + tuitionBalance;
	}
}
