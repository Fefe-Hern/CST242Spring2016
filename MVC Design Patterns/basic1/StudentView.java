package basic1;

import java.util.Scanner;

public class StudentView {

		   public void printStudentDetails(String studentName, String studentIdNum){
		      System.out.println("Student: ");
		      System.out.println("Name: " + studentName);
		      System.out.println("Id Number: " + studentIdNum);
		   }
		   
		   public String[] getStudentDetails() {
			   Scanner kb = new Scanner(System.in);
			   System.out.println("Enter the student name and id separated by comma and then press enter to finish. ");
			   return (kb.nextLine()).split(",");
		   }
		}

