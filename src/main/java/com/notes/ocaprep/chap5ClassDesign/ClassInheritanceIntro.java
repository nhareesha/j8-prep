package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 11, 2017
 */


/*** protected or private, static modifiers are illegal in class level modifiers */
public class ClassInheritanceIntro extends Parent{

	/**
	 	Extending a class : 
	 		
	 		1. Java supports multiple inheritance, by which it can have only one direct parent.
	 		
	 		2. Java allows only one public class per file.
	 		
	 		3. Methods from super class with modifiers public and protected are available in child class
	 		   even without any reference.That means they can be treated as if they belong to subclass.
	 		   
	 		4. If super class variables need to be accessed in subclass, then they can directly referenced 
	 		   in subclass without reference.
	 		   
	 		   But if same variables are present in subclass also, then super class variables need to 
	 		   references using super key word in subclass , because subclass variables hide the presence of
	 		   same super class variables.
	 		   
	 	Applying Class Access Modifiers : 
	 	
	 		1. For top level class or Interface only public and package-level class access modifiers can be 
	 			applied. abstract and final optional modifiers are allowed.
	 			
	 			*** public,package-level,abstract and final are ALLOWED ****
	 		
	 			*** static, protected and private are NOT ALLOWED ****
	 			
	 		2. A java file can have any number of classes ,but at most one public class or Interface is allowed.
	 		 	that means a java file may have no public class at all.
	 		 	
	 	Creating Java Objects:
	 	
	 		1. All java classes inherit from one single class that is java.lang.Object.
	 		
	 		2. When java compiler sees that we define a class that doesn't extend another class, it 
	 		  immediately adds the syntax " extends java.lang.Object" " to the class definition.
	 		  
	 		  But when we define a class that extends a existing class, Java doesn't add this syntax.
	 		  although new class still inherits from Object class.
	 
	 */
	
	public String first="Hi"; //same variable name as super class
	public static void main(String[] args) {
		
		ClassInheritanceIntro o = new ClassInheritanceIntro();
		o.testAccess();
		
	}
	
	void testAccess(){
		System.out.println(super.first); //accessing super class variable
		
		System.out.println(first); //this gives subclass variable value
		
		System.out.println(second); //this gives super class value, because there is no same subclass varaible name
		print();
	}
}


class Parent{
	protected String first="Hello";
	public String second = "second from super class";
	private String third;
	
	protected void print(){
		System.out.println(first+second+third);
	}
}

/** *COMPILER ERROR!!  Public type interface must be defined in its own file**/
//public interface interfaceOne{}
	
