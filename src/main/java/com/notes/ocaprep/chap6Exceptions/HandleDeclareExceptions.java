
package com.notes.ocaprep.chap6Exceptions;

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
	 
	 
	 */
	public static void main(String[] args) {

	}

}
