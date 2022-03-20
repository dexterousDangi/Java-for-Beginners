// sorting using "comparator", it is also an interface like comparable, present in java.util package.
// but we prefer comparator over comparable because using comparable we were only 
// able to perform one type of sorting at a time and writing sorting logics with 
// business logics. but,
// by using comparator interface we can declare sort the data using more than one type of 
// data , and we are writing business logics in seperate class and sorting logics in different class 

// like comparable interface , comparator interface also be implemented by class whose data we are sorting .
// comparator interface contains two methods, and we must override those methods.


// comparator interface is also of two type: 1) Normal version and 2) Generic version of comparator interface.

import java.util.*;
class Student 
{
int sid;
String sname;
Student (int sid, String sname)
{
this.sid= sid;
this.sname= sname;
}
}
//----------------------------
class SidComp implements Comparator           // sorting logic for Integer type data
{ 
public int compare (Object o1, Object o2)
{
Student s1 = (Student)o1;
Student s2 = (Student)o2;

if(s1.sid == s2.sid)
{
return 0;
}
else if(s1.sid >s2.sid)
{
return 1;
}
else
{return -1;}
}
}
//--------------------------------------
class SnameComp implements Comparator         //sorting logic for String type of data
{ 
public int compare (Object o1, Object o2)
{
Student s1 = (Student)o1;
Student s2 = (Student)o2;

return (s1.sname).compareTo(s2.sname);
}
}


class Sorting_using_Comparator_interface
{
public static void main(String [] args)
{
ArrayList<Student> al = new ArrayList<Student> ();
al.add (new Student (23,"jorden"));
al.add (new Student (22,"kobe"));
al.add (new Student (19,"sheq"));
al.add (new Student (20,"den"));

System.out.println("sorting is done based on Integer Data:");

Collections.sort(al, new SidComp());   // provide the object of class where sorting logic were written.
					// here we are sorting data on the integer type .

for(Student s: al)
{
System.out.println(s.sid+"..."+s.sname);
}

System.out.println("sorting is done based on String data:");

Collections.sort(al, new SnameComp()); 

for(Student s: al)
{
System.out.println(s.sid+"..."+s.sname);
}
}
}


/* 
output:


F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Sorting_using_Comparator_interface.java

Note: Sorting_using_Comparator_interface.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Sorting_using_Comparator_interface

sorting is done based on Integer Data:
19...sheq
20...den
22...kobe
23...jorden

sorting is done based on String data:
20...den
23...jorden
22...kobe
19...sheq
*/