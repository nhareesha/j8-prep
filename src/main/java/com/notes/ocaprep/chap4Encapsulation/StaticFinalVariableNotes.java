
package com.notes.ocaprep.chap4Encapsulation;

import java.util.ArrayList;//Regular Import
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;//static  Import of sort method
import static java.util.Collections.*; //Using wild card , so entire static methods get imported



// static import java.util.Arrays.asList; COMPILER ERROR !! syntax

// import static java.util.Arrays; COMPILER ERROR !!!! static import must be static filed or static membernot class 


//import static java.util.Collections.sort(List<T>); 
/* COMPILER ERROR !! method parameters has no business while import*/



/**
 * @author Hareesha
 * Jan 1, 2017
 */
public class StaticFinalVariableNotes {

	/*
	 * 							 final Variables
	 * 
	 	1. Final variables never can be changed once after initialized.
	 	
	 	2. The common place to initialize final variables(just the final not static) , is 
	 	   line of declaration , instance initializers or constructor.
	 	   
	 	3. By the time constructor completes , all the final variables must be initialized or else
	 	   compiler shows an error.
	 	   
	 	4. final fields cannot be re assigned , but methods can be called on reference variables.
	 	
	 *
	 * 							static final Variables
	 * 	   
	 	   
	 	1. The static variables that are never meant to change during the program are called constants.
	 		They are uses final modifier. They have naming convention to be UPPERCASE .They use specifiers
	 		static final.
	 	
	 	
	 	2. Static Initializers are meant to run , when class is first used.They are same as instance Initializers , 
	 		but they use static key word.
	 		 
	 	3. Static Initializers are used , so that any static variables can be initialized inside them.
	 	
	 	4. Static final fields can be assigned in , line of declaration or in static block
	 
	 *
	 *							static Imports
	 *
	 *
	 	1. Static imports are for importing static members of the class
	
	 	2. We can use wild cards or import specific member(static filed or static method) of the class
	 	
	 	3. When static imports are used , we don't need to specific from where each static memeber or variable 
	 		comes from each time we use . We can use as if they belong to class.
	 		
	 	4. syntax is import static
	 	
	 	5. Compiler complains if we explicitly try to do a static import of two methods with same name or 
	 	   static variables of same name
	 	   
	 	   Ex : 
	 	   
	 	      import static pckg.A.TYPE;
	 	      import static pckg.B.TYPE;
	 	      
	 	6. When we do a static import of just the static methods and not the class any where( like wild card or
	 		entire class) then we cannot refer that static method with class name. 
	 		We can only use the method it self.
	 	   
	 	
	 	6. Regular imports are for importing classes
	 	
	 	
	 
	 *
	 */
	
	public final ArrayList<String> list = new ArrayList<>(); //initialization in line of declaration
	
	public final int HEIGHT = 100; // final variable Initialization in line of declaration
	public final int WIDTH;
	
	/*COMPILER ERROR !!! Not initialized any where in, 
	  	 line of declaration or instance block or constructor   */
	
	//public final boolean test;
	private static int test;
	private static final int CONST_ONE;
	private static final int CONST_TWO = 2; //assigned in line of declaration it self
	
	
	/*COMPILER ERROR !!! static final filed Not initialized any where in, 
 	 line of declaration or static block  */
	
	//private static final int CONST_THREE;
	
	
	
	/* static block */
	static{
		
		// test=false; COMPILER ERROR !!! Cannot make a static reference to a non static variable
		
		CONST_ONE = 1; 	
	}
	
	
	/* instance block*/
	{
		WIDTH = 50; //Initialized in instance block
		
		list.add("INSTANCE BLOCK"); 
		// This is absolutely ALLOWED , because we are not re assigning , we are just calling methods.
		
		
		//list = new ArrayList<String>();
		/*This is NOT ALLOWED , we are making reference varaible to point to another object , which is potentially
		/ reassigning*/
	}
	
	
	public StaticFinalVariableNotes(){
		
		 // StaticFinalVariableNotes.CONST_ONE =2; COMPILER ERROR !!!!static final filed cannot be assigned in constructor
		
		 // HEIGHT = 200; COMPILER ERROR !! final filed already assigned , cannot be reassigned
		
		test=2;	
	}
	
	
	public static void main(String[] args) {
		
		String[] arr = {"one","two","three"};
		
		//Arrays.asList(arr);
		/* We cannot use this with class name because class Arrays is not imported any where*/
		
		List<String> l1 = asList(arr); // method is used by itself , as it is a specific static import from Arrays
		
		sort(l1);// ALLOWED , as static import of Collections class is done 
		
		Collections.sort(l1); //ALLOWED , as as static import of entire Collections class is done with wild card  
	}

}
