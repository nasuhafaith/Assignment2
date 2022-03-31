package assignment2;

import java.sql.*;
import java.util.Scanner;

public class Student {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner input = new Scanner(System.in);
		
		StudentModel model = new StudentModel();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		System.out.print("Choose an option [1.Insert data 2.View Result]: ");
		int option = input.nextInt();
		
		if(option==1) {
			
			System.out.println("Student's Data \n");
			System.out.print("Student ID: ");
			int id = input.nextInt();
			
			System.out.print("Name: ");
			String name = input.next();
			
			System.out.print("Department: ");
			String department = input.next();
			
			System.out.println("\n Student's Marks");
			System.out.print("Mathematics: ");
			double mathMark = input.nextDouble();
			
			System.out.print("Science: ");
			double scienceMark = input.nextDouble();
			
			System.out.print("English: ");
			double englishMark = input.nextDouble();
			
			controller.save(id, name, department, mathMark, scienceMark, englishMark);
		}
		
		else if(option==2) {
			System.out.print("Enter student id: ");
			int studentid = input.nextInt(); 
			
			try {
				controller.read(studentid);
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
