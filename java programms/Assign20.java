/* Advantages of constructor
*/
//case no.1 (default value are printed even object is created)
// to overcome this problem use user defined constructors.



 
class Comp
{
int eid;  //intial value=0
String ename;//intial value=null
float esal; //intial value=0.0


// here we create the user defined constructor
 
Comp()
{
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
}
}