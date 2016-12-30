package com.notes.ocaprep.chap4Encapsulation;

public class VarAargsNotes {

	public static void main(String[] args) {
		VarAargsNotes obj = new VarAargsNotes();
		
		//for vararg parameter we can pass an array or just values.
		obj.test(2,3,4,5);// here 2 is 1st parameter and {3,4,5} forms the second parameter array
		
		//we cannot pass null .It throws NullPointerException
		
		//obj.test(1,null);
		
		//for varargs any array can be passed .
		obj.test(1,new int[]{1,2,3});
		
	}
	
	//there cannot be two overloaded methods with same type of varargs and array
	
	//because internally compiles converts varrags into array and they are potentially the same
	
	/*
	public void test1(int... nums){}
	
	public void test1(int[] arr){}
	*/
	
	/* var args need to ve last in the argument list  */
	public void test2(String str , int... nums){}
	
	/* DO NOT COMPILE . Because a method cannot have more than one varargs parameter */
	
	//public void test3(int... nums1 , int... nums2){}
	
	public void test(int n , int... nums){
		System.out.println(nums.length);
	}

}
