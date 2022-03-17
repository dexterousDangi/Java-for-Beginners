// Performing various operation using ListItertor cursor.
// like adding data, replacing data, removing data.

//Today, after half an hour of searching for a bug, I discovered that it is possible to put a semicolon after an if statement instead of code.


import java.util.ArrayList;
import java.util.ListIterator;

class ListIterator_in_Arraylist_performing_operation		
{
public static void main(String []args)
{
Emp e1= new Emp(3, "nam");
Emp e2= new Emp(2,"naaam");
Emp e3= new Emp(3243, "ndaam");
Emp e4= new Emp(342, "nagam");
Emp e5= new Emp(42, "gam");
Emp e6= new Emp(420, "gaam ah");


ArrayList<Emp> al= new ArrayList<Emp>();
al.add(e1);
al.add(e2);
al.add(e3);
al.add(e4);
System.out.println("elments in the array"+"  and there size is  "+al.size());

for(Emp ee: al)
{
System.out.println(ee.eid+"..."+ee.ename);
}

ListIterator<Emp> li = al.listIterator();

li.add(e5);  //   --->  adding object using cursor 

while(li.hasNext())
{

Emp e11 = li.next();

if((e11.ename).equals("ndaam"))
{
li.remove(); //---> removing object using cursor  // have to use the object of listiterator to perform the operations
}		// point to remember is that by using cursor it is possible to remove the data also.

if((e11.ename).equals("nam"))
{
li.set(e6);   //  ----> this will replace the "nam" containg object with e6
}
}

for(Emp e12: al)
{
System.out.println(e12.eid +"...."+e12.ename);
}
}
} 
/*output:

F:\java by dragon\Java-for-Beginners\java programms\collection in java>javac ListIterator_in_Arraylist_performing_operation.java

F:\java by dragon\Java-for-Beginners\java programms\collection in java>java ListIterator_in_Arraylist_performing_operation

elments in the array  and there size is  4
3...nam
2...naaam
3243...ndaam   --->removed
342...nagam

42...gam    ----> added ojbect at the position where cursor is pointing currently.
3....nam
2....naaam
342....nagam
*/