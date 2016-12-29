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
		//objs[0] = new StringBuilder(); // throws Exception at runtime because actually objs is pointing to String array
		
		//any array can be sorted using Arrays.sort()
		//symbols, numbers , uppercase , lowercase sort order
		String[] arr = {"hi","hello","Hi","$","1234","+"};
		
		Arrays.sort(arr);//sort is a static method
		for(String i : arr)
			System.out.println(i);
		
		//Arrays.binarySearch(sortedarr , number)
		//array can be searched only , if they are sorted before hand
		
		int[] numbers = {2,1,9,8};
		
		System.out.println(Arrays.binarySearch(numbers,8)); // unpredictable as array is not sorted yet
		
		Arrays.sort(numbers);
		
		System.out.println(Arrays.binarySearch(numbers,8)); // 2 - matched index
		System.out.println(Arrays.binarySearch(numbers,0));// -1 , negative of one less than the position where it can be inserted to preserve sort order
		System.out.println(Arrays.binarySearch(numbers,3));//-3
		
		/****MUTI DIMENSIONAL ARRAYS ****/
		
		
		int[][] vars1;//valid declaration
		int [][] vars2;//valid
		int vars3[][];//valid
		int[] vars4[];//valid
		
		//in multi dimensional arrays 1st dimension indicates number of elements
		
		String [][] rec = new String [3][2];//3 arrays each of 2 elements each
		
		String [][] rec2 = new String[][]{{"1","2","3"},{"1","2"},{"1","2"}};
		
		String[][] rec3 = new String[2][];//valid , 1st dimension is mandatory and others are optional
		
		rec3[0] = new String[3]; // size of each array in a separate statement
		rec[1] = new String[2];
		
		//cannot specify a array dimension after a empty dimension
		//String [][][] rec4 = new String[][][3];//invalid
		//String[] [][] rec5 = new String[3][][3];//invalid
		
		//length prperty of array gives the length of array
		
		System.out.println(rec3.length);
		
		int[] a = {2,3,4};
		int[] b = {2,3,4};
		
		System.out.println(a == b); //false , as diff references
		System.out.println( a.equals(b)); // false , because arrays do not override equals method
		
		String[] x = {"hi","Hello"};
		String[] y = {"hi","Hello"};
		System.out.println(x == y); //false
		System.out.println(x.equals(y)); // false , because arrays do not override equals method
		
	}

}
