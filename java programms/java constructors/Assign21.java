/* Parameterized constructor
when more than one object is created then same cosntructor is going to be executed again and again
for this problem we use the following constructors
*/
 
class Emp 
{
int eid; String ename; float esal;// instance variable which are going into the disp() method

Emp(int eid, String ename, float esal)// these are the local variable, scope of these are with this particular block/method/constructors.
{
// parameterized constructor
} 



void disp() // instance method can access only instance variables
{
System.out.println("employee id     "+ eid);
System.out.println("employee name    "+ename);
System.out.println("employee salary   "+esal);
}
  // here default values of the variables will be printed.

public static void main(String []args)
{
Emp e = new Emp(112,"dangi",45646.5f); 
e.disp();
Emp e1= new Emp ( 113,"sam",465464f);
e1.disp();
}
}

// becaue the method was unable to access the local variables which were passed into the constructor
// what will be the output: it is the default value of the local variables o,null,o.o
// to find out the right approach visit the next file Assign22.java
