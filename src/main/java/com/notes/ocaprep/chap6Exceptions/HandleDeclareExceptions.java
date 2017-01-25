
package com.notes.ocaprep.chap6Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Hareesha
 * Jan 24, 2017
 */
public class HandleDeclareExceptions {

	/**
	 1.The code in try block is run normally.If any of the statements throw an exception 
	 	that can be caught by the exceptions type listed in the catch block, the try block 
	 	stop running and execution goes to the catch statement.If none of the statements
	 	in try throw an exception then execution after try goes to finally, if it is there.
	 	
	 2. At any time only one catch block is run.
	 
	 3. catch blocks are executed in the order they appear.
	 
	 4. Every try block need to have a catch block or finally.Both catch and finally can both
	 	be there.
	 	
	 5. [ try - catch - finally ]  [try - finally] finally is always run if one is there.
	 
	 6. try statement needs braces even one statement is present. try - catch -finally order should
	 	not change.
	 	
	 7. System.exit(0) stops the JVM.So if it happens to be in try or catch, finally is not run.
	 
	 8. If both catch and finally throw new Exception , then catch block exception is forgotten and
	 	only finally block exception is printed.
	 9. Most specific Exception(Sub class) need to be in first catch block, followed by least specific Exception.
	 	(Super class)If super class is caught before subclass then unreachable code occurs.
	 	
	 10. At any point of time only one catch block is executed if an Exception arises.
	 
	 11. If we are calling a method throws a checked Exception we are required to handle or declare
	 	that Exception the calling method.This rule applies only to CHECKED EXCEPTIONS.
	 	
	 12. The method that overrides the super class methods that "throws" Checked Exceptions, must throw 
	 	fewer exceptions or no new Checked Exceptions in the overridden method.
	 	This applies only to CHECKED EXCEPTIONS.
	 
	 
	 */
	public static void main(String[] args) throws IOException {
		
		HandleDeclareExceptions obj=new HandleDeclareExceptions();
		
		//obj.methodOne();
		// COMPILER ERROR!! as the method throws Exception it required caller to declare or handle
					
		obj.methodOne();
		
		obj.methodTwo();
		//VALID!! Although it throws RuntimeException, they are not required to be handled
		
		try{
			obj.methodOne();
		}catch(IllegalArgumentException e){
			// ITS Okay to catch RuntimeException, even if one is not thrown
		}
		
		try{
			obj.methodThree();
		}catch(IOException e){}
		//catch (FileNotFoundException e) {} 
		//Invalid because it is sub class of IOException and it is unreachable
		
		
		try{
			obj.methodTwo();
		}
		//catch(IOException e){}
		//Invalid because Compiler know that , methodTwo cannot throw a IOException as it is not declared
		
		catch(RuntimeException e){}
		
		//catch(IllegalArgumentException e){}
		//Invalid because , it is subclass of RuntimeException, which has already been declared
		
		
		try{
			System.out.println("Try-block");
			throw new Exception();
		}catch(Exception e){
			System.out.println("Catch-block");
			throw new IOException("I am a Exception in Catch block");
			//this is never printed, as it is forgotten by compiler because finally has thrown an 
			//Exception , which ultimately will be printed
		}finally{
			System.out.println("Fnillay is always run no matter what unless it is System.exit(0)");
			throw new NullPointerException("I am a null pointer. And I am masking Catch block Exception");
		}
		
		
	}
	
	public void methodOne()throws IOException{}
	
	public void methodTwo() throws IllegalArgumentException{}
	
	public void methodThree() throws IOException{}
}

class ExceptionTest extends HandleDeclareExceptions{
	
	public void methodTwo() throws NumberFormatException{} //Valid can declare any RuntimeExceptions
	
	//public void methodThree() throws Throwable{} 
	// Overridden method must not throw a broader Checked Exceptions
}