/**
 * 
 */
package Basic;
import java.util.*;
/**
 * @author DELL
 *
 */
public class FizzBizz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO to-generated method stub

		for (int i = 1;i<100;i=i+1)
		{
			System.out.println(i);
			if (i % 3 ==0 && i % 5==0) 
			{
				System.out.println("fizzBuzz");
			} else if (i % 3 == 0 )  { 
			System.out.println("fizz");
			}
			else if (i % 5==0 ) {
					
			System.out.println("Buzz");
			}
			
		}		
		
	}

}
