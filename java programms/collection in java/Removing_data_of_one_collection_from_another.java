// removeAll() method: using this method we are able to remove data of one collection form the another.
// a2.removeAll(a1): remove all the elements of a1 collection form a2 collection.

// retainAll() method: it is also used to remove the elements form collection but in different way.
// a2.retainAll(a1): this line means , it will remove all the elements of a2 but retains the elements which were added by a1 colleciton.



import java.util.ArrayList;

class Removing_data_of_one_collection_from_another
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

System.out.println("data in Ist collection");

for (Emp ee: a2)
{
System.out.println(ee.eid+"..."+ee.ename);
}

//a2.removeAll(a1);

a2.retainAll(a1);

System.out.println("data in second Collection after operations");


for (Emp eee: a2)
{
System.out.println(eee.eid+"..."+eee.ename);
}
}
}



/*
output: when we use "a2.removeAll(a1)" CODE

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Removing_data_of_one_collection_from_another.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Removing_data_of_one_collection_from_another

data in Ist collection
32...pardeep
43...dangi
53...ram
87...dani

data in second Collection after removal operation
53...ram
87...dani
*/

/*
 OUTPUT: when we use "a2.retainAll(a1)"

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Removing_data_of_one_collection_from_another.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Removing_data_of_one_collection_from_another

data in Ist collection
32...pardeep
43...dangi
53...ram
87...dani

data in second Collection after operations
32...pardeep
43...dangi

*/
