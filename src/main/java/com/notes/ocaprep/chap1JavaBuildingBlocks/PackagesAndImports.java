package com.notes.ocaprep.chap1JavaBuildingBlocks;

/**
import java.util.Date;
import java.sql.Date; // COMPILER ERROR!!
*/

/**
import java.util.*;
import java.sql.*; 

//There won't be COMPILER ERROR.But where same class is used it gives 
COMPILER ERROR saying cannot be resolved in code.
*/


 //import java.nio.*.*;
//COMPILER ERROR!! Only one wild card is allowed, and that is at the end
 
import java.nio.*;//NOT GOOD, it doesn't import subclasses


/**
 * @author Hareesha
 * Jan 25, 2017
 */
public class PackagesAndImports {

	/**
	 
	 1. Package names follow same rules as variables.
	 
	 2. * is the wild card that is used import all the matching classes of a package.
	 
	 3. Including all the classes of a packagewith * does not slow downt the program.
	 	Compiler figure out on what is needed.
	 	
	 4. Wildcard * import only classes of the package, not the sub packages.
	 
	 5. When a class is found in multiple packages, it gives COMPILER ERROR.
	 
	 6. If we import a class name explicitly, then it takes precedence over any wildcards present.
	 	Ex : import java.util.Date;
	 		 import java.sql.*;	
	 
	 7. If same classes are explicitly imported with full class name , then compiler throws an error.
	 	Ex : import java.util.Date;
	 		 import java.sql.Date;
	 		 
	 8. If we want to use class that has same name in different packages, we can pick one class to
	 	use in import and use other's fully qualified classs name.
	 		Ex : java.util.Date obj;
	 		
	 9. When code snippets starts from line number "1" we should NOT assume that import are imported,
	 	instead we should check all the required imports are there.
	 	
	 	Like wise when code snippets start from line number OTHER THAN 1, then we can be assured that
	 	imports are taken care of.
	 	
	 10. Only one wild card is allowed and that too must be at the end.
	 		Ex : java.nio.*.*; error
	 
	 11. Using wild card * we can only import classes, NOT methods, sub packages.
	 
	 */
	public static void main(String[] args) {
		//Date d = new Date();
	}

}
