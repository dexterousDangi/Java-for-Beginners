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


//LinkedHashSet:   
//-------     

import java.util.*;

class LinkedHashSet_Intro
{
public static void main(String[] args)
{
LinkedHashSet<String> h = new LinkedHashSet<String>();
 
h.add("A");
h.add("D");
h.add("F");
h.add("D");
h.add("V");
h.add(null);
h.add(null);
System.out.println(h.size());
Iterator<String> itr = h.iterator();

while( itr.hasNext())
{
//String i = itr.next();
System.out.println("  "+itr.next());
}
}
}

/*
output:NO DUPLICATE OBJECT IS ALLOWED
       AND INSERTION ORDER IS PRESERVED

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac LinkedHashSet_Intro.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java LinkedHashSet_Intro

5
  A
  D
  F
  V
  null
*/