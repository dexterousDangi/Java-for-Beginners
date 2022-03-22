// TreeSet class : internally implementing sortedset interface , which internally uses compareTo() method.
//			to perform the sorting of treeset class data automatically.

// used to store only homogenous data only
// what happen if we enter the null value in side the treeset class

//case 3: when we added null value to the treeset data

import java.util.TreeSet;
class TreeSet_null_exception

{
public static void main(String []args)
{
TreeSet t= new TreeSet();
t.add("ravi");
t.add("ram");
t.add(null);
System.out.println(t);  // while performing alphabatical  sorting ,string is compared with null 
			// during comparison it will generate exception. NULL POINTER EXCEPTION

}
}    
/*output:


F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeSet_null_exception.java

Note: TreeSet_null_exception.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeSet_null_exception

Exception in thread "main" java.lang.NullPointerException
                                   ------------------------     
        at java.base/java.util.Objects.requireNonNull(Objects.java:208)
        at java.base/java.util.TreeMap.put(TreeMap.java:809)
        at java.base/java.util.TreeMap.put(TreeMap.java:534)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at TreeSet_null_exception.main(TreeSet_null_exception.java:18)
*/

//case 4: if we enter only null value to treeset class data it will except it because now it does'nt have to compare it with other data.


class TreeSet_accepting_null_value

{
public static void main(String []args)
{
TreeSet t= new TreeSet();
t.add(null);
System.out.println(t);
}
}