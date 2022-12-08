//Check if the given number is prime or not
package practice1;

public class SampQ4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num = 2387;
	    boolean f = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        f = true;
	        break;
	      }
	    }

	    if (!f)
	    {
	      System.out.println(num + " is a prime number.");
	    }
	    else
	    {
	      System.out.println(num + " is not a prime number.");
	    }

	}

}
