/**
 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 13, 2017 2017
 */
public class InheritingVariables extends ParentFour{

	/**
	 	Inheriting Variables: Java DOES NOT allow variables to be overridden but instead hidden
	 
	 	1.When we hide a variable , we define a variable with the same name as a variable in a
	 		parent class. This creates two copies of variables within in an instance of the child class
	 		one instance defined for parent reference and another defined for the child reference.
	 		
	 	2. If we are referencing variable from within parent class then parent class variables are used,
	 		if referencing a variable from within in child class then child class variable is used.
	 		
	 	3. We can explicitly reference the parent class variables from child class using "super."
	 	
	 
	 */
	
	protected int val = 60;//here this variable is not overridden , it hide the same variable from parent
	
	protected void printValueChild(){
		System.out.println("Value from child class :"+val);
		System.out.println(super.val);//explicitly referencing parent class variable
	}
	public static void main(String[] args) {
		
		InheritingVariables obj = new InheritingVariables();
		obj.printValueParent();
		obj.printValueChild();
		
	}

}

class ParentFour{
	
	protected int val = 20;
		
	protected void printValueParent(){
		System.out.println("Value from parent class :"+val);
	}
}
