// checking which class contains which interface either serializable or cloneable .

import java.util.*;
import java.io.*;
class Details_about_interface_in_collection_and_map
{
public static void main(String []args)
{
TreeMap t = new TreeMap();
System.out.println(t instanceof Serializable);
System.out.println(t instanceof Cloneable);

ArrayList a = new ArrayList();
System.out.println(a instanceof Serializable);
System.out.println(a instanceof Cloneable);

HashSet h= new HashSet();
System.out.println(h instanceof Serializable);
System.out.println(h instanceof Cloneable);

LinkedList l = new LinkedList();
System.out.println(l instanceof Serializable);
System.out.println(l instanceof Cloneable);

}
}

/*output:
F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Details_about_interface_in_collection_and_map.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Details_about_interface_in_collection_and_map

true
true
true
true
true
true
true
true

*/