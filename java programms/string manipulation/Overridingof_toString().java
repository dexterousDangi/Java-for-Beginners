// usage of toString() method 
//called by reference variable when ever we try to print them.
/*
class Emp
{
int eid;
String ename;
Emp( int eid, String ename)
{
this.eid = eid;
this.ename= ename;
}

public static void main(String []args)
{
Emp e= new Emp(12,"dangi");
System.out.println(e);
System.out.println(e.toString());
 
}
}*/
/*output:
F:\java by dragon\java programms\string manipulation>javac "Usageof_toString().java"

F:\java by dragon\java programms\string manipulation>java Emp

Emp@4617c264
Emp@4617c264

*/


// overriding toString() method
//
     // now the real deal is that we want whenever we print reference varialbe it will
     // print the Emp data not the hash code.

class Emp

{
int eid;
String ename;
Emp( int eid, String ename)
{
this.eid = eid;
this.ename= ename;
}
public String toString()    // overriding tostring() method
{
System.out.println("employee id  :"+eid);

System.out.println("employee name   :"+ename);
return "dangi";
}

public static void main(String []args)
{
Emp e= new Emp(12,"dangi");
System.out.println(e);
System.out.println(e.toString());
  
     // now the real deal is that we want whenever we print reference varialbe it will
     // print the Emp data not the hash code.
     // by overriding it is possible, override the toString() method
     // then Emp toString() method will be printed

}
}
/*
F:\java by dragon\java programms\string manipulation>javac "Overridingof_toStrin
g().java"

F:\java by dragon\java programms\string manipulation>java Emp
employee id  :12
employee name   :dangi
dangi
employee id  :12
employee name   :dangi
dangi
*/













