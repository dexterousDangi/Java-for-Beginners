/* example no.6
if two variable have same name the priority goes with the local variable
first locat variable is printed.
use 'this' keyword to indicate instance variable
inside the static area you can not able to use 'this' keyword
*/

class Mute
{
int a= 12;    // x,y is instance variable
int b= 40;
void add (int a , int b)   // a,b is local variable
{
System.out.println(a+b);
System.out.println(this.a+this.b);
}
public static void main(String []args)
{
Mute m = new Mute();
m.add(100,200);
}
}