package com.notes.ocaprep.chap1JavaBuildingBlocks;

/**
 * @author Hareesha
 * Jan 26, 2017 2017
 */
public class GarbageCollection {

	/**
	Garbage Collection
	
	1. Garbage Collection refers to process of automatically freeing memory on the heap by 
		deleting objects that are no longer reachable or being referenced in program.
		
	2. There are many different algorithms for garbage collection.
	
	3. System.gc() is not guaranteed to run.Need to recognize when objects become eligible for
		garbage collection.
		
	Objects Eligibility for Garbage Collection:
	
		1. The object no longer has nay references pointing to it.
	
		2. All references to the object have gone out of scope
	
	Notes:
		1. A reference is a variable that has a name and can be used to access the contents of 
		 an object.
		
		2. All references are same size , no matter what their type is.
		
		3. An object sits on the heap and does not have a name.
		
		4. You have no way to access an object except through a reference.
		
		5. Objects come in all different shapes and sizes and consumes varying amounts of memory.
		
		6.  A object cannot be assined to another object, nor an object be passed to a method or returned 
			from a method.
			
		7. It is object that gets garbage collected , not it reference.
		
		8. Objects only gets garbage collected, not the references.
		
	finalize()
	
		1. Finalize() method is called if the garbage collector tries to collect the object.
		
		2. If the garbage collector doesn't run, the method doesn't get called.
		
		3. If garbage collector fails to collect the object and tries to run again , this finalize()
			method is not called again.
		
		4. finalize() method is not definitely called twice on a object.
		
		5. finalize() method is not gauranteed to run. System.gc()is also not gaurenteed to run.
	
	 */
	public static void main(String[] args) {
		
		String one,two;
		
		one = new String("one");//new object is created here
		
		two = new String("two");//another new object is created here
		
		one = two; //one object get garbage collected
		
		String three = one;
		
		one = null;
	}//here all the references get out of scope, So all the other objects get garbage collected
}
