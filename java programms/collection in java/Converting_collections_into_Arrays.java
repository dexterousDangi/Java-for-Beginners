// how to convert collections into arrays: for that we use collection interface methods

// toArray(t[]): toArray() method of array format which we use to convert generic collection into arrays, because these collection are type safe
//               and can be converted into specific array type directly.

// toArray(): this method return type is object[] array, which can store any type of object, this is used for normal collections, because they 
//            are not type safe and object array can hold any type of object in them.


import java.util.ArrayList;

class Converting_collections_into_Arrays
{
public static void main(String []args)
{
     //Generic collection ---> Arrays --->use toArray(T[]) method

ArrayList<String> a1= new ArrayList<String>();
a1.add("ram"); 
a1.add("home");
a1.add("will");

String [] s = new String[a1.size()];

a1.toArray(s);  // it means a1 collection is converted into String[] type array
for(String ss : s)
{
System.out.println(ss);
}

      // normal collections----> Arrays----> use toArray() method

ArrayList a2 = new ArrayList();
a2.add(23);
a2.add("jorden");
a2.add(32.3);

//a2.toArray(); this will return Object[] type array

Object [] oo = a2.toArray();

for(Object o: oo)
{
System.out.println(o);
}
System.out.println();
}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Converting_collections_into_Arrays

ram
home
will

23
jorden
32.3

*/