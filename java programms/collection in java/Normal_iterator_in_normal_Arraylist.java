/* using normal Iterator Cursor in normal ArrayList
	when we use normal Iterator Cursor: while reading data using next() method. it always return data in 
	object format , and to print the data in meaningful order have to use type casting always
*/

import java.util.ArrayList;
import java.util.Iterator;
class Normal_iterator_in_normal_Arraylist		
{
public static void main(String []args)
{
ArrayList al= new ArrayList();
al.add("pinku");
al.add("joe");
al.add("om");
al.add("hari");

	//to create the iterator cursor object use the iterator() method

	// al.iterator();  it will return the iterator object , store that object into another Iterator object.

Iterator itr = al.iterator();

	// now to print the data use while loop



while (itr.hasNext())  // hasNext() return type is boolean
{
	// to read the data use next() method, whose return type is object 

	//itr.next();  // need to perfrom type cast 

Object o = itr.next();
String str = (String)o;
System.out.println(str);
}
}
}

/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Normal_iterator_in_normal_Arraylist.java

Note: Normal_iterator_in_normal_Arraylist.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Normal_iterator_in_normal_Arraylist

pinku
joe
om
hari

*/