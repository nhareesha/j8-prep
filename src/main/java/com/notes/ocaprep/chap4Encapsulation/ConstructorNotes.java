/**
 * 
 */
package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 2, 2017
 */
public class ConstructorNotes {

	/* 
	  	1. Constructor is used when creating a new object.
	  	
	  	2. Constructor is only called when we write new followed by class name.
	  	
	  	3. When java sees a new key word it allocates memory for new object on heap.Java also looks for 
	  	
	  		Constructor and calls for it.
	  	
	  	4. this keyword tells java that we want to reference an instance variable.
	  	
	  	5. If we don't include any type of constructor then compiler inserts one default constructor(no arg )
	  
	  	6. Class with PRIVATE Constructor is not allowed to be instantiated.calling new returns
	  	
	  		COMPILER ERROR
	  		
	  	*
	  	*					Overloading Constructors
	  	*
	  	
	  		1. A class can have any number of constructors ,  as long as they have different parameter list
	  		   in order to be overloaded.
	  		   
	  		2. A constructor can call another constructor with the help of this().
	  		
	  		3. this() must be first non commented statement in the constructor.This is called constructor chaining
	  		
	  		4. 
	  
	 */
	
	private int len;
	private int wid;
	private int height;
	private double inc;
	private int level;
	
	
	public ConstructorNotes(){} //default constructor
	
	public ConstructorNotes(int len , int wid){ 
		this.len = len;
		this.wid = wid;
	} 
	
	//public constructorNotes(){} //IN VALID !!! constructor name needs to be same as class name 
								// java thinks it is a method now and return type is missing
	
	public ConstructorNotes(int len){
		
		//System.out.println("Constructor - not allowed here - before this");
		this(len , 10,20);
	}
	
	public ConstructorNotes(int len, int wid , int height){
		this(len,wid,height,2);
	}
	
	public ConstructorNotes(int len, int wid , int height , double inc){
		this.len = len;
		this.wid = wid;
		this.height = height;
		this.inc = inc;
		new ConstructorNotes(len,wid,height,inc,3);//this compiles but ignores current obj an creates
	}
	
	public ConstructorNotes(int len, int wid , int height , double inc , int level){
		
	}
	
	
	public static void main(String[] args) {
		
		Rabbit1 r1 = new Rabbit1();
		
		Rabbit2 r2= new Rabbit2(true);
		
		//Rabbit2 r2= new Rabbit2(); COMPILER ERROR!! there is no no-arg constructor
		
		 // Rabbit3 r3 = new Rabbit3(); COMPILER ERROR !!! since constructor is private

	}

}

class Rabbit1{
	
	//Default constructor is supplied
}

class Rabbit2{
	
	public Rabbit2(boolean b){}
	//NO default constructor is supplied , because already one constructor is there
}

class Rabbit3{
	
	//NO default constructor is supplied , because already one constructor is there
	
	private Rabbit3(){} //private constructor means not allowed to be instantiated
}
