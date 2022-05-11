package LinkList;


import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

final class LinkList {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		LinkedList<String> a= new LinkedList<String>();
         
	     a.add("red");
         a.add("green");
         a.add("yellow");
		
         System.out.print(a);
		  
		  Iterator<String> i = a.iterator();
			     
		  
	      while (i.hasNext())
	      { System.out.print(i.next());
	      
	    	  }	 
	      }
	
	}