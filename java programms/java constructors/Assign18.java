/* Parameterized constructor or say user defined constructor
if there is no constructor is present in the class then, to call the default constructor, complier is responsible, it should be a no parameter constructor.
if there is atlest one constructor present in the class, then compiler is not responsible for compiling the default constructor.


*/ 
class Team 
{
void m1() // instance method declared
{
System.out.println("m1 instance  method");
}
Team() // constructor created using class name, zero parameters passed.

{
System.out.println("zero argument in the constructor");

}
Team (int a) // another constructor with one parameter
{
System.out.println("one argument constructor....."+ a);
}
public static void main(String []args)
{
Team t = new Team();  //here Team() constructor is executed
Team t1= new Team(23);// here Team(int a ) consturctor is executed.
// in this class there are two object to call the method
// use any one from the above t  or  t1.
t.m1();
t1.m1();
}
}