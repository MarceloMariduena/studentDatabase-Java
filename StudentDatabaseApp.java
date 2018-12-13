package studentDatabaseApp;
import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		
		// Variables
		int numOfStudents = 0;
		Scanner input = new Scanner(System.in);
		
		// testing
		/*
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.showInfo());
		Student stu2 = new Student("Shit", "Stain", 4);
		*/
		
		//  Asks for the amount to student to add to the database
		System.out.println("Enter the number of new students to enroll: ");
		numOfStudents = input.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Creates n number of new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		// Outputs the information of all the enlisted students
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].showInfo());
		}

		
	}

}
