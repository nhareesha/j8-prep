package com.notes.ocaprep.chap3javaAPIs;

public class StringBuilderNotes {

	public static void main(String[] args) {
		// StringBuilder is mutable
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		StringBuilder sb3 = new StringBuilder(10);//here capacity() is 10 , so StringBuilder reserves 10 slots
		
		//it has capacity() , which gives capacity that it can hold 
		System.out.println(sb3.capacity()); // 10
		sb2.length();
		//capacity and length can be changeable
		
		//append(String str) , hoe ever it can accept char , numbers(int,long,float,double),boolean, char[],Object
		//its return a reference to current StringBuilder , so it can be chained
		sb2.append('c').append(false).append("-").append(2.22);
		
		//insert() , insert at specified index and rest of characters move accordingly
		//return ref to current StringBuilder 
		
		//sb3.insert(3, "hell");exception is thrown as , the length of sb3 is zero
		//sb3.insert(-1, "h");//throws exception
		
		sb3.insert(0, "hi");
		
		//delete() and deleteCharAt() removes character and return reference to current StringBuilder
		
		sb2.delete(3,3);//here no characters are deleted
		System.out.println(sb2);
		
		//reverse() return StringBuilder
		
		sb2.reverse();
		
		//charAt() , indexOf() , substring() , length(), toString() same as String methods
		
		//if(sb2=="hello") //do not compile , StringBuilder and String are incompatible types
		
		
		//String cannot be assigned to a stringBuilder , DO NOT COMPILE!!
		//StringBuilder s4 = "rumble";
		
		
		//String and StringBuilder cannot be compared and cannot be assigned 
		
		
		
		
		
	}

}
