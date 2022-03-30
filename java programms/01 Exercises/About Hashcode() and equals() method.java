// hashcode() and equals() methods
//equals() method: of string class compare the elements of the object not the reference variable.
//(==) double equal operator: used to compare two reference variable wherter they are pointing towards same heap memory location.


import java.util.*;
class Employee
{
int id;
Employee(int id)
{
this.id=id;
}
}


class Test
{
public static void main(String []args)
{
Employee e1= new Employee(1);
Employee e2= new Employee(1);

HashMap map1= new HashMap();

map1.put(e1,"jack");
map1.put(e2,"jack");
System.out.println(map1.size());

Integer i1=1;
Integer i2=1;
HashMap map2= new HashMap();

map2.put(i1,"one");
map2.put(i2,"one");

System.out.println(map2.size());

}
}
/*output:
F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Test
2
1


to overcome this problem, override the hashcode() and equals() inside the Emplyoee class;
*/