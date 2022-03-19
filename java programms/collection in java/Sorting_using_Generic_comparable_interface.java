// using Generic comparable interface to avoid type casting and warning messages during complie time.


// there is disadvantages of using comparable interface: 1) we can only use one property to sort the data at one time.
 							 2) we have to writing our business logic and sorting logic in the same class. Readebility decreased.


// to overcome these disadvantages we are using a new interface "comparator interface".


import java.util.*;

class Employee implements Comparable<Employee>
                     //   ---------------------           using generic version of comparable interface   
{
int eid;
String ename;
Employee(int eid, String ename)
{
this.eid=eid;
this.ename=ename;
}
public int compareTo(Employee e)     // now we can directly pass the Employee object because of generic comparable interface     
{
  // Employee e= (Employee)o;    no type casting needed anymore.

return ename.compareTo(e.ename);   // use "return -ename.compareTo(e.ename);" to reverse the order of the string data

}                                          //   use negative (-) sign in the return statement to reverse the order of string data.       
}


class Sorting_using_Generic_comparable_interface
{
public static void main(String [] args)
{
ArrayList<Employee> al = new ArrayList<Employee> ();

al.add(new Employee(342, "raman"));
al.add(new Employee(213, "hori"));
al.add(new Employee(112, "ram"));
al.add(new Employee(42, "aman"));

Collections.sort(al);

for(Employee e: al)
{
System.out.println(e.eid+"---"+e.ename);
}
}
} 


/*
output: "no warning messages or typecasting needed"

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Sorting_using_Generic_comparable_interface.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Sorting_using_Generic_comparable_interface

42---aman
213---hori
112---ram
342---raman
*/

































