// example no. 2 about the methods-functionality in java
// in this we are passing some parameter-arguments in the methods
// methods parameters-arguments are always local variables

class Parameter
{
void m1(int a, char ch) // variable declared inside the method are local variables
{
System.out.println(" Instance method m1");
System.out.println(a );
System.out.println(ch);

}
static void m2(String str, double d)
{
System.out.println(" Static method m2");
System.out.println(str +d);
System.out.println(d);

}
public static void main(String []args)
{
Parameter p= new Parameter();
p.m1(10,'s'); //method is aspecting two parameters here
          // if method is aspecing parameter at the compile time
          // pass those parameters here in the main method while calling the method
          // how to pass the char using single braces


Parameter.m2("dragons world", 0.07);
           //string parameters or argument comes in double braces
}
}


/* method is expecting parameter or argument means 
pass those values whenever we calling the methods
*/
