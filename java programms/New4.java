// parent/super class constructors

class Parent
{
int a ;
int b;
Parent(int x)
{
a=2;
b=4;
System.out.println("one argument consturctor "+x);
System.out.println(" parent class sum of two no.  " + a+b);
}
}


class Child extends Parent
{
int w,r;

Child()

{ 

this(5);  // to call the one argument constructor of the child class

w=234;

r=3;
int j=w+r;
System.out.println("sum of twos    "+  j);

}
Child(int k)
{
super(54);  // just use the "super" keyword alone to call parent class constructor
             //passing one argument while calling parent class constructor

System.out.println("one argu consturctor"+k);
}

public static void main(String []args)
{
new Child();  // it call the zero argument constructor of the child class
}
}
/* output:

F:\java by dragon\java programms>java Child
 parent class sum of two no.  24
one argu consturctor5
sum of twos    237
*/
// super keyword has to be first statement of the constructor