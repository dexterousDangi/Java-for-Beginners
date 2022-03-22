// using generic treeset and treeset constructor apporach to sort the Emp class objects data

//  public java.util.TreeSet(java.util.Comparator<? super E>);
//                          ------------------------------------
// using treeset class comparator constructor and pass the comparator object while creating treeset 

//At professional level we write the sorting logic in seperate file and class too.
// but this is your understanding that's why i'm writing these logic here.

import java.util.*;

class EnameComp implements Comparator<Emp>
{
public int compare(Emp e1, Emp e2)
{
return (e1.ename).compareTo(e2.ename);
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


class TreeSet_comparator_constructor_approach_to_sort_data
{
public static void main(String []srg)
{
Emp e1 = new Emp (32,"alpha");
Emp e2 = new Emp (3,"aaraman");
Emp e3 = new Emp (362,"zippo");
Emp e4 = new Emp (320,"best");

TreeSet<Emp> t = new TreeSet<Emp>(new EnameComp());  // pass the comparator interface object here   
                                /*******************/
t.add(e1);
t.add(e2);
t.add(e3);
t.add(e4);
                                
for(Emp e: t)             
{
System.out.println(e.eid+ "..."+e.ename);
}

System.out.println();

Emp e5 = new Emp (62,"mato");
Emp e6 = new Emp (20,"timmy");

TreeSet<Emp> tt = new TreeSet<Emp>(new EidComp());   
                                  /*******************/
tt.addAll(t);
tt.add(e5);
tt.add(e6);
System.out.println("2nd tree set starts from here:");
Iterator<Emp> itr = tt.iterator();   // using cursor to print the data or to retrieve the data
while(itr.hasNext())
{

Emp ee = itr.next();
System.out.println(ee.eid+"...."+ee.ename);

}
}

}
/*
output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac TreeSet_comparator_constructor_approach_to_sort_data.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java TreeSet_comparator_constructor_approach_to_sort_data

3...aaraman
32...alpha
320...best
362...zippo

2nd tree set starts from here:
3....aaraman
20....timmy
32....alpha
62....mato
320....best
362....zippo

*/



     