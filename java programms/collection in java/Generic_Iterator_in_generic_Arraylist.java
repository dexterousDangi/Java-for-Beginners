/* using Generic type iterator: using this cursor we dont need to perform type casting but 
 				using this cursor we can only read single type of data only. while
				using normal version of iterator we can read any type of data but  
				need type casting for that.

there are always two type of crusor : normal version cursor--> which can read any type of ojbect
                                    : Generic version og cursor--> which can read  only single type of object only.

*/

import java.util.ArrayList;
import java.util.Iterator;
class Generic_Iterator_in_generic_Arraylist		
{
public static void main(String []args)
{
ArrayList<String> al= new ArrayList<String>();
al.add("pinku");
al.add("joe");
al.add("om");
al.add("hari");
 
                 // normal iterator: which can read any type of data object           
 
Iterator itr =al.iterator();

while(itr.hasNext())
{
String str = (String)itr.next();
System.out.println(str);
}

		// Generic version of iterator: which can read only a specific type of data only.	

Iterator<String> ite = al.iterator();
while(ite.hasNext())
{
        	// if we are using generic version of iterator it always return a single type of object 
		// and we directly store it without perfoming type casting
//itr.next();
String s= ite.next();
System.out.println(s);
}
}
}

/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Generic_Iterator_in_generic_Arraylist.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Generic_Iterator_in_generic_Arraylist

pinku
joe
om
hari

pinku
joe
om
hari
*/	