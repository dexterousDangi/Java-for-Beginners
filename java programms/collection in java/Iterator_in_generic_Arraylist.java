// if we you Generic ArrayList, then too we have to use type casting while retrieving data using "next()" method of iterator cursor.
// here we are using Generics arraylist but have to use typecasting, how to avoid it , by using Generic Iterator cursor

import java.util.ArrayList;
import java.util.Iterator;
class Iterator_in_generic_Arraylist		
{
public static void main(String []args)
{
ArrayList<String> al= new ArrayList<String>();
al.add("pinku");
al.add("joe");
al.add("om");
al.add("hari");

Iterator itr =al.iterator();

while(itr.hasNext())
{
String str = (String)itr.next(); // HAVE TO PERFORM TYPE CASTING HERE BECAUSE NEXT() METHOD ONLY RETURN OJBECT CLASS object.

System.out.println(str);
}
}

/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Iterator_in_generic_Arraylist.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>JAVA Iterator_in_generic_Arraylist

pinku
joe
om
hari
*/
}