package com.notes.ocaprep.chap3javaAPIs;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassesNotes {

	public static void main(String[] args) {
		
		//Integer.parseInt(str) returns primitive int , like wise all the other datatypes
		
		//char does not participate in parseX() or Valueof()
		
		Integer i1 = Integer.valueOf(123);//accepts int or string
		
		Integer i2 = Integer.valueOf("123"); // accepts string
		
		/* int i3 = Integer.valueOf("3F");//throws exception , coz 3F is not of type int */
		
		//if string given to parse or value  is of not valid type for the given type , Java throws Exception
		
		float f = Float.parseFloat("2.1");
		/* double d = Double.parseDouble(null); NullPointerException */
		
		List<Float> f1 = new ArrayList<>();
		f1.add(2.1f);//float autoboxed to Float 
		/* f1.add(null);//when autoboxing on null is performed to convert to Float , NullPointer Exception is received */
	}

}
