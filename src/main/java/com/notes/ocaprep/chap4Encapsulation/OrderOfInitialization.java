package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 3, 2017
 */
public class OrderOfInitialization {

	/**
	 						RULES :When object is created using new keyword then
	 						
	 	1. Super class is initialized first
	 	
	 	2. static variable declarations and static blocks are run in the order they appear in the file.
	 	
	 	3. Instance variable declarations and instance blocks are run in the order they appear in the file.
	 	
	 	4. Then at last initializations in constructors are executed.
	 	
	 	
	 	5. instance variables and instance blocks are only executed when new is used.Otherwise 
	 	   they are never executed
	 	   
	 	6. Static variable initializations must be out of way before instance variables
	 		initializations gets executed.
	 	 
	 	7. static variables gets executed when class is first used.They does not require 
	 	
	 		object to get created from them to run.
	 		
	 		Means even when there is no object created they get initialized , when main is run
	 	   
	 	8. static variables and instance variables can be assigned before they are declared.
	 		But they cannot be referenced.
	 		Eg : like in println 
	 
	 */
	private int a; // 5. 
	{
		a =10; // 4.  a=10;
		System.out.println("from instance block : "+a);
	}
	
	static int b; // 1 . Here b=0
	static{
		System.out.println("Static Block");
		b=10;								// 2. b=10
		System.out.println("From static block b : "+ b);
	}
	
	
	public OrderOfInitialization(){
		b=20; // 3. b=20
		System.out.println("From constructor b : "+b);
	}
	public static void main(String[] args) {
		System.out.println("Called before object creation"); 
		//this is printed even before constructor is called means before instance variables are called
		
		
		/* commenting object creation only runs the static variables. */
		
		OrderOfInitialization obj = new OrderOfInitialization();
		System.out.println("Value of Instance variable a: "+obj.a);
		System.out.println("Value of static variable b: "+ b);
	}

}
