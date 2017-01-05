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
	 				
	 				
	 	4. Immutable class cannot be changed once after they are instantiated.
	 	
	 	5. For immutable classes , we want caller to be able to specify initial value - we just don't want 
	 	   to change after the object is created.
	 	   
	 	6. For immutable classes we do not provide setters. Just the constructor that sets the property values.
	 		which cannot be changed afterwards
	 
	 */
	
	
	private boolean playing; // valid JavaBean convention to declare a property
	
	public int num; // Invalid  -- Java Beans cannot have public properties
	
	private String myName;
	
	/* valid JavaBean convention - boolean type properties getter begin with is*/
	public boolean isPlaying(){return playing;}

	/* Valid - Any setter begin with keyword set followed by upper case Variable letter*/
	public void setPlaying(boolean playing) {this.playing = playing;}

	/* InValid -- JavaBean Convention - getter should begin with keyword get*/
	public int num() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	/* Valid*/
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public static void main(String[] args) {

	}

}

class Immutable{
	
	private String name;
	
	/*Immutable classes has public constructors*/
	public Immutable(String name){
		this.name = name;
	}
	
	/* Immutable classes only allow getters*/
	public String getName() {
		return name;
	}
	
}
