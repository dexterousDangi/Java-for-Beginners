// HashMap : did not maintain insertion order 
// default capacity of hashmap is 16.
// default fill ratio of hashmap is 0.75  (fill ratio means after filling 3/4 of hashmap , the capacity of haspmap will be automatically increased)
// fill ratio range is between 0.0 to 1.0

// to add the data form one hashmap to another hashmap use : putAll() method

// there are four constructor exists in HashMap class

//public java.util.HashMap(int, float);   // used to provide the user defined "capacity" and "fill ration"of the newly created hashmap

//public java.util.HashMap(int);  // used to provide the user defined capacity of the newly created hashmap

//public java.util.HashMap();  // used to create a general hashmap with default capacity of 16 and default fill ratio of 0.75

//public java.util.HashMap(java.util.Map<? extends K, ? extends V>); // used to creat a hashmap by passing the existing hashmap data into this constructor.



import java.util.*;
class One_HashMap_data_into_another_HashMap{
public static void main(String []args){
HashMap h1 = new HashMap();
h1.put(32, "nimo");
h1.put(33,"neo");
h1.put(23,"leso");
System.out.println(h1);

HashMap h2 = new HashMap();
h2.putAll(h1);
h2.put(2,"second");
System.out.println(h2);

HashMap h3 = new HashMap(h2);
h3.put(3,"third");
System.out.println(h3);


}
}

/*output:INSERTION ORDER IS NOT PRESERVED

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac One_HashMap_data_into_another_HashMap.java

Note: One_HashMap_data_into_another_HashMap.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java One_HashMap_data_into_another_HashMap

{32=nimo, 33=neo, 23=leso}
{32=nimo, 33=neo, 2=second, 23=leso}
{32=nimo, 33=neo, 2=second, 3=third, 23=leso}
*/