//Generate random numbers in java
package practice1;
public class SampQ6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int min = 50;
	      int max = 100;
	        
	      //Generate random int value from 50 to 100 
	      System.out.println("Random value in int from "+min+" to "+max+ ":");
	      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	      System.out.println(random_int);
	     
	}

}






