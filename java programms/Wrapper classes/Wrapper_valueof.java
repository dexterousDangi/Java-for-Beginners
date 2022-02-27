//valueOf() method:
/* there are two ways to create wrapper class obj:
1. by using constructors
2. by using valueOf() method

*/
  //primitive or string ---> wrapper objects


class Object_using_valueof
{
public static void main(String []args)
{

Integer i = new Integer(100); // Primitive constructor
Integer i1= new Integer("100");  // String constructor

Integer i2= Integer.valueOf(100);  //primitive parameters are passed
Integer i3= Integer.valueOf("100"); // string parameter

System.out.println(i+i1+i3+i2);

}
}
/*output:

F:\java by dragon\java programms\Wrapper classes>java Object_using_valueof
400
*/