/**
 * 
 */
package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 4, 2017
 */
public class DataEncapsulation {

	/**
	 	1. Encapsulation means setting up class so that only methods in the class with variables
	 	   can refer to the instance variables.Callers must use the methods to access the instance 
	 	   variables.
	 	   
	 	2. For encapsulation , the data(variables) is private and getters/setters are public.
	 	
	 	3. Java defines naming conventions for JavaBeans
	 	
	 		1. Properties(variables) are private
	 		       Eg : private int nums;
	 		       
	 		2. Getter methods begin with " is " , if the property is boolean.
	 				Eg : public boolean isHappy(){return false;}
	 				
	 		3. Getter methods begin with " get" , if property is not boolean.
	 				Eg : public int getNum(){return 1;}
	 				
	 		4. Setter methods begin with " set" .
	 				Eg : public void setNum(){}
	 		
	 		5. The method name must have prefix get/set/is followed by the first
	 			letter of the property in uppercase, followed by the rest of the property 
	 			name.
	 			
	 				Eg: public void setNum(int x){
	 					num = 10;
	 				}
	 				
	 				
	 	4. 
	 
	 */
	public static void main(String[] args) {

	}

}
