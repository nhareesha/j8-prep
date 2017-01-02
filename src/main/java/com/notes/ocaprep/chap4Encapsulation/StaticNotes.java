/**
 * 
 */
package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 1, 2017 2017
 */
public class StaticNotes {

	/*	
	 * 									RULES:
	 * 
		1. Static members do not require instance to get accessed
		
		2. There are shared among all the instances of the class created.
		
		3. They are first intiialised when class is first accessed.
		
		4. main() method can also be called using class name as 
				Eg  : Kola.main();
		
		6.Static member or instance member can call a static member , because static methods 
			does not require object to use.
			
		7. We can use instance of a object to call a static method. Compiler checks for type of reference
		   used to call a static member , instead of the object
		   
		8. A static method can call another static method or static variable , using the class name.
		
		9. A static method cannot call instance method or instance variable.
		
		10. A instance method can call static method or static variable , using class name or 
			a reference variable
			
		11. Instance method can call instance method or instance variable using reference variable or 
		    directly if they are in same class
		
	 */
	
	private static int count;
	private boolean exam;
	
	private int num = 3;
	
	 // private static int number = count+num ; DOES NOT COMPILE !!!! cannot access instance varible in static
	
	static{
		count = 1;
	}
	
	public static void main(String[] args) {
		
		StaticNotes obj  = new StaticNotes();
		obj.instanceFun();
		StaticNotes.staticFun();
		
	}
	
	/* static method */
	public static void staticFun(){
		
		count++; //static variable is allowed in static method
		
		// System.out.println(exam); DOES NOT COMPILE !!! . Cannot access instance variables or methods
		
		// insatnceFun(); DOES NOT COMPILE !!!
		
		StaticNotes obj  = new StaticNotes();
		System.out.println(obj.exam); // instance variable can be called using reference variable even in static 
		
	}
	
	/* instance method */ 
	public void instanceFun(){
		
		exam = false; //static can be called in instance method , directly( if they are part of same class)
		
		staticFun();
		
		StaticNotes.staticFun(); // static can be called using class name in instance method.
		
		StaticNotes obj  = new StaticNotes();
		
		obj.staticFun(); // static can be called using reference variable here obj
		
		obj = null;
		
		obj.staticFun(); // though object is null , since static method is called , compiler looks at
						// reference type.So it will not give NullPointerException !!!!
		
		 // obj.instanceFun(); // this will give NullPointerException , since the method called is instance method
		
	}

}
