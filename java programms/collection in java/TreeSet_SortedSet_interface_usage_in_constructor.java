// creating a treeset by passing sorted set type data inside the treeset class construtor.

// treeset class constructor used:   public java.util.TreeSet(java.util.SortedSet<E>)
// to creat the treeset.


/*public java.util.NavigableSet<E> subSet(E, boolean, E, boolean);
 public java.util.NavigableSet<E> headSet(E, boolean);
 public java.util.NavigableSet<E> tailSet(E, boolean);
 public java.util.SortedSet<E> subSet(E, E);
 public java.util.SortedSet<E> headSet(E);
 public java.util.SortedSet<E> tailSet(E);
*/
//tailset() print the provided element and the remaining element in the tree.
//headset() print the element above the given the element in the tree
//subset() print the element the between the given range and include the first element provided in the range.

// return type of these methods is sortedset type or navigableset type and to avoid
// creating a new object for the corresponding type use type casting directly.


import java.util.*;
class TreeSet_SortedSet_interface_usage_in_constructor
{
public static void main(String []args)
{
TreeSet t = new TreeSet();
t.add(12);
t.add(2);
t.add(1);
t.add(6);
t.add(3);
t.add(4);

System.out.println(t);

System.out.println(t.tailSet(6));
System.out.println(t.headSet(6));

SortedSet s = t.tailSet(6);   // method return type is sortedset type

TreeSet tt= new TreeSet(s);  // creating new treeset using sortedset data inside the constructor
System.out.println(tt);

tt=(TreeSet)t.headSet(4);   // type casting of sortedset object into treeset type.

System.out.println(tt);
}
}

/*output:
F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeSet_SortedSet_interface_usage_in_constructor.java

Note: TreeSet_SortedSet_interface_usage_in_constructor.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeSet_SortedSet_interface_usage_in_constructor

[1, 2, 3, 4, 6, 12]
[6, 12]
[1, 2, 3, 4]
[6, 12]
[1, 2, 3]
*/
