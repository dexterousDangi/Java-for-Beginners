/* three approaches to print
---------------------------- the data or say to retrieve the data form ArrayList collections
 	these approaches vary when we use normal version of array list and vary when we use  
	Generic version of arraylist collection
Following are the three approaches:

1) using for_each loop: 
-----------------------  when we use for each loop for normal version we have to use instanceof operator every time,
			 and have to use type casting operations because as we know normal version of arraylist contains
			 herterogenous data we can't say they are type safe so to take care of type safety we have to use the
			 instance of operator and use type casting, but in the case of generic version of arraylist we can
			 directly print the data using for each loop because we know genric class are type safe.

			 
2) using get(INDEX_VALUE) method of OBJECT class :
-------------------------------------------------- when we use get() method for normal arraylist , as we know they are not type safe
			 so in that case have to use type casting ,but for genric arraylist we can directly print without perfoming 
			 type casting.
                                        get() method will return oject class object for normal version of arraylist , so perform typecasting
					and for generic arraylist as they type safe so we can directly store the object returned by  get() method
					into the corresponding class oject and directly use it into s.o.p statement.
3) by using Cursors:
--------------------  explained in next example .
*/


import java.util.ArrayList;

class Different_way_to_retrieve_data_from_ArrayList 
{
public static void main(String [] args)
{
 	    // normal version of arraylist:

System.out.println("normal version of arraylist");

ArrayList a1 = new ArrayList();
a1.add(new Student (3, "mast"));
a1.add(new Emp(9,"leo"));
a1.add(new Emp(10, "karim"));

ArrayList a2 = new ArrayList(a1);  // collection added into another collection without using addAll() method.
a2.add(new Emp(23, "joe"));
System.out.println("size of normal arraylist   "+a2.size());
       
// first approach

for(Object o: a2)         // have to store all the object into Object class object because this arraylist is not typesafe
{
if (o instanceof Emp)    // have to use instanceof opertor because this arraylist is not type safe.
{
Emp e= (Emp)o;                    //have to perform type casting becasue this arraylist is not type safe.
System.out.println(e.eid+"----"+e.ename);
}
if (o instanceof Student)
{
Student s2=(Student)o;
System.out.println(s2.sid+"..."+s2.sname);
}
}
	//second approach

Object o1= a1.get(1);  // get method will retrun the object class object becaue it know it is not typesafe (this arraylist)
Emp ee = (Emp)o1;       // have to perform type casting  becasue this arraylist is not type safe.
System.out.println(ee.eid+"..."+ee.ename);

Emp eee = (Emp)a2.get(2); 
System.out.println(eee.eid+"..."+eee.ename);


		// generic version of ArrayList:

System.out.println("Generic version of arraylist");

ArrayList<Emp> al= new ArrayList<Emp> ();  // we can also add the element of the normal array list into genric arraylist, but both has to be containing same class objects.
al.add(new Emp(243,"deep"));
al.add(new Emp(23,"sma"));
System.out.println("size of generic arraylist   "+al.size());

    // first approach 

for(Emp e2 : al)   // directly can store the collection into emp class because this generic arraylist is type safe
{
System.out.println(e2.eid+"...."+e2.ename);
}
     //second approach    

System.out.println(al.get(1).eid+"   "+al.get(1).ename);   // directly using get() method
  
//or

Emp e3 = al.get(0);
System.out.println(e3.eid+"..."+e3.ename);

}
}


/*output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Different_way_to_retrieve_data_from_ArrayList

normal version of arraylist
size of normal arraylist   3
9----leo
10----karim
23----joe
9...leo
23...joe

Generic version of arraylist
size of generic arraylist   2
243....deep
23....sma
23   sma
243...deep
*/



  