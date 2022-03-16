//Application : how to add one collection object data to another collection data.

//addAll() method: used to add all the objects of a collection into anothrer collection
// add() method: to add the object into the collection

// containsAll() method: used to check whether the collection contains all the object of the other collection .return type of this method is boolean type.
// contains() method: used to check  whether a collection contains particular ojbect or not. return type of this method is boolean type.



import java.util.ArrayList;

class Copying_data_from_one_collection_to_another
{
public static void main(String []args)
{

Emp e1 = new Emp(32, "pardeep");
Emp e2 = new Emp(43, "dangi");
Emp e3 = new Emp(53, "ram");
Emp e4 = new Emp(87, "dani");

ArrayList<Emp> a1 = new ArrayList<Emp>();
a1.add(e1);
a1.add(e2);

ArrayList<Emp>a2 = new ArrayList<Emp>();
a2.addAll(a1);
a2.add(e3);
a2.add(e4);
 
System.out.println(a2.containsAll(a1));
System.out.println(a2.contains(e1));

System.out.println("data present in the collection second:");

for(Emp ee: a2)
{
System.out.println(ee.eid+"  " + ee.ename);
}

System.out.println("elements present in collection first:");

for(Emp eee: a1)
{
System.out.println(eee.eid + "   "+ eee.ename);
}

a2.remove(e1);

System.out.println(a2.containsAll(a1));
System.out.println(a2.contains(e1));

System.out.println("after removal data present in second collection");

for(Emp ee: a2)
{
System.out.println(ee.eid+"  " + ee.ename);
}

}
}

/*output:


F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Copying_data_from_one_collection_to_another.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Copying_data_from_one_collection_to_another


true  ---> containsAll()
true  ---> contains()

data present in the collection second:
32  pardeep  --->addAll()
43  dangi    --->add() 
53  ram
87  dani

elements present in collection first:
32   pardeep
43   dangi
false   --->containsAll()
false   --->contains() 

after removal data present in second collection
43  dangi
53  ram
87  dani

*/