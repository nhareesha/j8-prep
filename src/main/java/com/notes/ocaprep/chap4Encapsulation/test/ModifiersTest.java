/**
 * 
 */
package com.notes.ocaprep.chap4Encapsulation.test;

import com.notes.ocaprep.chap4Encapsulation.AccessModifiers;

/**
 * @author Hareesha
 * Jan 5, 2017
 */
public class ModifiersTest extends AccessModifiers {
	
	
	
	private void protectedTest(){
		
		/* Member is used without reference variable - Subclass and protected scope */
		System.out.println(value); //this can directly be visible because 
								   //what ever protected are there is super class is available in subclass
		
		System.out.println(nature); //public variable - from super class -VALID - without reference varaible
		
		
		ModifiersTest subObj = new ModifiersTest();
		
		System.out.println(subObj.value);//here reference variable is subclass , so it allow access
		
		
		AccessModifiers supObj = new AccessModifiers();
		
		//System.out.println(supObj.value);
		
		/* This DOESN'T COMPILE. because the reference variable used is not subclass or in same package
		 * 	
		 * Protected is only allowed ,if the reference is subclass or the reference belong to same package
		 * as that of property/method being accessed.
		 * AccessModifiers is not sub class of it self ! or nor it is being accessde from same package as that 
		 * of AccessModifiers class.
		 * 
		 * */
		
		System.out.println(supObj.nature);//public variable - can be accessible from any where
		
		//System.out.println(noise); // private variable - from super class- IN VALID access
		
		//System.out.println(dflt); //default variable - Not visible in different package class
		
	}
	
	
	public static void main(String[] args) {
		
	}

}
