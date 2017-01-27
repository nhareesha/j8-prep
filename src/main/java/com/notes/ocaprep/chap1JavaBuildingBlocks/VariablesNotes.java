package com.notes.ocaprep.chap1JavaBuildingBlocks;

/**
 * @author Hareesha
 * Jan 25, 2017 2017
 */
public class VariablesNotes {

	/**
	 
	 Variables:
	 	1. Variable is a piece of name that stores the data in the memory.
	 	
	 Multiple Variables in same statement:
	 
	 	1. We can declare and initialize multiple variables in same line as long they are of same 
	 		data type.
	 		
	 		Ex : int i,j;
	 			 int i=0,j;
	 			 int i , j=20;
	 			 
	 		
	 	2. Multiple variable declarations should be separated by  a comma and should have same type.
	 	
	 	3. Semicolon separates statements in java.
	 	
	 Identifier Naming Rules:
	 
	 	1. Name must begin with letter or symbol $ _
	 	
	 	2. Subsequent characters after the first letter can be numbers, letters, $ _
	 	
	 	3. We cannot use java reserved words for identifiers.
	 	
	 						Default Initialization Of Variables:
	 
	 	Local Variables
	 	
	 	 1. Local variables must be initialized before use.
	 	 
	 	 2. They do not have default value ,until initialized they they hold garbage value.
	 	 
	 	 3. The compiler will not let you read a uninitialized value.
	 	 
	 	 4. Local variables cannot have larger scope than the method they are defined in
	 	 
	 	Instance and Class(static) Variables:
	 	
	 	1. Instance and Static variables DO NOT require you to initialize them.
	 	
	 	2. Inastance and class variables get the default values as soon as they are declared.
	 	
	 	3. Default Values:
	 		boolean - false
	 		
	 		byte, short, int ,long - 0(in the type's bit length)
	 		
	 		float, double - 0.0
	 		
	 		char - '\u0000'(NULL)
	 		
	 		any object - null
	 		
	 	4. Ordering of element in file PIC[ Package , Import , Class ]
	 	
	 Compiling And Executing java program:
	 
	 	1. javac compiles a .java file into .class file
	 	
	 	2. For execution "java classname without .class extension"
	 	
	 	2. When passing paramets from cmd line , java fileName arg1 arg2 "arg3 of two words" 
	 	 	
	 */
	
	String a , b; //VALID
	
	String c = "hello" , d;
	
//	String e , String f; multiple varaibles on statement should share same type
	
	int i ; int j;//valid ; separes the statements
	
	 // int k , String c; multiple varaibles declarations of different types cannot be in ne statement
	
	boolean $h;
	
	boolean _h;
	
	//boolean h@;//@ is invalid character
	
	//boolean char;//reserved words are not allowed
	
	boolean Char;//Valid , java is case sensitive
	
	//boolean 9h; numbers are not allowed in the first place
	
	static char var1;
	
	public static void main(String[] args) {
		
		char var2;
		
	// System.out.println(var2);//local variable cannot be used without initialization
		
		System.out.println(var1);
	}

}
