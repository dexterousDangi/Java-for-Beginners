// difference between instance and static variable 
// by example
 
class Test
{
int a = 21;
static int b= 212;
public static void main(String []args)
{
Test t = new Test(); 
System.out.println("instance variable using object t  "+ t.a);// value of a = 21
System.out.println("static variable using object t  "+ t.b); // value of b =212
t.a= 555;
t.b= 666;
System.out.println("here value of the instance and static variable are updated");

System.out.println("new instance variable using object t   "+ t.a); // value of a = 555
System.out.println("new static variable using object t  "+ t.b);  // value of b = 666
Test t1 = new Test();
System.out.println("with new object t1 - instance variable  "+ t1.a); // value of a =21
System.out.println("with new object t1 - static variable   "+ t1.b); // value of b=666
}
}
