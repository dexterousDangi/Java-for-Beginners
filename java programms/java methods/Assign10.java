//example no.-
// from vikrams laptop
// example of method vs returing primitive  type values
// to check the working of a function we can use return type statement
// return statement is mandatory if return type of method is other than "void"
//return statement has to be last statement of the method

class Depth
{
int m1()
{
System.out.println ("m1 method");
return 10;
 // if method return type is other then void(i.e., return nothin) then
           // we have to use the return type statement
           // return type must of as same as the of method return type.

}
float m2()
{
System.out.println("m2 mthod");
return 15.6f;
}
static char m3	()
{
System.out.println("m3 method");
return 'a'; // use single bracess ('___') to return char type return statement
            // use double bracess ("___") to return string type return statement
}
public static void main(String []args)
{
Depth d= new Depth();
//d.m1(); // here return value is 10
        // storing that value is optional
int x= d.m1(); // store return value in int x
System.out.println("return value of m1  "+x);
float y = d.m2();
System.out.println("return value of m2  "+y);
char z = Depth.m3();
System.out.println("return value of m3  "+z);

}
}