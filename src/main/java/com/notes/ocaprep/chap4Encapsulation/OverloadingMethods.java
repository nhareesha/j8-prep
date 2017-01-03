/**
 * 
 */
package com.notes.ocaprep.chap4Encapsulation;

/**
 * @author Hareesha
 * Jan 2, 2017
 */
public class OverloadingMethods {
	
	/* 
 		1. Method overloading occurs when there are different 
 			
 			method signature with same name but with different parameter types or list
 			
 		2. A overloaded methods can have same or different
 		 
 		   access modifiers , optional specifiers , return type , exception list. 
 		   
 		                    BUT IT MUST HAVE
 		                    
 		   same name and different parameter list or type of parameters
 		
 		3.			Order Java chooses the right overloaded method 	
 		
 			1. Exact match by type
 			2. Larger primitive type
 			3. Exact Autoboxed type
 			4. If Object type is there it get selected
 			4. At last Varargs is selected , if not any of above
 			
 		4. Java treats varargs as if they were an array.So the methods signature is same for both of them.
 		
 		5. Java can only accepts wider types. An int can only be passed to larger type like long.
 		   small fit in large not vice versa.
 		   
 		6. Java is happy to convert from int to long or Integer .
 		   It cannot handle conversion in two step process like int to long and then to Long
 		   
 		7.  As int can be converted to Integer , if Integer type is not there and Object type is there .That 
 		   Particular method is called.
 		  
 		   Reason : int to Integer is one step .Every class in Java is sub type of Object calss , So Object
 		   is larger .So it will get selected
 		
 		
	 * */

	public static void main(String[] args) {
		
		OverloadingMethods obj = new OverloadingMethods();
		
		obj.one(Integer.valueOf(123)); // this unboxes to  int , and it accordingly calls one(int )
		
		obj.two(1, 2);//here larger primitive is there , so int(long ,long) is called
		
		/*  this checks to see if exact match is there two(int ,int) , 
		 * if not see if larger type is there two (long ,long), 
		 * if not then see if Autoboxed type is there two(Intger ,Integer )
		 * if not then see if var args version is there two(int...) 
		 * then sees */ 
		
		obj.three(1,2,3); //here varargs is selected
		
		
		obj.four(1);//here int converted to Integer is selected.Since it is not there object type is selected
		
		
		
	}
	
	
	//void fly(int one){} //IN VALID !!! Same method name and also same type of parameters(which cannot be)
	public void fly(int miles){}
	
	public static void fly(short  foots){} //same name , diff parameters, one optional specifier
	
	public String fly(int miles, String loc) //same name ,diff parameters list , and it has also diff return type
	{return "";}
	
	void fly(float j){} //valid
	
	
	
	//void fly(int[] i){}
	//void fly(int... k){}
	/* DOES NOT COMPILE !!! for java varargs and array are same.FLAGS DUPILCATE methods*/
	
	void one(int num){
		System.out.println("int");
	}
	
	int one(long l){
		System.out.println("long");
		return 123;
	}
	
	
	void two(Integer i , Integer j){
		System.out.println("two - Wrapper");
	}
	
	void two(long i , long j){
		System.out.println("long - primitive");
	}
	
	
	void three(int... a){
		System.out.println("var args");
	}
	
	/*
	void four(Object o){
		System.out.println("Object type parameter");
	}*/
	
	void four(int... o){
		System.out.println("var arg - four");
	}
	
}
