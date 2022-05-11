package Basic;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Coll1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Red");
		al.add("green");
		System.out.println(al);
		al.add(0,"GIJO");
		al.add(3,"JOGI");
		al.set(0,"Update");
		
		
		
		for (String element : al) 
		
		{
			System.out.println(element);
			
			
		}
		
		String jl=al.get(2);
		System.out.println(jl);
		
		if (al.contains("green"))
				{System.out.println("Pass");
				}
		
	System.out.println(al);	
	
	 Collections.sort(al);
	 
	 System.out.println(al);
	 
	 ArrayList <String> bl = new ArrayList<>();
	 bl.add("T");
	 bl.add("B");
	 bl.add("C");
	 System.out.println(bl.subList(1,2));
	boolean t= al.equals(al);
	System.out.println(t);
	Collections.swap(al, 0, 1);
	 System.out.println(al);
	 al.addAll(bl);
	 System.out.println(al);
	 al.trimToSize();
	 al.ensureCapacity(10);
    ArrayList<String> c= (ArrayList<String>) al.clone();
    System.out.println(c);
    c.removeAll(c);
    System.out.println(c);	
    
    
	
	
	}
     
    
	
	
}