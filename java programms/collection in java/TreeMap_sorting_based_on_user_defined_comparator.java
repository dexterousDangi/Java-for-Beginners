import java.util.*;

class EnameComp implements Comparator<Emp>
{
public int compare(Emp e1, Emp e2)
{
return -(e1.ename).compareTo(e2.ename);
}
}

class EidComp implements Comparator<Emp>
{
public int compare(Emp e1, Emp e2)
{
if (e1.eid ==e2.eid)
{return 0;}
else if(e1.eid>e2.eid)
{return 1;}
else
{return -1;}
}
}




class TreeMap_sorting_based_on_user_defined_comparator
{
public static void main(String []args)
{
TreeMap<Emp,Student> h = new TreeMap<Emp,Student>(new EidComp());
                      /******************/

h.put(new Emp(1101,"aman"), new Student(1,"dani"));
h.put(new Emp(222,"mohit"), new Student(8,"hulk"));
h.put(new Emp(33,"pinku"), new Student(3,"super"));
h.put(new Emp(444,"dangi"), new Student(4,"fast"));

System.out.println();
System.out.println("data shorted by integer type");


Set<Map.Entry<Emp,Student>> s = h.entrySet();  // retrun type of entrySet() is set
			// and for set we can use curser

Iterator<Map.Entry<Emp,Student>> itr = s.iterator();

while (itr.hasNext())
{
Map.Entry<Emp,Student> m = (Map.Entry)itr.next(); // here itr.next() will return an object of Entry type and entry is a sub interface of map 
					// then use map.entry to type cast the object

  		// here m is holding key as well as value
 
Emp e =(Emp)m.getKey();                    //here key is holding only emp data
System.out.print(e.eid+"---"+e.ename);

Student ss = (Student)m.getValue();     // here value is holding student data
System.out.println("  "+ss.sid+"---"+ss.sname);

}

TreeMap h1= new TreeMap(new EnameComp());
h1.put(new Emp(1101,"aman"), new Student(1,"dani"));
h1.put(new Emp(222,"mohit"), new Student(8,"hulk"));
h1.put(new Emp(33,"pinku"), new Student(3,"super"));
h1.put(new Emp(444,"dangi"), new Student(4,"fast"));
System.out.println();

System.out.println("printing only key objects---> in desending order of names");

Set s1= h1.keySet();  // it only contains key only
for(Object o: s1)
{
Emp ee = (Emp)o;
System.out.println(ee.eid+"---"+ee.ename);
}


System.out.println();
System.out.println("print entire map now");

Set ss=h1.entrySet();
Iterator itr1 =ss.iterator();
while(itr1.hasNext())
{
Map.Entry met= (Map.Entry)itr1.next();

Emp e1=(Emp)met.getKey();
System.out.print(e1.eid+"---"+e1.ename);

Student s11 = (Student)met.getValue();
System.out.println("   "+s11.sid+"----"+s11.sname);
}
}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeMap_sorting_based_on_user_defined_comparators.java

Note: Experimentof_.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeMap_sorting_based_on_user_defined_comparator

data shorted by integer type
33---pinku  3---super
222---mohit  8---hulk
444---dangi  4---fast
1101---aman  1---dani

printing only key objects---> in desending order of names
33---pinku
222---mohit
444---dangi
1101---aman

print entire map now
33---pinku   3----super
222---mohit   8----hulk
444---dangi   4----fast
1101---aman   1----dani
*/


