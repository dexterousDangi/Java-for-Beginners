/* various methods of accessing the static variable
there are three ways through which we can access the 
static variable. First by using class name, second by 
using reference variable/object. third it can be directly
accessed with in same package.*/
class Test
{
static int a=122;
public static void main(String []args)
{
System.out.println(Test.a);// 1. using the class name
System.out.println(a);  // 2. variable is used directly
Test t = new Test();
System.out.println(t.a);  //3. accessed using reference variable or object
}
}