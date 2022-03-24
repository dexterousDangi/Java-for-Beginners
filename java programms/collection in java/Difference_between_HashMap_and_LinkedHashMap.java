// ABOUT HASHMAP AND LINKEDHASHMAP 
// there is only one major difference between these two that is
// hashmap did not maintain insertion order 
// while linkedhashmap maintain insertion order

// removing an entry form LinkedhashMap using 
//iterator, entryset(), remove()(of iterator class)

import java.util.*;
class Difference_between_HashMap_and_LinkedHashMap{
public static void main(String []args){
HashMap h1 = new HashMap();
h1.put(3, "nimo");
h1.put(23,"neo");
h1.put(9,"leso");
h1.put(13, "rama");
System.out.println(h1);
LinkedHashMap ls= new LinkedHashMap();
ls.put(111, "nei");
ls.put(2, "moto");
ls.put(3,"maya");
ls.put(4, "zaya");

Set s1=ls.entrySet();
Iterator itr= s1.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}


  // removing an entry from the map data.
//Set s2=ls.entrySet();
Iterator itr2= (ls.entrySet()).iterator();
while(itr2.hasNext())
{
Map.Entry zz =(Map.Entry)itr2.next();
int i = (Integer)zz.getKey();
if(i==4)
{itr2.remove();}
else
{
System.out.println(zz);
}
}


}
}

/* output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java Difference_between_HashMap_and_LinkedHashMap

{3=nimo, 23=neo, 9=leso, 13=rama}

111=nei
2=moto
3=maya
4=zaya

111=nei
2=moto
3=maya

*/