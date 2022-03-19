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

//Collections.sort() method is internally using comparTo() method. and in compareTo() method we have overriden the logic , and sorting is done on the basis of eid.

//sorting based on "eid"


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
if (eid ==e.eid)
{return 0;}
else if(eid == e.eid)
{return 1;}
else{return -1;}
}
}



class Sorting_of_user_defined_class_members
{
public static void main(String [] args)
{
ArrayList<Employee> al = new ArrayList<Employee> ();

al.add(new Employee(342, "raman"));
al.add(new Employee(213, "hori"));
al.add(new Employee(112, "ram"));
al.add(new Employee(42, "aman"));

Collections.sort(al);         // if we directly print the al, hashvalue of the corresponding employee ojbects will be printed because al contains Employee objects.

for(Employee e: al)   // directly using because of generic collections
{
System.out.println(e.eid+"..."+e.ename);
}

}
}


/*output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Sorting_of_user_defined_class_members.java

Note: Sorting_of_user_defined_class_members.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Sorting_of_user_defined_class_members

42...aman
112...ram
213...hori
342...raman

*/









