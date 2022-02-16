// default values are provided by the jvm.
class Test 
{
int a ;
boolean b;
public static void main (String []args)
{
// instance variable accessed using reference variable or using object
Test t = new Test();
System.out.println(t.a);
System.out.println(t.b);
}
}
/* output will be print as 0 and false
because the default vaule of a int is 0 and default 
value of boolean is false.
type of variable - default value
int   -  0
byte - 0
short  - 0
long - 0
float - 0.0
double  - 0.0 
char - single space
boolean - false
*/