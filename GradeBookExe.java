import java.util.Scanner;

public class GradeBookExe
{
	public static void main ( String args [] )
	{
		
		GradeBook myBook = new GradeBook();
		
		Scanner input  = new Scanner( System.in );
	
		String name[] = new String[50];
		int again = 0;
		int counter = 0;
		int review;
		
		
		while( again != 2 )
		{
			
			System.out.print
			( "\n Enter the name of the course you are\n" +
			" grading today: " );
			
			myBook.setCourseName( name[counter] );
			
			name[counter] = input.nextLine();
			
			
			counter++;
			
			myBook.displayMessage();
			myBook.inputGrades();
			myBook.gradeReport();
			
			System.out.print
			( "\n Would you care to grade another course?\n" +
			" ( 1 = yes, 2 = no ): " );
			
			again = input.nextInt();
			
		}
		
		System.out.print
		("\n Would you care to view the courses\n" +
		" you have graded? ( 1 = yes, 2 = no ): " );
		
		review = input.nextInt();
		
		if( review == 1 )
		{
			for( int go = 0; go < name.length; go++)
			{
				System.out.printf
				("\n %s ", name[go] );
			}
			
			System.out.println
			("\n Thanks for using Grade Book.\n" +
			" Goodbye.\n\n");
		}
		
		else
			System.out.println
			("\n Thanks for using Grade Book.\n" +
			" Goodbye.\n\n");
	}
}
