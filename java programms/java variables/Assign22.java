// just use the "this" keyword and assign the instance varialbe the value of the 
// local variable present in the cosntructor, if both local and instance variable
// have same names then use this keyword for the instance varialbe.

class Emp 
{
int eid; String ename; float esal;

Emp(int eid, String ename, float esal)// these are the local variable, scope of these are with this particular block/method/constructors.
{
// conversion of local value to instance values
this.eid= eid; 
this.ename= ename;
 this.esal=esal;

}
void disp() // instance method can access only instance variables
{
System.out.println("employee id     "+ eid);
System.out.println("employee name    "+ename);
System.out.println("employee salary   "+esal);
}
public static void main(String []args)
{
Emp e = new Emp(112,"dangi",45646.5f); 
e.disp();
Emp e1= new Emp ( 113,"sam",465464f);
e1.disp();
}
}


