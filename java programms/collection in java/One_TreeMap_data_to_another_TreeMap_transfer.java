// using one treemap constructor(map object) to add data from another treemap.
//public java.util.TreeMap(map object);

import java.util.*;
class One_TreeMap_data_to_another_TreeMap_transfer
{
public static void main(String []args)
{
TreeMap<String, Integer> t = new TreeMap<>();
t.put("dangi", 21);
t.put("sam", 43);
t.put("charry", 9);

TreeMap<String, Integer> t1 = new TreeMap<>();
t1.put("amid", 11);
t1.putAll(t);

TreeMap<String, Integer> tm = new TreeMap<>(t1,t);
tm.put("team", 12);

System.out.println(tm);

Set<Map.Entry<String, Integer>> s1 =tm.entrySet();
Iterator<Map.Entry<String,Integer>> itr = s1.iterator();
while(itr.hasNext())
{
Map.Entry<String,Integer> mp = itr.next();
int im  = mp.getValue();
if (im == 12)
{itr.remove();}
else
{System.out.println(im);}
String str=mp.getKey();
System.out.println(str);
}

System.out.println(tm);
}
}
/*output:
F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac One_TreeMap_data_to_another_TreeMap_transfer.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java One_TreeMap_data_to_another_TreeMap_transfer

{amid=11, charry=9, dangi=21, sam=43, team=12}

11
amid
9
charry
21
dangi
43
sam
team   = removed from hashtable

{amid=11, charry=9, dangi=21, sam=43}

*/

