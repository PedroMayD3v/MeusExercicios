package devPedro;
import java.util.Scanner;

import entities.Student;

public class Apli {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble(); 
		student.grade3 = sc.nextDouble();
		
		System.out.println("Final grade: " + student.finalGrade());
		
		if(student.finalGrade() < 60) {
			
			System.out.println("Failed.");
			System.out.println("Missing points: " + student.missingPoints());
			
		} else {
			
			System.out.println("Passed.");
			
		}
		
	}

}
