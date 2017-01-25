/**
 * 
 */
package com.notes.ocaprep.chap1JavaBuildingBlocks;

/**
 * @author Hareesha
 * Jan 25, 2017
 */
public class ObjectInitializations {

	/**
	
	1. Code block present out side any method is called initialization block.
	
	Order Of initialization :
		
		1. Fileds and instance initializer blocks are run in the order in which they appear
			in the file.
			
		2. Constructors are run after all the fields and initializer blocks have run.
	
	Primitive types: 8 primitive types
	
		1. float[ 32 bit decimal value ]. Floating point requires "f" following the number so java knows 
			it is floating point. ( Like 2 to the power of 32 ). 123.10f
		
		2. double[ 64 - bit decimal ]. ( Like 2 to the power of 64 )
		
		3. byte [ 8 - bit integer value ] ( Like 2 to the power of 8 )
		
		4. short [ 16 - bit integer value ] ( Like 2 to the power of 16 )
		
		5. int [ 32 - bit integer value ] ( Like 2 to the power of 32 ) -128 to 127
		
		6. long [ 64 - bit integer value ] ( Like 2 to the power of 64 )
		
		7. boolean [ true /false ]
		
		8. char [ 16-bit unicode value ] 'a'
	
	Numeric Literals:
	
	1. Java assumes, when a number is present in the code, it called literal.
	      By default Java assumes, a literal to be int where ever it is used.
	      
	2. If a literal value is over the interger max value and is assigned to long, it is a 
	    compiler error.So to avoid it we have to put "L" or "l" at the end.
	    	
	    	Ex : long val = 129; Error
	    		
	    		Because 129 is a considered a literal and compiler thinks it as a int value ,which
	    		is big for a integer.
	    	
	    	So, long val = 129L;
	    	
	3. Another feature is , numeric literal can have underscore in the number any where,
	 	EXCEPT at begin of literal , end of literal , right before decimal , right after decimal
	
	Casting: 
	
		1. byte , short, int , long , float , double  is the order
		
		2. When ever decimal literal is assigned to float, it should be folloed by "f"
	
	 */
	
	
	int val  = 20 ; // 1
	
	
	
	{
		val = 30; // 2
		
		j = "hi";
	}
	
	String j = "Hello";
	
	
	int a = 21474;
	
	//int b = -3291231231;//COMPILER ERROR!! it is over int min val
	
	float c = 123; // small can fit in big
	
	// float d = 123.4 ;// "f" needs to be there
	
	float d = 123.4f;
	
	double e = 123.4;
	
	long f = 2147483647;
	
	public ObjectInitializations(){
		val = 40; // 3 as last, constructor runs at last 
	}
	public static void main(String[] args) {

		ObjectInitializations obj = new ObjectInitializations();
		
		System.out.println(obj.val); // it gives 40
		
		System.out.println(obj.j); // it gives Hello becuase, code block came first before initialization
		
		System.out.println(Integer.MIN_VALUE);// -2147483648
		System.out.println(Integer.MAX_VALUE);// 2147483647
	}

}
