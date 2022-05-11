package Basic;

import java.util.Scanner;

public class Pale2 {
	
	
		public static boolean palencheck ()
		
		{
			
			Scanner t =  new Scanner(System.in); 
				
		     
			int c = t.nextInt();
		    
			String str= String.valueOf(c);
			
			int i=0 ;
			int j=str.length()-1;
			
			for (i=0;i<j;i++)
			{
				if (str.charAt(i++) != str.charAt(j--))
						{
			               return false;
						}
				
			}
			
			return true;}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.print(palencheck());	
		
	}

}
