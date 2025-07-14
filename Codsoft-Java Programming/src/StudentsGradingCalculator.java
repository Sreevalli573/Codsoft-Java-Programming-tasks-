import java.util.*;

public class StudentsGradingCalculator {
    public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of subjects:");//Input number of subjects
		int subjects=scanner.nextInt();
		int marks=0;
		double sum = 0,avg_percentage=0.0d;

		for(int i=1;i<=subjects;i++)
		{
			System.out.println("Enter marks for this subject "+i+":");
			marks=scanner.nextInt();
			
		sum+=marks;//sum all the marks
	   }
		avg_percentage=(double)sum/(subjects);//calculating average percentage
		 System.out.println("total marks:"+sum);
			System.out.println("average percentage:"+avg_percentage);
         //checking for grades based on their avg_percentage
		if(avg_percentage>=90 && avg_percentage<=100)
			System.out.println("Grade:A");
		else if(avg_percentage<90 && avg_percentage>=80)
			System.out.println("Grade:B");
		else if(avg_percentage<80 && avg_percentage>=70)
			System.out.println("Grade:C");
		else if(avg_percentage<70 && avg_percentage>=60)
			System.out.println("Grade:D");
		else if(avg_percentage<60 && avg_percentage>=50)
			System.out.println("Grade:E");
		else
			System.out.println("Fail");
		
	   
		
		scanner.close();
	}

}
