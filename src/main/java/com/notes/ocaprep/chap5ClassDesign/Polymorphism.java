/**
 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 23, 2017
 */
 class Polymorphism extends Rodent{

	/**
	Polymorphism:
		1. A java object may be accessed using a reference with same type as object, a reference 
			that is super class of object, or a reference that defines an interface the object 
			implements,either directly or through a superclass.
			
		2. Once object has been assigned to a new reference type, only the methods and variables
			available on the reference type are called on the object without an explicit cast.
			
		3. explicit cast is needed in order to access the methods or variables that belong 
			to actual object need to be accessed.
		
		Object Vs Reference:
		
			Eg: Object obj = new String();
				obj is the reference
				Object is the reference type
				new String() is actual object
				
		3. In java all objects are accessed by reference, as a developer we never have direct access
			to the object itself
			
		4. Regardless of type of reference for the object in the memory, the object itself will
			doesn't change.
			
		Rules:
		
		1. The type of object determines which properties exist within the object that is in memory.
		
		2. The type of  reference to the object determines which methods and variables are available
			to the java program(Or at COMPILE time)
			
		Casting Objects:
		
		1. Casting a object from subclass to super class or interface 
			doesn't require an explicit cast.
		
		2. Casting a object from superclass to subclass require an explicit cast.
		
		3. The compiler will not allow cast to unrelated types, that is any class hierarchy that is 
			compiler is aware of.
		
		4. Even when the code compiles at compile time, an exception may be thrown at runtime if
			object being cast is not actually a instance of the class.
			
		NOTE : Always check instanceOf test passes, if passes then only Exception WILL NOT BE thrown
				else it throws ClassCastException
	 */
	public static void main(String[] args) {
		
		Rodent rodent = new Rodent();
		
		Polymorphism obj1 = new Polymorphism();
		
		//Throws ClassCastException
		
		//as rodent is not instancecOf Polymorphism
		//Polymorphism obj = (Polymorphism) rodent;
		
		//Object being cast here is rodent, it not the instanceOf Polymorphism class
	}

}

class Rodent{}

interface First{
	void print(); //public abstract is assumed
}

class FirstClass{
	boolean result(){
		return false;
	}
}

class SecondClass extends FirstClass implements First{
	
	public void print() {
		System.out.println("Hello this is overriden class");
	}
	
	public static void main(String args[]){
		
		SecondClass subRef = new SecondClass();
		
		FirstClass superRef = subRef; // VALID!! Explicit cast is not needed
		
		First interRef = subRef;// VALID!! Explicit cast is not needed
		
		
		subRef.result();//VALID
		subRef.print();//VALID
		
		superRef.result();// VALID!! 
		//superRef.print();//COMPILER ERROR!! Only methods and variables of FirstClass are available
		
		((SecondClass) superRef).print();//explicit cast is needed in order to access the methods or 
		//variables that belong to object need to be accessed.
		
		
		interRef.print();//VALID
		
		//interRef.result();//COMPILER ERROR!! Only methods and variables of First are available as it is ref type
		
		
		//SecondClass subRef2 = new FirstClass();
		
		//COMPILER ERROR!! Superclass object cannot be directly assigned
		//to subclass reference, it is too big to fit in.Needs a explicit cast.
		
		
		FirstClass superRef2 =  new FirstClass();
		SecondClass subRef2 = (SecondClass)superRef;//EXPLICIT CAST is needed when super to sub
		
		SecondClass subRef3 = (SecondClass)superRef2;//throws ClassCastException as, superRef2 is not
		//instance of SecondClass 
		
		//Polymorphism poly = (Polymorphism)superRef2;//COMPILER ERROR, no way classes are related
	
	}
	
}