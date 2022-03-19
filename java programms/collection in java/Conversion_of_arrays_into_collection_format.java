// Conversion of Arrays into collection : using "asList()" method of arrays class. It is static method

//we use constructor to convert the simple array into the collection format.
//       ------------


import java.util.*;
class Conversion_of_arrays_into_collection_format
{
public static void main(String []args)
{
String [] str = {"alpha", "tom", "mac"};  // normal string array

ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));

al.add("hoi");
al.add("hori");

for (String s: al)
{
System.out.println(s);
}

ArrayList al1= new ArrayList(Arrays.asList(str));  
al1.add("normal");
al1.add("arrays");

for(Object o: al1)
{
if(o instanceof String)
{
String ss = (String)o;
System.out.println(ss);
}
}
}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Conversion_of_arrays_into_collection_format

alpha
tom
mac
hoi
hori

alpha
tom
mac
normal
arrays

*/