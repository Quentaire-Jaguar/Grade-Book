# Grade-Book
A program that allows teachers and instructors 
to grade their course papers & exams and then 
log them into a database from which they can 
review the entries, course averages and 
graphs that represent student grades.

import java.util.Scanner;

public class GradeBook
{
	private int maximumGrade = 0;
	private String courseName;
	private Scanner input;
	
	void setCourseName( String course )
	{
		
		courseName = course;
	}
	
	String getCourseName()
	{
		
		return courseName;
	}
	
	void displayMessage()
	{
		System.out.printf
		("\n Welcome to the Grade Book for\n" +
		" %s", getCourseName() );
	}
	
	void inputGrades()
	{
		
		input = new Scanner( System.in );
		
		int grade1;
		int grade2;
		int grade3;
		
		System.out.print
		("\n\n Enter three integer grades: " );
		
		grade1 = input.nextInt();
		grade2 = input.nextInt();
		grade3 = input.nextInt();
		
		maximumGrade = setMaximum( grade1, grade2, grade3 );
		
	}
	
	int setMaximum( int maxX, int maxY, int maxZ )
	{
		int maximum = maxY;
		
		if( maxX > maxY )
			maximum = maxX;
		
		else
			if( maxZ > maxY )
				maximum = maxZ;
				
		return maximum;
	}
	
	void gradeReport()
	{
		
		System.out.printf
		( "\n The maximum of the three\n" +
		" grades entered is %d.\n", maximumGrade );
	}
	
}
