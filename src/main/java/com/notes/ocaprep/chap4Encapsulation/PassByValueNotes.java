/**
 * 
 */
package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 1, 2017
 */
public class PassByValueNotes {
	
	/*
	 	1. Java is pass-by-value.
	 	
	 	2. In pass-by-value , a copy of variable is made and the method parameter receives that copy.
	 	
	 	3. Variable assignment is only to the method and it doesn't effect the caller.
	 	
	 	4. If value returned from method is not stored , then the result is ignored.
	 	
	 	5. Assigning a new primitive or reference to a parameter doesn't change the caller.
	 	
	 		However calling methods on a reference to an object does effect the caller.
	 		
	 	6. Although the method parameters and variables that are being passed share the same name,
	 	   they are actually different.Don't get tricked. 
	 	   
	 	7. In the method , even if methods are called on reference parameter , it doesn't effect the caller
	 		if object type is immutable .Eg : String
	  
	  */

	public static void main(String[] args) {
		
		int num = 4;
		newNumber(num); //here copy of num that is its value 4 is copied to method argument which is num again

		System.out.println(num); // 4 , so it is not effected
		
		String name = "Webby"; 
		/* here it is created using string literal so reference variable name stored the
		   the value Webby in it */
		
		newString(name);
		System.out.println(name);
		
		String name2 = new String("Hello");
		newString(name2);
		System.out.println(name2);
		
		
		StringBuilder sb = new StringBuilder("Hello ");
		newStringBuilder(sb); 
		/* here the reference to object , sb is passed.
		    sb stores the address location of object in the heap and it is reference variable*/
		
		System.out.println(sb.toString());
		
		
		int anotherNum = 0;
		notStored(anotherNum); //returned value is not stored , so it is ignored
		System.out.println(anotherNum);
	}
	
	
	public static void newNumber(int num){
		num = 10; //assigning a new primitive, this will not effect the caller
	}
	
	public static void newString(String name){
		name = new String("Dance");//assigning a new object to a reference parameter, this will not effect the caller
		
		name.substring(2);//though method is called on reference, this will not effect caller because String is immutable
	}
	
	public static void newStringBuilder(StringBuilder sb){
		sb.append("World");
		// calling methods on a reference to an object that is passed from caller.This effects the caller
	}
	
	public static int notStored(int anotherNum){
		anotherNum = anotherNum+20;
		return anotherNum;
	}
}
