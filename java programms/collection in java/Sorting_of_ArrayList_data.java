//how to sort the data in collection : for that we use "sort()" method , present in the collections class 
// it is a static method.

// collection : is the root interface of collection framework 
// Collections: is the class present in Utility package, contains several method used to perform several operations

import java.util.Collections;
import java.util.ArrayList;

class Sorting_of_ArrayList_data
{
public static void main(String []args)
{
ArrayList<String> al = new ArrayList<String>();
al.add("hoa");
al.add("mohan");
al.add("mohan2");
al.add("Hoa");
System.out.println("data before shorting="+al);
Collections.sort(al);
System.out.println("data after shorting ="+al);
}
}
/* 
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac Sorting_of_ArrayList_data.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Sorting_of_ArrayList_data

data before shorting=[hoa, mohan, mohan2, Hoa]

data after shorting =[Hoa, hoa, mohan, mohan2]
*/