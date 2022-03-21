// it is possible to add data of one collection class into another collection classes 
// for this , you have to adopt the constructor approach to transfer the data form 
// one collection class to another collection class
 
// but stack is an exception in this case. we can't any collection class data into stacks.

// HashSet h = new HashSet ();
// LinkedHashSet k= new LinkedHashSet(h);

//transfering hashset data into linkedhashset data.


import java.util.Stack;
import java.util.Vector;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashSet;

import java.util.Iterator;
class One_collection_class_data_into_another_collection_class
{
public static void main(String [] args)
{

Stack st = new Stack();   // we can't one collection class data to stack class only
st.push("amit");

HashSet h1= new HashSet(st);
h1.add("dangi");
h1.add("neo"); 

LinkedHashSet h2= new LinkedHashSet(h1);   
h2.add("pradeep");
h2.add("nippu");

ArrayList al = new ArrayList(h2);
al.add ("hippo");
System.out.println(al.size());

LinkedList ll = new LinkedList(al);
ll.add ("ravi"); 



Vector vv = new Vector(ll);
vv.add("rama");
System.out.println(vv.size());

TreeSet ts = new TreeSet(vv);
ts.add("pure");

HashSet ha = new HashSet(ts);
ha.add("added all");
 
System.out.println(ha.size());

Iterator itr= ha.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
 
/* output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac One_collection_class_data_into_another_collection_class.java

Note: One_collection_class_data_into_another_collection_class.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java One_collection_class_data_into_another_collection_class

6
8
10
pradeep
hippo
nippu
rama
ravi
neo
amit
pure
added all
dangi

*/
