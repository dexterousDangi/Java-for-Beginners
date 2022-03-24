// Map interface: HashMap class

// key+value = entry   // to represent the "entry" we have one interface "Map.Entry"

//put() method: to insert the data into hashmap
//keySet() method: to get the only key Objects data    //public java.util.Set<K> keySet()
// values() method: to get the only value object data //  public java.util.Collection<V> values()
		
//entrySet() method: to get the values of all entry in the map //  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();

//as we know map interface didn't support cursors but the above mentions methods return type is of collection type
// store the data in the collections objects and use the cursors for that.


import java.util.*;

class HashMap_and_its_method_with_cursor
{
public static void main(String [] args)
{
HashMap<Integer,String> h1 = new HashMap<Integer,String>();

h1.put(12,"dangi");
h1.put(12,"pardeep");  // as we know duplicate objects for key objects are not support, considered as only one occurence and data inconsistency will be there

System.out.println(h1);

HashMap<Integer,String> h2 = new HashMap<Integer,String>();
h2.put(111,"pardeep");
h2.put(222,"dangi");
h2.put(333,"dangi");  // but for value object we can provide duplicate objects

System.out.println(h2);

//  h2.keySet();  will return all the key object alone and return type of this method is "set"(which is collection interface, means cursors can be applicable)
   
Set s = h2.keySet();
Iterator i1 = s.iterator();       // using cursor in map collection       
while (i1.hasNext())
{
Integer ii =(Integer)i1.next();
System.out.println(ii);
}

Collection<String> c = h2.values();
Iterator<String> i2 = c.iterator();       // using cursor in map collection       
while (i2.hasNext())
{
String se=i2.next();
System.out.println(se);
}



Set<Map.Entry<Integer,String>> ss = h2.entrySet();
Iterator<Map.Entry<Integer,String>> i3= ss.iterator();
while (i3.hasNext())
{
Map.Entry<Integer,String> ee = i3.next();   // here next() method will return entry type data, type cast it to Map.Entry and print the data.
System.out.println(ee);
}
//or 

Set<Map.Entry<Integer,String>> sss = h2.entrySet();
Iterator<Map.Entry<Integer,String>> i4= ss.iterator();

while(i4.hasNext())
{
Map.Entry<Integer,String> ent = i4.next();
Integer iz=ent.getKey();
System.out.println(iz);

String tri=ent.getValue();
System.out.println(tri);
}
}
}
/*output: using every thing generic


F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac HashMap_and_its_method_with_cursor.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java HashMap_and_its_method_with_cursor

{12=pardeep}   // printing only one object

{333=dangi, 222=dangi, 111=pardeep}   // print all objects with duplicate value objects present

333    // only key objects(keySet() method)
222
111

dangi    // only value objects(values() method)
dangi
pardeep

333=dangi    // printing all entries (entrySet() method)
222=dangi
111=pardeep

333
dangi
222
dangi
111
pardeep
*/



