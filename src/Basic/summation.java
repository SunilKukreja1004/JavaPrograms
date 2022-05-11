package Basic;

import java.nio.charset.Charset;
import java.util.Scanner;

public class summation {

		int a ,b ;
		public int number(int a , int b)
		
		{ 			
		   int c= a+b ;
		   return c ;
		   
		}
				

	    public int division (int a, int b)
    
	    {  
	    	
	    	int c = a/b;
	    	return c;
	    	
	    	
	    	
	    }
	    
	    
	    public int sqrt (int z) 
	    
	   
	   {
	    	
	    Scanner in= new Scanner(System.in);	
		return in.nextInt(); 
		
		   
		   
		   
		   
	   }
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of 1 and 2 " + (89+71));
		
		summation ob = new summation ();
	    int z=ob.number(45,45);
		System.out.println((ob.sqrt(25)));
		
		int y = ob.division(9,3);
		
    //	System.out.println(y);
	//	System.out.println(-5+8*6 );
	//	System.out.println((55+9)%9);
	//	System.out.println(20+-3*5/8);
	//	System.out.println(125*24);
		
		System.out.println("\nJava Version: "+System.getProperty("java.version"));
	    System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
	    System.out.println("Java Home: "+System.getProperty("java.home"));
	    System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
	    System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
	    System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	    int a= 'v';
	    System.out.println("integer" + a	 );
	    
	    for (String str : Charset.availableCharsets().keySet()) {
	        System.out.println(str);
	      }
	    
	    System.out.format("\n Current Date Format : %tc%" + System.currentTimeMillis());
	     System.currentTimeMillis();
	    

	}


	private static void print(int sqrt) {
		// TODO Auto-generated method stub
		
		
		
	}

}
