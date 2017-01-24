/**
 * 
 */
package com.notes.ocaprep.chap5ClassDesign;

/**
 * @author Hareesha
 * Jan 23, 2017 2017
 */
public class VirtualMethods extends SuperClass{

	/**
	 Virtual Methods :
	 
	 	1. A virtual method is a method, whose implementation is not determined until runtime.
	 	
	 	2. All non-final, non-static and non-private are considered to be virtual methods.
	 	
	 	Virtual Methods Principle:
	 	
	 		If you call a method on a object that overrides a method, you get overridden method,
	 		even if the call to the method is on a parent reference or with in the parent class
	 		
	 	Hidden Methods:
	 	
	 		A method that is private in parent class and the subclass has exact same method with
	 		different access modifier then they can be called as hidden methods.
	 		
	 		For hidden methods the access depends on, from where they are accessed.
	 		If they are called on super class reference, the super class version is called.
	 		If they are called on subclass reference, then the subclass version is called.
	 
	 */
	int j = 100; //here this variable is not overriden, it is just hidden.Variables cannot be overriden
	public static void main(String[] args) {
		
		/* Reference type is SuperClass and actual object is VirtualMethods*/
		SuperClass superObj = new VirtualMethods();
		
		superObj.i=20;
		
		superObj.getName(); //here subclass method is called.
		
		superObj.getInfo();
		//here getName method of subclass is called internally, because the actual object is subclass
		
		System.out.println(((VirtualMethods)superObj).privateMethod());
		
	}
	
	protected String getName(){
		System.out.println("Name: SubClass - VirtualMethods");
		System.out.println(this.i+"super class variable value: "+ super.i + this.j);
		return "SubClass";
	}
	
	protected String privateMethod(){
		return "From Subclass";
	}
	
}


class SuperClass{
	
	int i = 10;
	int j =10;
	
	String getName(){
		System.out.println("Name : Superclass");
		return "SuperClass";
	}
	public void getInfo(){
		System.out.println(getName());
	}
	
	private String privateMethod(){ //this is hidden method, not overriden in super class
		return "From Parent";
	}
	
	//when accessing a hidden method it depends on from where it is called.
	
	public static void main(String[] args) {
		SuperClass obj = new VirtualMethods();
		System.out.println(obj.privateMethod());
	}
}

