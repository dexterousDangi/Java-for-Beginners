// sorting of user defined data that is of objects.

/*
Java Comparable interface is used to order the objects 
of the user-defined class. This interface is found in
java. lang package and contains only one method named 
compareTo(Object). It provides a single sorting sequence
only, i.e., you can sort the elements on the basis of
single data member only.
*/

// comparable interface contains only one method, we must override it otherwise error will be generated
// because if a class contains any abstract method we must declare it abstract or override the interface method

//Collections.sort() method is internally using comparTo() method. and in compareTo() method we have overriden the logic , and sorting is done on the basis of ename.

//sorting based on "ename"


import java.util.*;

class Employee implements Comparable   
{
int eid;
String ename;
Employee(int eid, String ename)
{
this.eid=eid;
this.ename=ename;
}
public int compareTo(Object o)     
{
Employee e= (Employee)o;
return ename.compareTo(e.ename);   // return integer values
}
}


class Sorting_on_String_data_of_user_defined_class_members
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
output: on the basis of string data

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Sorting_on_String_data_of_user_defined_class_members.java
Note: Sorting_on_String_data_of_user_defined_class_members.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Sorting_on_String_data_of_user_defined_class_members

42---aman
213---hori
112---ram
342---raman

*/




































