/* explanation regarding methods-  methods are used 
to write business logic in them. there are 2 types of 
methods instance and static.
*/
 class Test
{
void m1()
{
System.out.print("instance method- called using object");
}
static void m2()
{
System.out.println(" static method- called using class name");
}
public static void main(String []args)
{
Test t= new Test();
t.m1();
Test.m2();
}
}