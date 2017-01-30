/**
 * 
 */
package com.notes.ocaprep.chap2OperatorsAndStatements;

/**
 * @author Hareesha
 * Jan 28, 2017 2017
 */
public class OperatorPrecedence {

	/**
	 Operator Precedence:
	 
	 1. Order of operation : Left - to - Right
	 
	 precedence: Order High to Low
	 	
	 	Post Unary Operator,Pre Unary Operator:   exp++ , exp--  ++exp , --exp
	 	
	 	They have the precedence in the order which they appear in the expression
	 	
	 	Other Unary Operators : + - !
	 	
	 	Multiplication Operator : * , /(Quotient) , %(Reminder)
	 	
	 	Addition/Substraction : + ,-
	 	
	 	Relational Operators : < , > ,<=,>=, instanceOf
	 	
	 	Equal to not equal to : ==,!=
	 	
	 	Logical Operator : & ,^ ,|
	 	
	 	short-circuit operator : && , ||
	 	
	 	Terinary Operator : ?:
	 	
	 	Assignment Operator : = ,+=,-=
	
	 2. If paranthesis are there arround a expression, it is evaluated first ad overrides
	 	the operator precendece.
	 
	 3. Operators from the same group will have the same precendece , and they are executed from
	 	left to right:
	 		Ex : +  - Plus executed first before -
	 			
	 			% / --> % executed first before /
	 			
	 4. Division( / ) if leads to decimal values in the quotient, it rounds it to 1.No matter if it
	 	is 0.2 or 0.8
	 	
	 Numeric Promotions :
	 
	 	1. If two values have different datatypes , Java will automatically promote one of the value to 
	 		the larger of the two data types.
	 		
	 	2. If one of the value is intergral and other is floating point, Java automatically promotes
	 		the integral value to the floating-point value data type.
	 		
	 	3. Smaller data types namely "byte, short, char" are first converted to "int" at anytime theya are
	 		used with binary arithmetic operator, even if neither of the operator is int.
	 		
	 	4. After all numeric promotion has occurred and the operands have the same type, the resulting
	 		value will have the same data type as its promoted operands.
	 
	Note:  
	
	1. The default value of float and double that will be printed is 0.0.
	 		Ex : float a = 3;System.out.println(a);//3.0
	 
	 Unary Operators :
	 	
	 	1. +(indicates the number is positive), -(indicates the number is negative)
	 	
	 	2. ++a,--a  [operator is applied first and new value is returned to the expression]
	 	
	 	3. a++,a-- [Original value of expression is calculted first and returned and then after operator is applied.
	 	
	 	 
	 
	 */
	public static void main(String[] args) {
		System.out.println(9/3);//3
		
		System.out.println(9%2);//1
		
		int a = 3 / 4 + 1 ; 
		
		int c = 3%4+1;
		
		System.out.println(c);
		System.out.println(a);//0.6(quotient) is rounded to 1
		
		int b = 1/4+1;//here first + is executed , as it has higher precendece
						//0.2(quotient) is rounded to 1
		
		System.out.println(b);
		
		//Numeric Promotion
		
		short s1 = 12;
		short s2 = 11;
		
		//short i1 =s1+s2;//this is compilation error , because due to numeric promotion 
						//short is first converted to int and the result would also
						//be of int type
		
		int i1 = s1 + s2 ; //valid , short converts to int and result is int
		
		//float f1 = 1.2; //Invalid , by default the decomalvalue is assumed to be deimal unless
						//followed by f
		
		float f1 = 2;
		float f2 = 3 ;
		
		float f3 = f1+ f2; //here same data type
		System.out.println(f3);
		
		char c1 = 11;
		short s4 = 22;
		float f4 = c1 + s4;//bye, short , char are converted to int when used with binary operator
		System.out.println(f4);
		
		double d1 = 2;
		System.out.println(d1); //2.0
		
		double d2 = 3;
		char c2 = 90;
		System.out.println(d2+c2);//93.0
		
		
		//Unary Operator - Pre and Post increment and decrement operators
		
		int counter = 0;
		
		System.out.println(++counter);// 1
		System.out.println(counter); // 1
		
		counter = 2 ;
		System.out.println(counter++);// 2 - Expression is evaluated first returned
									//and then the value is calculated
		
		System.out.println(counter); // 3 - its show the updated value
		
		
		int x = 3;
		
		int y = ++x * 5/x-- + --x;
		//x = 4
		//4*5/4+2
		//20/4+2
		//5+2 --> 7 
		
		// the final value of the x is 2
		
		System.out.println(x);//2
		System.out.println(y);//7
		
		
	}

}
