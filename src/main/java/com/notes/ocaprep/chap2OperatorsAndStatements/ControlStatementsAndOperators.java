/**
 * 
 */
package com.notes.ocaprep.chap2OperatorsAndStatements;

import java.io.File;

/**
 * @author Hareesha
 * Feb 1, 2017
 */
public class ControlStatementsAndOperators {

	/**
		Switch Statement:
			1. Data types supported by Switch
				byte	Byte
				short	Short
				int		Integer
				char	Character
				String
				enum 
				
			2. The values in each case statement must be compile-time constant values of
				same data type as the switch value.
				
				The case statement use only literals or final constant variable of same type or
				enum constants.
				
				final function variable do NOT COMPILE, if used in switch case
				
			3. "default" block it is only branched to if there is no matching case value for
				switch statement.
				
		for - Statement :
		
			1. for(init;expression;updatestatment)
			
			2. init block , expression and update statement are all optional
			
			3. paranthesis and semi colon are required
			
			4. for(;;){} , for(;;) COMPILE
			
		for statments - Do NOT COMPILE
			
			1. Reclaring a variable in init block
			
			2. Using incompatable data types in init block
			
			3. Using loop variable outside of the loop
	 
	  Equaity Operator( == ) : 
	  
	  		1. Comparing two numeric primitives. If the numeric values are of diff data types,
	  			the values are automatically promoted according to numeric promotions. 
	  			Ex : 5 == 5.0 , left side is automatically promoted to double and returns true
	  			
	  		2. Comparing two boolean values
	  		
	  		3. Comparing two objects, including null and String.
	  		
	  		4. Comparing two objects, equaliy operator is applied to the references to the objects,
	  			Two reference are equal if any only if they point to same object on the heap.
	  			References store the address of the object that is present on the heap.
	
	 
	 
	 */
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 5;
		
		final int suff = 11;
		
		switch (a) {
		
		case 10:System.out.println("10");
			    break;
			    
	//	case b ://COMPILER ERROR!!B is not a final constant
			    
		case suff:	//stuff is a final variable
		
		//case "hi" : case value is not of same data type
		
		//case val ://COMPILER ERROR!!

		default:
			break;
		}
		
		
		//for(;;){}Valid
		
		int x = 0;
		
		//for(int x=0;;){}//COMPILER ERROR!! local value cannot be redeclared
		
		//for(int a , long y;;);//if two vars are decalred they should share the data type
		
		int a1 = 5;
		double a2 = 5.00;
		
		if(a1==a2){
			System.out.println("Numeric promotion applied");
		}
		
		File x1 = new File("hello.txt");
		File x2 = new File("hello.txt");
		
		if(x1 == x2){
			System.out.println("Object are equal, as the references point to same obj on heap");
		}else{
			System.out.println("references point to different objects on the heap");
		}
	}

}
