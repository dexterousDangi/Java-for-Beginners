/* ListIterator: now we want to read the data in backward direction
---------------  or want to perform a operation on the data, we use this iterator.
		 to get the ListIterator interface object use the listIterator() method.
next(): while using this method control has to be in the starting of list , if the control is in the end of list , 
	then nothing will be printed in the output.

previous(): while using this method control has to be in the last position other wise no output will be printed.

*/

import java.util.ArrayList;
import java.util.ListIterator;
class ListIterator_in_Arraylist		
{
public static void main(String []args)
{
ArrayList<String> al= new ArrayList<String>();
al.add("pinku");
al.add("joe");
al.add("om");
al.add("hari");
  
	// al.listIterator(); will return the object and store it into the ListIterator reference variabel or handle

	// normal version of cursor
 
ListIterator li = al.listIterator();

while(li.hasNext())   	//to print the data repeatditly use while loop
{
String str=(String)li.next();   // here next method is used to read every kind of object, so it will return the data in object format, need to perform typecasting.
System.out.println(str);
}


	// Generic versio of cursor

ListIterator<String> li1 = al.listIterator();
while(li1.hasNext())
{
String str1 = li1.next(); // using string type generic version of cursor, will only read single type of data , no need to perform type casting.
System.out.println(str1);
}

while(li1.hasPrevious())  
{
String str2= li1.previous();  // before using this method please check whether the control is at the end of the list.
System.out.println(str2);
}

}}

/*
F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac ListIterator_in_Arraylist.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java ListIterator_in_Arraylist

pinku
joe
om
hari

pinku
joe
om
hari

hari
om
joe
pinku
*/ 
  