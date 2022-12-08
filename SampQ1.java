//List of integers contains only odd no.s
package practice1;
import java.util.Scanner;
public class SampQ1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		 
		 System.out.println("Printing Odd numbers " + limit);
		 
		 for(int i=1; i <= limit; i++)
		 {
		 
		 //if the number is not divisible by 2 then it is odd
		 if( i % 2 != 0)
		 {
		 System.out.print(i + " ");

	     }
		 
		 }
}
}