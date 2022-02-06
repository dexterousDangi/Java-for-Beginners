/* calling the constructors
one constructor is calling another constructor
using this keyword
*/

class Test
{
Test()
{
System.out.println("0- argument constructor");
}
Test(int a)
{
System.out.println("1- argument constructor");
}
Test(int a, int b)
{
System.out.println("2- argument constructor");
}
public static void main(String []args)
{
Test t1=new Test();
Test t2=new Test(12);
Test t3=new Test (7,3);
}
}
// see file  Assign24.java for more explnation