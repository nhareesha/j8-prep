package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 18, 2017
 */
public class StaticMethodsInInterface implements StaticOne , StaticTwo {

	/**
	1.	A static method defined in an interface is not inherited in any clasees that
		implement the interface.
		
	2. Like all the methods in the interface,  static method is also assumed to be public and
		will not compile if it is marked as private and protected.
		
	3. To reference a static method , a reference to the name of the interface must be used.
	
	4. If a class implements two interfaces that has same static methods, then the class COMPILES
		Unlike , default methods it is not forced to provide impl for the duplicate static method.
	
	 */
	
	public static void main(String args[]){
		//methOne();//COMPIER ERROR!! cannot access static method of interface like this
		
		StaticOne.methOne();//all the static methods of interface need to be referenced with name.
		StaticTwo.methOne();
		
	}
	
	 public void defOne(){ //here access modifier need to be public we cannot decrease the visibility
		System.out.println("Default method two");
	}
}

interface StaticOne{
	static void methOne(){
		System.out.println("static method one");
	}
	
	default void defOne(){
		System.out.println("Default method one");
	}
}

interface StaticTwo{
	static void methOne(){
		System.out.println("static method two");
	}
	
	default void defOne(){
		System.out.println("Default method two");
	}
}
