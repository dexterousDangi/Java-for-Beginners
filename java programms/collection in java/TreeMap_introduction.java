// TreeMap: introduced in java 1.2, used to store only homogenous data 
// -------- implementing sortedmap interface 
// store all the data in sorting order, and sorting is done on the bases of "key" objects only
// not on the basis of value objects.
// treemap methods are non-synchronized in nature.
//treemap class contains four constructors.

import java.util.*;
class TreeMap_introduction
{
public static void main(String [] args)
{

TreeMap<String, Integer> t = new TreeMap<String, Integer>();
t.put("ratna", 12);
t.put("anny", 22);
t.put("durga", 43);
t.put("chunu", 23); 
	//here string data is used to perform sorting, and string class internally by default implementing
	// comparable interface, then no issues.

System.out.println(t);  

TreeMap<Integer, String> tm= new TreeMap<> ();   // integer is of wrapper class, which also by default implementing comparable interface

tm.put(120,"alpha");
tm.put(12,"beta");
tm.put(122,"delta");
tm.put(1,"sigma");
       
	// now sorting is done on the based of integers, because now they are acting as the key objects

System.out.println(tm);

}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeMap_introduction.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeMap_introduction

{anny=22, chunu=23, durga=43, ratna=12}

{1=sigma, 12=beta, 120=alpha, 122=delta}

*/