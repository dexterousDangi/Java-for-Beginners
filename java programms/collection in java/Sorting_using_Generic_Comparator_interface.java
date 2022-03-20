// generic version of comparator interface
// we use generic version to avoid warning messages as well as to avoid type casting.
//                     ------------------------------             ------------------



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
class SidComp implements Comparator<Student>           // sorting logic for Integer type data
{ 
public int compare (Student s1, Student s2)
{          
      // no type casting needed  

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
class SnameComp implements Comparator<Student>          //sorting logic for String type of data
{ 
public int compare (Student s1, Student s2)
{
      // no type casting need

return (s1.sname).compareTo(s2.sname);
}
}


class Sorting_using_Generic_Comparator_interface
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

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Sorting_using_Generic_Comparator_interface.java


F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Sorting_using_Generic_Comparator_interface

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