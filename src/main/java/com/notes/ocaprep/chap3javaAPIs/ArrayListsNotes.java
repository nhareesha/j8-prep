package com.notes.ocaprep.chap3javaAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsNotes {

	public static void main(String[] args) {
		
		//boolean add(E element) ; void add(int index, E element);
		
		//ArrayList implements toString() , we can see the contents just by printing it
		
		//When type<E> of list is NOT specified then it is considered to store Object type(except primitives)
		ArrayList l1 = new ArrayList();//any thing can be stored as there is no type specification
		l1.add("Hello");
		l1.add(2);//here they are autoboxed to wrapper Integer
		l1.add(true);
		
		ArrayList<String> l2 = new ArrayList<>();//>1.7
		l2.add("Hello");
		//l2.add(true);//DO NOT COMPILE !! , as list is of String type
		
		
		List<String> l3 = new ArrayList<>();
		//l3.add(2,"Hello"); //throws exception , as arrayList is Indexed , elements need to be sequential
		
		l3.add("Hi");
		l3.add(0,"Hello");
		l3.add(1,"hi1");
		l3.add(2,"hi2");
		l3.add(3,"hi1");
		l3.add(4,"hi4");
		System.out.println(l3.size()); //2 , elements gets moved accordingly
		
		//boolean remove(Object ele); E remove(int index);
		//removes first matched value in the ArrayList or element at specified index
		
		System.out.println(l3.remove(0));// returns Hi	
		System.out.println(l3.remove("hi1"));//returns true , it removes first one matched
		
		//set() method of ArrayList is more of replace
		
		System.out.println(l3);
		System.out.println(l3.set(3, "replaced"));
		
		//isEmpty() returns true/false, size()
		
		//clear() discards all the elements of the ArrayList()
		
		//contains() returns true/false
		
		l3.contains("H1"); //false
		//equals() method got overridden in ArrayList and it checks if same elements are present in same order
		
		List<String> one = new ArrayList<String>();
		List<String> two = new ArrayList<>();
		
		System.out.println(one == two);//false
		
		System.out.println(one.equals(two));//true ,its empty list , and ArrayList overridden equals() to check contents
		
		
		/*** conversion between Arrays and Lists ***/
		
		String[] s1 = new String[]{"Hello","Hi","how are u"};
		
		//Arrays.asList() is used to convert an array to ArrayList.asList is a static method
		//it returns List interface
		
		//ArrayList<String> a1 = (ArrayList<String>) Arrays.asList(s1);
		
		List<String> a1 = Arrays.asList(s1);
		
		//Created ArrayList and array are linked.And arrayList is fixed.If any operation are
		//performed to change the size of arrayList that is created from array returns in Exception
		
		//set() made on arrayList and any operations on array are linked.
		
		a1.set(0, "Welcome");//replaces 1st element of arrayList
		
		
		
		
		
		//s1.asList();//ILLEGAL!! There is no method as asList in arrays .
		
		ArrayList<String> l4 = new ArrayList<String>();
		
		
		
	}

}
