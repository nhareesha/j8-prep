/**
 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 15, 2017 2017
 */
public class InterfacesNotes {

	/**
	
	 	1. An Interface is abstract data type that defines a list of abstract public methods
	 		that any class implementing the interface must provide.
	 		
	 	2. A class invokes the interface by using the "implements" keyword.
	 	
	 	3. A class can implement any number of interfaces.
	 	
	 	4. An interface extends another interface
	 	
	 	5. A non-abstract method in interface should either be default or static.
	 	
	 Defining an Interface
	 
	 	1. An interface cannot be instantiated directly
	 	
	 	2. An interface is not required to have any methods.
	 	
	 	3. An interface cannot be marked as final, private, protected.
	 	
	 	4. All top-level interfaces are assumed to be public and default access. Making an 
	 		interfaces as private, protected or final will trigger COMPILER ERROR.
	 		
	 	5. All non-default methods in an interface are assumed to have the modifiers 
	 	 abstract and public in their definitions. Making a method in interface private, protected
	 	 or final trigger COMILER ERROR.
	 	 
	 Inheriting An Interface:
	 
	 	1. An interface that extends another interface OR an abstract method that implements another
	 		another interface , inherits all of the abstract methods as it own abstract methods.
	 		abstract class need not to provide implementation for inherited method of interface 
	 		
	 	2. The first concrete class that implements an interface, or extends an abstract class that
	 		implements an interface, must provide an implementation for all of the inherited 
	 		abstract methods.
	 		
	 Abstract Methods and Multiple inheritance
	 
	 	1. Java allows multiple inheritance using interfaces because a class can implement any number
	 		of interfaces.
	 		
	 	If we define a class that inherits two interfaces that contains same abstract methods then
	 	
	 		1. If two abstract methods has same name and signature , creating a class that implements
	 			one of the two methods automatically implements the second method.
	 			
	 		2. If methods have different signatures(diff parameters) and same name, then there is no conflict
	 		 	because it is considered a method overload.
	 		 	
	 		3. If methods have same name and same signature but different return types then classe do 
	 			not compile that inherits both interfaces.
	 
	 Interface Variables
	 
	 	1. Interface variables are assumed to be public , static , final .Making a variable
	 		private, protected or abstract will trigger a compiler error.
	 		
	 	2. Value of Interface variables must be set when it is declared , since it is marked as final.
	 
	 */
	

}

interface Test{
	int HEIGHT = 30;//here public final and static are assumed
	
	static int LENGTH=10; //public and final assumed
	
	//int WEIGHT;//COMPILER ERROR!!! because final variables need to be initialized when it is declared.
	
	void methodOne();//here abstract and public are assumed
	
	abstract void methodTwo();//here public is assumed
	
	//private void methodOne();//COMPILER ERROR
	
	//protected void methodOne();//COMPILER ERROR
	
	//final void methodOne();COMPILER ERROR
}

interface TestOne extends Test{} // VALID

abstract class One implements TestOne{}//VALID!! it is not required to provide impl

//class Two extends One{}//COMPILER ERROR!! Must provide impl for inherited methods

interface SameOne{
	public void one();
	
	public void two(int x);
	
	public int three();
}

interface SameTwo{
	public void one();
	
	public void two(int x, int y);
	
	public void three();
}

class MultipleInheritenceTest implements SameOne , SameTwo{

	@Override
	public void one(){} //VALID !! enough to give implementation for one method
	
	@Override
	public void two(int x, int y){}

	@Override
	public void two(int x){}

	public int three() {//COMPILER ERROR!!! because it is invalid type of override
		return 0;
	}
	
	//abstract class AbstractOne implements SameOne , SameTwo{} // COMPILER ERROR!! because it is invalid type of override
}
