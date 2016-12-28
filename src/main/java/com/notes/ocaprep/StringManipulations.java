package com.notes.ocaprep;

public class StringManipulations {

	public static void main(String[] args) {
		//string concat with any other object results in string
		String s1 = "";
		s1=s1+false;
		s1+='c';
		s1+=2;
		System.out.println(s1);//falsec2
		
		//String is immutable , any operation on String results in new string
		//new string should be captured, otherwise it is ignored
		
		s1.concat("hello");  //here result is ignored as it is not stored , so s1 remains unchanged
		
		//String created with string literal has string pool memory location
		//String created with new operator has diff address location
		//when compared with == results in false, as it is comparison on references
		
		String s3 = "Hello";
		String s2 = new String("Hello");
		if(s2==s3)
			System.out.println("objects s2 and s3 are equal");
		else
			System.out.println("objects s2 and s3 are not equal");
		
		
		//String created with string manipulations have different address than the string literal address,
		//although they have same content
		
		String s4 = "Hello";
		String s5 = "Hel";
		s5+="lo";
		System.out.println((s4==s5?"s4 and s5 are equal":"s4 and s5 are not equal"));
		
		//String class has method length() to get the length of string
		//String objects they can be garbage collected
		
		System.out.println(2+3+"hi"+4+5+6);//5hi456
		
		//String s6 = 3; int,bolean, float, double,char  cannot be stored in string
		//String s6 = 'c';
		//String s6 =false;
		//String s6 = 2.1f;
		
		
		
	}

}
