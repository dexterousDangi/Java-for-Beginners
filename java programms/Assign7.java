/* example no. 5
Return type for java method is mandatory.
Declaring a method inside a method is 
called inner method.java support inner class concept 
but didn't accept inner method concept.

*/
//calling another method while executing the method

 class Make 
{

void m1()
{
System.out.println(" Instance method : m1");
m2();    // instance method calling in instance area (can be accessed directly))
}
      // after executing all the method statement then control returns to the m2 method
void m2()
{
m3();
System.out.println(" Instance method : m2");
}
void m3(int a)
{
System.out.println(" Instance method : m3");
}
public static void main(String []args)
{
Make m = new Make();
m.m1();

}
}
// at first "Instance method: m3" is printed in output