// example no.-
// from vikrams laptop
// when return type is object not the primitive type
// here we decalre two method of different class
// and at project level these classes belongs to the different modules of the project
// in this application we are using two extra classes (Emp and X )
// which are from different module of the project

class Mock
{
Emp m1()                 // 
{
System.out.println("m1 method");
Emp e = new Emp();// create the object of the return type of the method
return e;           // return the object in the return statement
               //at project level instead of using above three lines of code
                 // we use 'return new Emp();"
}           
 X m2()
{
System.out.println("m2 method");
X t = new X();
return t;
}
static String m3() // primitive type return type i.e., String
{
System.out.println("m3 method");
return "Dang";
}
public static void main(String []args)
{
Mock m = new Mock();
Emp e4= m.m1();// here m.m1() returns object of Emp type 
             // store such variable in Emp type variable of any name(e4)
X x4 = m.m2(); // here m is object of the Mock class
String str = Mock.m3(); // here m3 return type is string type
                       // store this value in any variable of string class


System.out.println("main method");
}
}

// in real time there is no need to declare these classes
// because these class were present in the different modules of java
// for this example purpose we declare two classes here
class Emp{}
class X{}