import java.util.Scanner;

public class student_marks {
	
	public static void main(String[] args) {
		int maths, physics, chemistry, english, computersc;
		double finalscore;
		boolean result;
		Scanner marks = new Scanner(System.in);
		
		do 
		{
			System.out.println("Enter marks for maths");
			maths = marks.nextInt();
			
			System.out.println("Enter marks for chemistry");
			chemistry = marks.nextInt();
			
			System.out.println("Enter marks for physics");
			physics = marks.nextInt();
			
			System.out.println("Enter marks for English");
			english = marks.nextInt();
			
			System.out.println("Enter marks for Computer Science");
			computersc = marks.nextInt();
			
			finalscore = (maths+english+chemistry+physics+computersc)/5;
			
			if (finalscore>90)
			{
				System.out.println("Excellent");
			}
			else if (finalscore>80)
			{
				System.out.println("Very Good");
			}
			else if (finalscore>60)
			{
				System.out.println("Good");
			}
			else if (finalscore>40)
			{
				System.out.println("Average");
			}
			else
			{
				System.out.println("Poor");
			}
			System.out.println("Any more students?(true or false)");
			
		result = marks.nextBoolean();
		
		}while(result);
		
	}
	
}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
		