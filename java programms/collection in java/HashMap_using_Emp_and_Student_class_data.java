// using Emp class and Student class data inside the HashMap

// using getKey() methods to just get the key object
// using getvalue() method to get the value object

import java.util.*;
class HashMap_using_Emp_and_Student_class_data
{
public static void main(String []args)
{
HashMap h = new HashMap();
h.put(new Emp(111,"aman"), new Student(1,"dani"));
h.put(new Emp(222,"mohit"), new Student(2,"hulk"));
h.put(new Emp(333,"pinku"), new Student(3,"super"));
h.put(new Emp(444,"dangi"), new Student(4,"fast"));

Set s = h.entrySet();  // retrun type of entrySet() is set
			// and for set we can use curser

Iterator itr = s.iterator();

while (itr.hasNext())
{
Map.Entry m = (Map.Entry)itr.next(); // here itr.next() will return an object of Entry type and entry is a sub interface of map 
					// then use map.entry to type cast the object

  		// here m is holding key as well as value
 
Emp e =(Emp)m.getKey();                    //here key is holding only emp data
System.out.println(e.eid+"---"+e.ename);

Student ss = (Student)m.getValue();     // here value is holding student data
System.out.println(ss.sid+"---"+ss.sname);

}
}
}
/*output: HASHMAP DIDN'T MAINTAIN INSERTION ORDER

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac HashMap_using_Emp_and_Student_class_data.java

Note: HashMap_using_Emp_and_Student_class_data.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java HashMap_using_Emp_and_Student_class_data

333---pinku
3---super
444---dangi
4---fast
111---aman
1---dani
222---mohit
2---hulk
*/