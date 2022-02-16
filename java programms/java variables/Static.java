/* static variable- declared inside of the class but
outside the method and uses 'static' as the modifer
before its name.scope of the variable is within the class
 And how do we access the static variable 
using class name. Memory allocation starts at the loading 
of the '.class' file by the jvm.
*/

class Static
{
int a=10;    //instance variable

static int c=30;  //static variable
public static void main(String []args)  //static method
{ int b=20;                           //static body
Static s = new Static(); // creation of the object
System.out.println("instance variable in static area"+ s.a);
System.out.println("local variable in static area"+b);
System.out.println("this is static area and static variable"+ Static.c);
s.m1(); //method called using object
}
void m1() //instance method
{            //instance body
int b=20;
System.out.println("this is instance area and using instance variable"+a);
}
} 
