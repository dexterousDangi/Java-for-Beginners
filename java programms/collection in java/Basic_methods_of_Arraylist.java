// some basic operation and method we use in arraylist

// add() method : to add elements to arraylist
// size() method: to know the size of the arraylist
// remove(int)
// remove(element): use remove the array elements using index values as well as directly by providing elements
// contains() method: used to know that arraylist contains following elements or not , return type is boolean
// isEmpty() method: used to know whether the list is empty or not
// clear() method: to delete all the elements in the arraylist.


import java.util.ArrayList;
class Basic_methods_of_Arraylist 
{
public static void main(String []args)
{
ArrayList al = new ArrayList();
al.add(7);
al.add("dangi");
al.add("sam");
al.add("ram");

System.out.println(al);

System.out.println(al.size());

al.add(1,"pardeep");

System.out.println(al.size());

al.remove(0);
System.out.println(al);

al.remove("pardeep");

System.out.println(al);

System.out.println(al.contains("sam"));

System.out.println(al.isEmpty());

al.clear();

System.out.println(al);
System.out.println(al.size());
System.out.println(al.isEmpty());

}
}

/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Basic_methods_of_Arraylist.java

Note: Basic_methods_of_Arraylist.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

		// these warning are telling that arraylist is not type safe.


F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Basic_methods_of_Arraylist

[7, dangi, sam, ram]
4	// array size
5  	// array size
[pardeep, dangi, sam, ram]
[dangi, sam, ram]  
true	// contains sam
false	//not empty
[]     // empty al is printed
0	// arraylist size	
true	// yes, arraylist is empty

*/

















