// Question: creat a treeset and add string class data as well as stringbuffer class data.
//  and check whether treeset perform sorting or not.

//Answer: no, code is complied fine but at runtime it throws an exception saying class cast exception.
// 	but it can preform shorting if both class data is same use comparator interface for that.

//Exception in thread "main" java.lang.ClassCastException: class java.lang.String
//cannot be cast to class java.lang.StringBuffer (java.lang.String and java.lang.S
//tringBuffer are in module java.base of loader 'bootstrap')

// overcome this problem by using Comparator interface(which we can say a way of customized sorting)

import java.util.*;
class Ratan_Question2
{
public static void main(String []args)
{

TreeSet t = new TreeSet(new MyComp());
t.add("fun");
t.add("football");
t.add(new StringBuffer("mohit"));
t.add(new StringBuffer("dangi"));
t.add(new StringBuffer("alele"));

System.out.println(t);
}
}



  // using comparator interface to sort the different data  

class MyComp implements Comparator   // we can't use a generic version of comparator here becasue we are using two class data for sorting
{
public int compare(Object o1, Object o2)
{
String s1= o1.toString(); // for stringbuffer directly sorting is not possible so we must convert Object class object into string by using toString() method.
String s2= o2.toString();   // here don't use type casting use " toString "method

return (s1.compareTo(s2));
}
}


/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Ratan_Question2.java

Note: Ratan_Question2.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Ratan_Question2

[alele, dangi, football, fun, mohit]

*/