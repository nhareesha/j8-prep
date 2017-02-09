/**
 * 
 */
package com.notes.ocaprep.chap2OperatorsAndStatements;

import com.notes.ocaprep.chap4Encapsulation.test.Test;

/**
 * @author Hareesha
 * Jan 29, 2017
 */
public class CastingPrimitiveValues extends Test {

	/**
	 
	 Primitive Value Casting Rules:
	 
	 	1. Small primitive type values when assigned to larger primitive types are implicitly casted.
	 	 	Note : Smaller type fits in bigger types.
	 	 	Excluion : boolean
	 	 	
	 	2. When assigning larger type to smaller types casting is needed.
	 
	 
	 */
	public static void main(String[] args) {
		
		int s1 = 32711;
		
		//int s2 = 1.0;Compiler error
		
		//int s2 = 1f;float doesnt go in intz l
		
		int s2 = (int)1.0d;
		
		float f1 = (float)1.0;
		
		short s3 = 1;
		short s4 = 2;
		
		short s5 = (short)(s3+s4);
		
		
		
	}
	public void print(){
		int y = 10;
		Test t= new Test();
		System.out.println(t.y+t);
		
	}
}
