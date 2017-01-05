package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 5, 2017
 */
public class DesigningMethods {

	/**
		1. Java has a default keyword but that is not used fro access control
		
		2. AccessModifiers are public ,private ,protected 
		
		3. Optional specifiers are static ,  abstract and final.
		
		3. there are can be zero or more optional specifiers in  method and they can appear
			in any order.
			
		4. Method that has return type of void can have a return statement with no value.
		
		5. Method has same naming conventions as that of variables
		
			1. name cannot start with number
			
			2.name can have letters , numbers , $ and _
			
			3. Java reserved words are not allowed to be method names
			
			4. method names begin with lower case letters but are not required to.
			
		6. return type , method name and parenthesis and braces are required for any method
		
		7. Access specifiers , optional specifiers and Exception list are optional
			
	 */
	
	
	//VALID
	
	private void pass1(){ }
	
	private void pass2(){return; }
	
	public final void pass3(){ }
	
	void pass4(){ }
	
	private final static void pass5_(){ }
	
	private static void $pass6(){ }
	
	final public void Public(){ } //since java is case sensitive - so public and Public are different
	
	
	//IN VALID
	/*
		private void 1fail(){}
		
		void String fail2(){ } //No return statement
		
		void  fail3(){ }
		
		void String fail2 { }
		
		void fail2 void(){ }
		
		void String fail2;
		
		void public fail3(){}
		
		String fail4(){
			String val = "Hello";
			if(val == "Hello")
				return "Hello"; //return statement in  conditional block  
		}
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
