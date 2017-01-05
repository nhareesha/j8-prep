/**
 * 
 */
package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 5, 2017
 */
public class AccessModifiers {

	/**
	 		1. private : The method/variables can only be called from within same class.
	 		
	 		2. public : The method/variable can be called from any class and any package.
	 		
	 		3. protected : the method can only be called from classes in same package or subclasses.
	 		
	 		4. default: It is not a keyword , but when  a method do not have any access specifier ,
	 			then it is default scope.The classes in the same package can access it.

		Rules for protected members access
		
		1. They are accessible in same class , same package.
		
		2. They are accessible in sub class, without reference
		
		3. If protected members are accessed using reference variable , then that 
			
			reference variable type must be subclass(same or difference package) 
			
			or it must be in same package as that of protected members




	 */
	
	private String noise = "quack";
	
	String dflt = "default"; //No access modifier means , default access modifier or package private

	protected String value = "protected";

	public String nature = "public";
	
	
	private String getSound(){
		System.out.println("Private method : "+noise);
		return noise;
	}
	
	public static void main(String[] args) {
		AccessModifiers o = new AccessModifiers();
		
		o.getSound();// VALID !!because getSound private method is being accessed in same class
		
		System.out.println(o.nature); // this is public property and is available any where
		
		System.out.println(o.dflt); //same class - default modifier
		
		System.out.println(o.value); //Available - value has protected modifier - access from same class 
		
		AnotherClass i = new AnotherClass();
		i.test();
	}
	
	private void test(){
		getSound(); // allowed since getSound() is private and it is being accessed from same class
		
		System.out.println(value); //being accessed from same class
	}

}

class AnotherClass{
	
	public void test(){
		AccessModifiers obj = new AccessModifiers();
		
		//System.out.println(obj.noise); COMPILER ERROR !!! noise is private property of AccessModifier class and it is not accessible
		
		System.out.println("Another class - same package "+obj.nature);// VALID !!! since nature is public variable of the class
		
		System.out.println("Another class - same package "+obj.dflt); //VALID !!! default modifier
		
		System.out.println(obj.value); // Available -- value has protected modifier
									  // AnotherClass belong to same package as AccessModifier class
	}
	
}