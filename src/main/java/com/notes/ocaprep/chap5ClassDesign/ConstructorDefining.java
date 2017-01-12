/**
 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 11, 2017
 */
public class ConstructorDefining extends ParentOne{

	

	/**
		Defining Constructors : 
			1. The first statement of every constructor is either a call to another constructor 
			    using this() , or call to parent constructor using super()
			    
			2. If parent constructor takes arguments then super() also need arguments .
			
			3. super() must be the first statement of the constructor.
			
			4. Java compiler automatically inserts a no-arg constructor super() if first statement is 
				no a call to parent constructor.
				
			5. If parent class doesn't have a no-arg constructor and child class does not define any 
				constructor , the compiler will throw an error and try to define an no-arg constructor in 
				subclass
				
			6. If parent class doesn't have a no-arg constructor , then the compiler requires a explicit
				call to a parent constructor in each child class.
				
		Calling constructors: 
			
			1. Parent constructor is always called before the child constructor.	

	 */
	
	
	/**Since parent class doesn't have a no-arg constructor , COMPILER ERROR **/
		//ConstructorDefining() {}
	
	
	/** If there is no parent class constructor then child class must call constructor explicit**/
	public ConstructorDefining(){
		super("Hello"); //This is valid
		System.out.println("some statemtn");
		//super("Hello"); COMPILER ERROR
	}
	
	
	/** Parent constructor executed before child constructor all the way up to the inheritance tree**/
	public ConstructorDefining(String name , String age){
		super(name,age);
		System.out.println("Hello I am from child class");
	}
	
	public static void main(String args[]){
		new ConstructorDefining("h","20");
	}
}

class ParentOne{
	String name;
	ParentOne(String name){
		//COMPILER by default put super() call for Object class
		this.name = name;
	}
	
	ParentOne(String name, String age){
		//COMPILER by default put super() call for Object class
		System.out.println("I am from Parent :"+name+":"+age);
	}
}
