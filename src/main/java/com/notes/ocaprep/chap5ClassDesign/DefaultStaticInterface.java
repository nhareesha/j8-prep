package com.notes.ocaprep.chap5ClassDesign;
/**
 * @author Hareesha
 * Jan 16, 2017
 */
public class DefaultStaticInterface {

	/**
	 Default Methods:
	 	
	 	1. A default method is a method defined within an interface with default keyword
	 		in which a method body is provided.
	 	 
	 	2. Default method within an interface defines a method with a default implementation.
	 	
	 	3. Default methods are introduced in java 8 to help with code development and backward compatibility.
	 	
	 	4. If an interface is implemented by n number of classes and there is any update to interface
	 		then all the classes would break and are forced to implement the added method.So
	 		to avoid this a default method is put so that , which ever classes needs it can implement
	 
	 Rules for Default Methods:
	 
	 	1. A default method only be declared in Interface and not within any class or abstract class.
	 	
	 	2. A default method must be always be marked as default keyword.If the method is marked as
	 		default, it must be provided with body.
	 		
	 	3. Default method is not assumed to be static, final or abstract, as it may be used or 
	 		Overridden by a class that implements by a interface.
	 		
	 	4. Like all the methods in interface, default method is assumed to be public and will not compile
	 		if it is marked as private or protected
	 	
	When interface extends another interface that has default method, 
	
		1. The interface that extends another interface may choose to ignore the default methods, 
			in which case the default implementation for the method will be used.
			
		2. the interface may override the definition of default method using the standard rules 
			for method overriding
			
		3. the interface may redeclare the default method as abstract, requiring classes that 
			implements need to provide the implementation.
			
	When a class implements two interfaces that has same default methods
	
		The implemention class should override the DULICATE default method, or else it throws a COMPILER ERROR.
		
		
	 
	 */
	
}

interface DefaultOne{
		//public default void firstDefault();//COMILER ERROR!! default method needs body
	
		//public  void firstDefault(){}//COMPILER ERROR!!non abstract method needs to be either static or default
		
		//void firstDefault();//Valid!! public and abstract are assumed.
		
		default void secondDefault(){
			System.out.println("");
		}
		
		default void thirdDefault(){}
		
		default void fourthDefault(){}
}

interface DefaultTwo extends DefaultOne{
	
	default void firstDefault(){}
	
	default void secondDefault(){
		System.out.println("This overriden");
	}
	
	void thirdDefault(); // this is made abstract
	
}

interface DefaultThree{
	default void fourthDefault(){}//same default method
}

//class DupDefaultMethod implements DefaultOne, DefaultThree {}//COMPILER ERROR

class DupDefaultMethod implements DefaultOne, DefaultThree {
	public void fourthDefault(){} //Forced to override the dulicate default method from the two interfaces
}
