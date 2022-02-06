/* Advantages of constructor
*/
//case no.1  (default value are printed even object is created)
// to overcome this problem use user defined constructors.
// constructors are used to assign instance variables the value other than default.



class Comp
{
int eid;  //intial value=0
String ename;//intial value=null
float esal; //intial value=0.0


// here we create the user defined constructor
 // first avoid the "comp ()" constructor to see the advantage of the constructors.

Comp()
{
// declaring the values of isntance variables
eid=111;
ename="DRAGON";
esal = 665655.2f;// to represent the float value use "f" keyword at the end of the value

}



void disp()
{
System.out.println("employee id     "+ eid);
System.out.println("employee name    "+ename);
System.out.println("employee salary   "+esal);
}
public static void main(String []args)
{
Comp c = new Comp(); //default constructor is executed
c.disp();
      // Comp c1 = new comp();
     // c1.disp();
    // when 'c1' is created then same constructor is going to be executed.

}
}
// if we create the different objects of the same class then same constructor is going to initialize again and again
// to over come this problem use parameterized constructor. 
// see file Assign21.java