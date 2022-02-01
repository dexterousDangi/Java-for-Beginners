// use of 'this' keyword. this is used to use the instance 
// variables in the static method area with out using objects
class This 
{
int a=1;
int b=4;
void m5(int a, int b)  // local variables

{
System.out.println("this is local variable    "+a+b); // local variables can be used directly
 System.out.println("this is instance varialbe   "+this.a+this.b); // 'this' key word used to indicate instance varialbles
}
public static void main(String []args)
{
This t= new This();
t.m5(566,55);
System.out.println("I'm main method");
}
}