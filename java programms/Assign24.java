/* calling one constructor to call other one using this keyword*/
// call of "this" must be first statement in the constructors.
class Test
{
Test()
{
this(45); //in 0-argument cosntructor we are calling 1-argument constructor using"this" keyword

System.out.println("0- argument constructor");
}
Test(int a)
{
this (05,56); // 1-argument cosntructor calling 2-argument constructor
System.out.println("1- argument constructor");
}
Test(int a, int b)
{
System.out.println("2- argument constructor");
}
public static void main(String []args)
{
Test t1=new Test();
}
}
// here 2- argument constructor will be printed first
// one constructor can call only one constructor because only one "this" keyword is allowed.
