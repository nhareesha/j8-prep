/**
 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 12, 2017 2017
 */
public class InheritedClassMembers extends ParentTwo{

	/**
		1. Child class inherits all the members of the parent class with access modifiers declared
			as public and protected and also default members if they belong to same package.
			
		2. Child class can never access members of the parent class that are defined with private
			modifier
			
	Accessing parent class members:
		
		1. To reference a member in parent class, we can just call to directly as if those belong to
			child class without any reference.
			
		2. We can use "this" to access the members of the parent class that are accessible from child
			class.
			
		3. We can explicit reference members of the parent class using "super" keyword in child class.
		
		4. In order to reference members defined in parent class we can use either "this" or "super" keyword
			but ,  In order to reference members defined in subclass only "this" can be used

	 */
	public static void main(String[] args) {

	}

	String set ;
	String city;
	public String sameVar;
	
	public InheritedClassMembers(){
		
		//super().getAge();COMPILER ERROR!! Invalid use of keywords
		
		this.age = 20; //Parent class member , accessed with this
		super.name="h"; //Parent class member , accessed with super
		school = "any"; //Parent class member , accessed without any reference
		
		
		this.set="A"; //child class can only use this
		city = "cal";//child class member , accessed without any reference
		
		sameVar="subcalss"; //this refer to subclass variable
		this.sameVar="subclass"; //this again refer to subclass
		super.sameVar = "super"; //parent needs explicit ref , if both have same name variables
		
		
		super.getAge();//calls super class method
		
		this.getAge();//calls super class methods
		
		//super; COMPILER ERROR!!
		//super().getAge();
	}
	
	
}

/**
 * SUPER CLASS
 * @author Hareesha
 * Jan 12, 2017
 */
class ParentTwo{
	
	public int age;
	protected String name;
	protected String school;
	
	public String sameVar;
	
	public int getAge(){
		return age;
	}
	
	
}
