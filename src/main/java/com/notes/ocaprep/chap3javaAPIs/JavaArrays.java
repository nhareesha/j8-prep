package com.notes.ocaprep.chap3javaAPIs;

import java.util.Arrays;

public class JavaArrays {

	public static void main(String[] args) {
		
		int[] nums = new int[3];
		
		//int[] nums2 = new int[];DO NOT COMPILE , it needs dimension or initialization 
		
		//int n[] = new int[3]{1,2,3};// both dimension and initialization are not allowed
		
		int[] nums3 = new int[]{1,2,3}; //valid , because it has initialization
		int[] num4 = {1,2,34,4}; // valid , this is called anonymous array
		
		int[] numAnimals; //valid 
		int [] numAnimals2; //space is allowed
		
		int numAnimals3[];//valid
		int numAnimals4 [];//space is allowed
		
		int[] ids,types;  // 2 int arrays
		int id[], types1; // 1 array and 1 primitive
		
		
		//this is autoboxing , small can fit in bigger type
		String[] str = {"hello"}; //string array
		Object[] objs = str; //string array can fit in objects array
		
		//if small has to fit in big casting is needed
		String[] str1 = (String[])objs;
		
		//This works at compile time 
		objs[0] = new StringBuilder(); // throws Exception at runtime because actually objs is pointing to String array
		
		//any array can be sorted using Arrays.sort()
		
		String[] arr = {"hi","hello","Hi"};
		Arrays.sort(arr);//sort is a static method
		
		
		
	}

}
