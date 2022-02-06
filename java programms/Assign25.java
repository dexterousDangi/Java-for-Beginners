/* formates of object creation:
1) named approach
2) nameless approach

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
// named approach
Test t1=new Test();
Test t2=new Test(12);
Test t3=new Test (7,3);
//nameless approach
new Test();
new Test (2);
new Test(2,5);
}
}