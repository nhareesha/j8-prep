package com.notes.ocaprep.chap3javaAPIs;

public class Equality {

	public static void main(String[] args) {
		
		// == checks if references are pointing to same object on heap
		
		// equals() checks if contents are equal, not the references
		
		//If a class does not override equals() methods , then using equals() is same as == means reference comparison
		
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		
		StringBuilder three = one.append(false);//here after append it returns the current SB , that is one
		
		System.out.println(one == two); // false , because they are diff references
		
		System.out.println(one == three); //true , because they are pointing to same references;
		
		//Strings are immutable and they are pooled 
		String x = "Hello";
		String y = "Hello";
		
		System.out.println(x == y); // true
		
		String z = " Hello".trim();
		System.out.println(x == z); // false , as z is computed at runtime where as x is at compile time
		
		//String class overrides equals() method , it just checks to see if contents are equal
		System.out.println(x.equals(z)); //true 
		
		//StringBuilder class didn't override equals() method , so it checks ref equality ==
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Hello");
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello");
		
		System.out.println(sb1.equals(sb2)); // false , as StringBuilder didnt override equals and it is same as == check
	
		Equality eq1 = new Equality();
		Equality eq2 = new Equality();
		
		System.out.println(eq1 == eq2); //false , as they are diff ref
		System.out.println(eq1.equals(eq2)); // false , as Equality class has not overridden equals() method, it is == 
		
	}

}
