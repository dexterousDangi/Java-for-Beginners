// Set Interface: introduced in java 1.2 , contains two child interfaces ( sorted set and NavigableSet Interface)
// set interface contains three implemeting classes: HashSet, LinkedHash Set, TreeSet class.
/* 

HashSet class: introduced in java 1.2
--------------

backed by hashtable data structure.

Does not allow duplicate oject(if we created two , then only considered as one occurence)
--------------------------------------

method present in the class are not synchronized.
insertion order is not preserved.
null insertion is allowed.
herterogenous data is allowed.

 and only support one cursor: Iterator.

*/
/*
LinkedHashSet class:
-------------------- most of the characteristics are same as hashset class
but it is introduced in java 1.4

and in this class insertion order of data is preserved.

and underlying data structrue is hashtable+linkedlist
null insertion is allowed.
herterogenous data is allowed.
null insertion is allowed.
herterogenous data is allowed.

 and only support one cursor: Iterator.(i.e., universal cursor.)

 */ 


//HashSet:   
//-------     

import java.util.*;

class HashSet_Intro
{
public static void main(String[] args)
{
HashSet<Integer> h = new HashSet<Integer> ();

h.add(12);
h.add(23);
h.add(35);
h.add(23);
h.add(12);

System.out.println(h.size());
Iterator<Integer> itr = h.iterator();

while( itr.hasNext())
{
//Integer i = itr.next();
System.out.println("  "+itr.next());
}
}
}

/*output: NOT DUPLICATE OJBECTS ARE ALLOWED
	  NO INSERTION ORDER IS PRESERVED.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac About_set_interface_and_HashSet_class.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java HashSet_Intro
3   
35
23
12

*/



























