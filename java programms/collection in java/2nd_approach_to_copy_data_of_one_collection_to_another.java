/* 2nd_approach_to_copy_data_of_one_collection_to_another: in the first approach we had used 'a2.addAll(a1)' code
but in second approach we use the ArrayList constructor for that , we have to just pass the a1 collection as 
an argument in the second ArrayList collections constructor 

Syntax: ArrayList<Emp> a2 = new ArrayList<Emp> (a1);
                                            -----------
*/


import java.util.ArrayList;

class Second_approach_to_copy_data_of_one_collection_to_another
{
public static void main(String []args)
{
ArrayList<Emp> a1 = new ArrayList<Emp>();
a1.add(new Emp(32, "pardeep"));
a1.add(new Emp(43, "dangi"));

ArrayList<Emp>a2 = new ArrayList<Emp>(a1); // here just pass the arraylist object in the constructor
a2.add(new Emp(53, "ram"));
a2.add(new Emp(87, "dani"));

for(Emp ee : a2)
{
System.out.println(ee.eid+"...."+ee.ename);
}
}
}

/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac 2nd_approach_to_copy_data_of_one_collection_to_another.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Second_approach_to_copy_data_of_one_collection_to_another

32....pardeep
43....dangi
53....ram
87....dani

*/