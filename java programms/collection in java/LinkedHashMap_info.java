//LinkedHashMap: introduced in java 1.4 , preserves insertion order of data.

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

class LinkedHashMap_info
{
public static void main(String []args)
{
LinkedHashMap<Emp, Student> lh = new LinkedHashMap<Emp, Student>();

lh.put(new Emp(111,"dangi"), new Student (1, "geo"));
lh.put(new Emp(222,"ram"), new Student (2, "neo"));
lh.put(new Emp(333,"sam"), new Student (3, "leo"));

Set<Emp> s =lh.keySet();
for(Emp e1: s)
{
System.out.println(e1.eid+"---"+e1.ename);
}

//or more concise code

for(Emp e2: lh.keySet())
{
System.out.println(e2.eid+"---"+e2.ename);
}

// to values

for (Student s1: lh.values())
{
System.out.println(s1.sid+"---"+s1.sname);
}

// to print together use entrySet() method

Set<Entry<Emp,Student>> ss=lh.entrySet();
Iterator<Entry<Emp,Student>> itr = ss.iterator();
while(itr.hasNext())
{
Entry<Emp,Student> etr =itr.next();
Emp e3 = etr.getKey();
System.out.println(e3.eid+"---"+e3.ename);

Student s2=etr.getValue();
System.out.println(s2.sid+"---"+s2.sname);
}
}
}