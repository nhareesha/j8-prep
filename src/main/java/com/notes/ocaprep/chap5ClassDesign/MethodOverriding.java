/**
 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

import java.io.FileNotFoundException;
import java.sql.SQLException;

/**
 * @author Hareesha
 * Jan 12, 2017 2017
 */
public class MethodOverriding extends ParentThree{

	/**
	 * Overloading : same name , but different signatures(diff parameter types and numbers)
	 * Overriding : same name and same signature
	 
	 * Overriding rules:
	 
		1. Methods in child class must have same signature as that of parent class method.
			same method name and same number and type of parameters.
		
		2. Methods in child class must be atleast as accessible or even more accessible than the 
			methods in the parent class.
			
		3. The methods in the child class cannot throw new exceptions or an exception broader 
			than the exception that is broader than the ones that were thrown in parent class.
			A child method can hide or eliminate parent method exception entirely, but cannot define
			new Exceptions.
			
		4. The method return type must be same type or subtype(covariant type) of the parent method return type
		
		
	NOTE:While answering overridden type questions, check if methods in parent and subclass share same signature
		 If so then check for rules, if methods do not share same signature , then can be overloaded too
		 
		 Any time on exam question first see if methods are being overridden or overloaded first, doing so
		 will help us to identify if code will compile or not
		 
	Redeclaring Private Method:
		
		1. Private methods of parent class are not visible in child class.So that means child class
			can have its own method as the same name and signature of praent class private method.
			The defined method would be independent on parent class and no overriding rules are
			applied.
			
	Hiding static methods:
	
		Methods are said to be hidden, if child class defines a static methods with same name and
		signature as static method as defined in parent class.
		
	Rules For Method Hiding:
	
	   1. It follows as all rules of overriding plus
	   
	   2. Method of child class must be marked as static, if it is masked as static in parent class
	   	(method hiding)
	   	Likewise, if method must not be marked as static in child class, if it is not marked as
	   	static in parent class(method overriding)
	   	
	Overriding Vs Hiding:
		
		1. If overridden method is called using super class reference, then that method is replaced
			at runtime in the parent class with the child class method
			
			If the static method is in child class and parent class , then parent class static method is
			not visible in child class.So only parent class version is called.
			
	final methods:
		
		1. methods marked as final cannot be overriden in subclasses.
		
	 */
	
	public void methodOne(){} //VALID , everything is same as that of super class
	
	//void methodTwo(){} //COMILER ERROR!! void is not subtype of int
	
	//int methodTwo(){} // COMPILER ERROR!! method visibility got reduced
	
	//protected int methodTwo() throws FileNotFoundException{}// COMPILER ERROR!! cannot throw new Exceptions
	
	//protected void methodThree() throws Exception{}//COMPILER!! cannot throw more broader exception
	
	protected void methodThree(){}//VALID!! can hide or eliminate parent method exception
	
	//private int methodFour(){return 1;}//COMPILER ERROR!! Cannot reduce visibility
	
	//protected long methodFour(){return 1;}//COMPILER ERROR!! long is not ub type of int
	
	protected String methodFive(){return null;}//VALID!!! because every object is subtype of Object
	
	
	private void privateMethodOne(){}//VALID !! because parent class private method is not visible here
	
	protected void privateMethodTwo(){}//VALID !! because parent methods are not visible in child
	
	//protected  void staticInChild(){}// COMPILER ERROR!! child class should also have static keyword
	//static void staticInChild(){}// COMPILER ERROR!! method hiding cannot reduce the visibility than parent class
	
	public static void staticInChild(){}// VALID!! child class can be even more accessible
	
	protected void overrideMethodOne(){
		System.out.println("OverrideMethodOne - child class");
	}
	
	protected static  void methodHide(){
		System.out.println("methodHide - Child class");
	}
	
	//protected final static void finalMethod(){}// COMPILER ERROR!! cannot override final method
	
	public static void main(String... args){
		
		MethodOverriding obj = new MethodOverriding();
		obj.methodHide(); // this calls the child class method only
		
		obj.overrideMethodOne();
	
	}
}

class ParentThree{
	
	public void methodOne(){}
	
	protected int methodTwo(){return 1;}
	
	protected void methodThree() throws SQLException{}
	
	protected int methodFour(){return 1;}
	
	protected Object methodFive(){return null;}
	
	
	private void privateMethodOne(){}
	
	private void privateMethodTwo(){}
	
	protected static void staticInChild(){}
	
	
	protected void overrideMethodOne(){
		System.out.println("OverrideMethodOne - Parent class");
	}
	
	protected static  void methodHide(){
		System.out.println("methodHide - Parent class");
	}
	
	protected final static void finalMethod(){}
}
