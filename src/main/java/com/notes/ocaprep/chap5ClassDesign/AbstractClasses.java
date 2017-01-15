/**

 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 13, 2017 2017
 */
public abstract class AbstractClasses extends abstractClassTwo {

	/**
	 * Abstract Class Rules
	 1. Abstract class cannot be instantiated directly
	 
	 2. Abstract class can have any number of abstract and non abstract methods.It can also 
	 	have zero of abstract and non- abstract methods.
	 	
	 3. An abstract class cannot be marked as private or final or protected(to level classes are not allowed to have this).
	 
	 4. An abstract class that extends another abstract class also inherits all of the abstract methods 
	 	as it own abstract methods.And it is not required to provide implementation of inherited methods.
	 	
	 5. The first concrete class that extends an abstract class, is required provide implementation for all of the
	 	abstract methods.
	 	
	 6. An abstract class must always be marked with "abstract" keyword.
	 	
	 Abstract method Rules:
	 
	 1. Abstract methods may only be present in abstract.
	 
	 2. An abstract method cannot be marked as private or final.
	 
	 3. Abstract method must not provide a method body/implementation in the abstract class for 
	 	which is it declared.
	 	
	 4. Implementing a abstract method in subclass follows the same rules as overriding a method.
	 	
	 		1. name and signature should be same.
	 		2. should be atleast as accessible as parent class method.
	 		3. subclass methods should not throw new exceptions or more broader exceptions.It can be
	 			same exceptions or more narrower exception.
	 		4. same or covariant return type
	 		
	 5. An abstract method must always be marked with "abstract" keyword
	 
	 
	 */
	public static void main(String[] args) {

	}
	
	//private abstract void test();COMPILER ERROR!! visibility got reduced during override of abstract method
	
	//private  void test(){}//COMPILER ERROR!! cannot reduce visibility, if it is implemented or 
							// even marked as abstract
	
	protected abstract void test();

}

abstract class abstractClassOne{} //valid!! cannot have any methods also

//final abstract class abstractClassOne{}//COMPILER ERROR!! abstract class cannot be marked final

abstract class abstractClassTwo{
	//abstract void test(){}//COMPILER ERROR!! abstract method cannot have body
	
	//private abstract void test(){}//COMPILER ERROR!! abstract method cannot be private
	
	//final abstract void test();//COMPILER ERROR!! abstract method cannot be final
	
	protected  abstract void test();
}


class ConcreteClassOne extends AbstractClasses{

	protected void test() {
		
	}
	
}
