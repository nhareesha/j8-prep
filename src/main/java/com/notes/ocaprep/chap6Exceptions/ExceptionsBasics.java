/**
 * 
 */
package com.notes.ocaprep.chap6Exceptions;

import java.io.IOException;

/**
 * @author Hareesha
 * Jan 23, 2017
 */
public class ExceptionsBasics {

	/**
	 
	  java.lang.Throwable is the super class of 
	  
	 		1. java.lang.Exception is super class of 
	 				1.java.lang.RuntimeException
	 		2. java.lang.Error
	 		
	 Checked Exceptions :
	 
	 	1. Checked exceptions includes Exception and all of its subclasses 
	 		except RuntimeException and its subclass.
	 		
	 	2. For Checked Exceptions, java has a rule of "handle or declare". That is java requires
	 		the code to either handle or declare the exception in the method signature
	 
	 	3. "throws" tells that method might or might not throw an exception.
	 	
	 	4. "throw" tells that we want to throw a new Exception
	 	
	 	5. It is OKAY for program to catch a Checked Exception
	 	
	 	6. It is REQUIRED to handle or declare a Checked Exception
	 	
	 Unchecked or RuntimeExceptions :
	 
	 	1. These include the RuntimeException and its subclasses
	 	
	 	2. It is OKAY for program to catch a RuntimeException but not REQUIRED TO.
	 	
	 	3. It is NOT REQUIRED to handle or declare RuntimeException
	 
	 Error :
	 
	 	1. Error means something went so horribly wrong that program should not attempt to recover from.
	 	
	 	2. It is NOT OKAY for program to catch a Error.
	 	
	 	3. It is NOT REQUIRED to handle or Declared
	 	
	 "throws" and "throw" :
	 
	 	1. "throw"  must throw an Checked Exception that is same or subtype of exception that is declared 
	 		in "throws" clause.Otherwise it gives COMPILER ERROR.
	 	
	 	2. For Error , RuntimeException , they can be "throw" in any method even 
	 		without "throws" declaration or handling.
	 	
	 		Ex : throw new Error() ; throw new RunTimeException();
	 		
	 	3. For Error, RuntimeException , they can be declared in any method  even without throw
	 		in method
	 	
	 		Ex : throws Error , throws RuntimeException
	 		
	 Overriding method rule APPLIES  ONLY FOR CheckedException
	 
	 	Any overridden method in subclass must throw fewer or no Checked Exceptions.
	 	
	 	That means overridden method is allowed to throw brand new RuntimeExceptions as well.
	 
	 */
	public static void main(String[] args) {
		

	}
	
	void hello() throws IOException{} //VALID may or may not thorw in actual
	
	void hello2(){
		
		//throw new Exception(); //COMPILER ERROR!! need to handel or declare
	}
	
	void sayHello() throws IOException{
		
		/* Method says it is capable of throwing a IOException, but in actual it is 
		 * throwing its Superclass ---- COMPILER ERROR*/
		
		//throw new Exception();
		
		//throw new IOException();
		
		  throw new Error(); //unreachable code COMPILER ERROR
		
		//throw new IllegalArgumentException();
		//throw new RuntimeException();//unreachable code COMPILER ERROR
		
	}
	
	void sayHi() throws Error , RuntimeException{}
	
	void greet(){
		throw new Error();//NOT REQUIRED to handle or declared
		
		//throw new RuntimeException(); Unreachable, only one thorw is allowed
	}
	
	void morning(){
		throw new RuntimeException(); //NOT REQUIRED to handle or declared
	}

}

class ExceptionSubClass extends ExceptionsBasics{
	
	void morning() throws RuntimeException{ //VALID
		
	}
	
	//void sayHi() throws IOException{} //COMPILER ERROR!! Cannot throw new Checked Exception
		
}
