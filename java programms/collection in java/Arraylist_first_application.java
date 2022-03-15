/* list interface : contains four classes
ArrayList class
LinkedList class
Vector class
Stack class
*/ 

/* Arraylist class:   
                    Resizable-array implementation of the List interface. 
Implements all optional list operations, and permits all elements, including null. 
In addition to implementing the List interface, this class provides methods to 
manipulate the size of the array that is used internally to store the list. 

it internally implements list interface.

*/

import java.util.*;

class Arraylist_first_application
{
public static void main(String []args)
{

ArrayList al = new ArrayList(); 
				// if you want to use the arraylist first creat the object like arrays.
 
al.add(10);    		// in arraylist we can store the heterogenous data.
al.add(7.7);
al.add("dangi");
al.add('a');
al.add(10);    // duplicate objects are also allowed in the arraylist.

System.out.print(al); 
				// we can print all the ojects of arraylist just by printing object of arraylist "al".

}
}

/*output:


F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Arraylist_first_application.java

Note: Arraylist_first_application.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.                       // we will discuss these notes later in the period

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Arraylist_first_application

[10, 7.7, dangi, a, 10]

*/ 