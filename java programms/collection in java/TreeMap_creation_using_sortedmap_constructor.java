// treemap using sortedMap constructor to create a new treemap

//subMap(k1,k2); method return type is sortedmap , will print the data between key1,key2
//             will include the key1 object and exclude the key2 ojbects

//tailMap(k1); will include the key1 object and print the elements after key1

// headMap(k1); will exclude the key1 object and print the data before the given key.

// using public java.util.TreeMap(sortedmap object) constructor 


import java.util.*;
class TreeMap_creation_using_sortedmap_constructor
{
public static void main(String []args)
{
TreeMap<Integer,String> t1 = new TreeMap<Integer,String> ();
t1.put(1,"neo");
t1.put(7,"leo");
t1.put(4,"geo");
t1.put(9,"deo");
t1.put(6,"rio");
t1.put(5,"jio");
t1.put(3,"meo");

System.out.println(t1);

SortedMap<Integer,String> sm1 = t1.subMap(3,9);
                               /****************/
TreeMap<Integer,String> t2= new TreeMap<Integer,String> (sm1); 
                                        /******/
System.out.println(t2);

SortedMap<Integer,String> sm2= t1.tailMap(5);
                               /*****************/ 
TreeMap<Integer,String> t3 = new TreeMap<Integer,String> (sm2);
                                     /******************/
System.out.println(t3);

SortedMap<Integer,String> sm3= t1.headMap(5);
                              /*******************/
TreeMap<Integer,String> t4= new TreeMap<Integer,String>(sm3);
				  /***********/ 
System.out.println(t4);

}
}
/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeMap_creation_using_sortedmap_constructor.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeMap_creation_using_sortedmap_constructor

{1=neo, 3=meo, 4=geo, 5=jio, 6=rio, 7=leo, 9=deo}

{3=meo, 4=geo, 5=jio, 6=rio, 7=leo} ---> subMap(3,9)  exculding 9

{5=jio, 6=rio, 7=leo, 9=deo}    ----> tailMap(5)     including 5

{1=neo, 3=meo, 4=geo}    ----> headMap(5)          excluding 5

*/
