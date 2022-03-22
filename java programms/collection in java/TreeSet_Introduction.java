/*      Introduction to TreeSet: introduced in java 1.2
				 used to store only homogenous data and all the other classes of set interface are
				used to heterogenous data. internally treeset is implementing Navigable set interface a
				and navigable interface is extends Sorted set interface.
				so indirectely TreeSet is implementing sorted set interface, that is the reason
				what ever data we store in the TreeSet class is stored in some sorted order.

*Internally TreeSet class uses compareTo() method to print the data in ascending order.

*TreeSet class contains four constructor:   public java.util.TreeSet();
 					   public java.util.TreeSet(java.util.Comparator<? super E>);
 					   public java.util.TreeSet(java.util.Collection<? extends E>);
 					   public java.util.TreeSet(java.util.SortedSet<E>);
     

*/
                                
// case 1 : when we adding data , data will be printed in some sorted order always


import java.util.*;
class TreeSet_Introduction
{ 
public static void main(String []args)
{
TreeSet<String> t = new TreeSet<String>();
t.add("sam");
t.add("aman");
t.add("samarth");
t.add("leo");
t.add("adam");
	
System.out.println("elements inside treeset  "+t);   //WILL print like data [adam, aman, leo, sam, samarth]

TreeSet<Integer> tt= new TreeSet<Integer>();           
tt.add(32);
tt.add(2);
tt.add(3);

System.out.println(tt);  //[2, 3, 32] 

				// each treeset must contain only homogenous data .
 
}
}


/*output: ALREADY IN SORTED ORDER BECAUSE OF SORTEDSET INTERFACE


F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeSet_Introduction.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeSet_Introduction

elements inside treeset  [adam, aman, leo, sam, samarth]
[2, 3, 32] 
*/

//case 2: when we add the heterogenous data into the treeset: CLASS CAST EXCEPTION
/*
import java.util.*;
class TreeSet_Introduction
{ 
public static void main(String []args)
{
TreeSet t = new TreeSet();
t.add("sam");
t.add("aman");
t.add("samarth");
t.add("leo");
t.add("adam");
t.add(90);

System.out.println("elements inside treeset  "+t); 
}
}
*/
/*output: it will not able to compare the string data with the integer data and 
		complier will throw an exception saying class cast exception.
                                                        ---------------------
F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeSet_Introduction.java

Note: TreeSet_Introduction.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeSet_Introduction

Exception in thread "main" java.lang.ClassCastException: class java.lang.Stringcannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
                             ----------------------------

        at java.base/java.lang.Integer.compareTo(Integer.java:71)
        at java.base/java.util.TreeMap.put(TreeMap.java:814)
        at java.base/java.util.TreeMap.put(TreeMap.java:534)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at TreeSet_Introduction.main(TreeSet_Introduction.java:71)


*/


