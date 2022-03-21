// Copying one hashset data into another hashset
// there are two approach we have here.
// first by using addAll() method 
// second by using hashset class constructor.


import java.util.HashSet;
import java.util.Iterator;
class One_hashset_data_into_another_hashset
{
public static void main(String [] args)
{
HashSet h1= new HashSet();
h1.add("dangi");
h1.add("neo"); 

HashSet h2= new HashSet();   
h2.add("pradeep");
h2.add("nippu");
h2.addAll(h1);               //using addAll() method approach to add data of h1 to h2

HashSet h3= new HashSet(h2);   // using constructor approach to add data of h2 to h3
h3.add("alpha");
h3.add("piniya");
h3.add("moto");

Iterator itr = h3.iterator();
 while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}

/*output: HASHSET DOES'NT PRESERVE INSERTION ORDER AT ALL.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java One_hashset_data_into_another_hashset

pradeep
nippu
piniya
alpha
neo
dangi
moto
*/
