//storing object type data in array list, here we are using Emp class object and Student class object 
// to store the data and to retrive the data.

/*
import java.util.ArrayList;

class Object_type_data_inArrayList
{
public static void main(String [] args)
{
Emp e= new Emp (232, "dangi");
Student s = new Student (23,"alpha");
ArrayList al = new ArrayList();
al.add(e);
al.add(s);
al.add(10);  // internally autoboxing is done
al.add("ratna");
System.out.println(al);  //internally calling "toString()" method.
}
}
*/
/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Object_type_data_inArrayList

[Emp@7a81197d, Student@5ca881b5, 10, ratna]  

internally only wrapper class tostring() is over ridden to return the objects data
but the userdefined object will retrun the objects hashcode value.
 */

//how to over come this problem:


import java.util.ArrayList;

class Object_type_data_inArrayList
{
public static void main(String [] args)
{
Emp e= new Emp (232, "dangi");
Student s = new Student (23,"alpha");
ArrayList al = new ArrayList();
al.add(e);
al.add(s);
al.add(10);  // internally autoboxing is done
al.add("ratna");
System.out.println(al);  //internally calling "toString()" method.

 	// to print the data we are going to use foreach loop, instanceof operator, type casting technique and Object class object 
// Object class object can hold any any type of data
// and instanceof operator to check whether the object class object contains corresponding class object.

for (Object o:al)
{

if (o instanceof Emp)
{
Emp ee= (Emp)o;
System.out.print(ee.eid +"---"+ee.ename+", ");
}

if(o instanceof Student)
{
Student ss= (Student)o;
System.out.print(ss.sid+"---"+ss.sname+", ");
}
if(o instanceof Integer)
{
System.out.print(o+", ");
}

if(o instanceof String)
{
System.out.println(o);
}
}
}
}

/*output:
F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Object_type_data_inArrayList.java

Note: Object_type_data_inArrayList.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Object_type_data_inArrayList

[Emp@7a81197d, Student@5ca881b5, 10, ratna]

232---dangi, 23---alpha, 10, ratna

*/