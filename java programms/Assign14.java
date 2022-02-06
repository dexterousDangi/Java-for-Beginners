/*Methods are returing non primitive elements.
methods are returing the oject or class.if the method return is object, 
then create the object and return that value.
Method vs returning objects
At project level Dim and X class belongs to other modules of the application

*/
class Dim{}
class X{}
 
class Methods
{
int apple(int a, int b) // primitive type methods having local variables passed during calling time.
{
System.out.println("primitive type method....." + a*b);
return 12;
  //return type must be same as the methods return type.
}
Dim m1() // return type of m1 method is class Dim type
{
System.out.println("object returing in the method");
Dim d = new Dim();
return d;
  // instead of the above 2 lines of code we can use " return new Dim(); "
}  
X m2()
{
X g= new X();
System.out.println("method m2 return type is class X or objects of class X");
return g;
}
public static  void main(String []args)
{
Methods mm= new Methods();
int q=mm.apple(22,4);
       //mm.apple returing int type value, store it into 'int q'.

System.out.println("return value of the apple method...." + q);
 
Dim d2=mm.m1();
      // here mm.m1() is returing "Dim" type values store those value in "Dim" type variable .

System.out.println("object returing in the method..."+d2);
System.out.println("return value of the m1 method....");
mm.m2(); 
   // here mm.m2() will retrun 'X' type. store it into 'X' type varialble and print it.
// X ty= mm.m2(); it we try to print the 'ty' value it will print some hash value.
}
}

// when ever we try to print reference variable('q','d2'), it will automatically print some hash values.
