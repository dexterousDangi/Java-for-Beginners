//example no.4 same as example no.3
class Work
{
void me1(X x, Emp e) //x,e are the object of the class 'X' and Emp.
{
System.out.println("this is instance area- and was printed using the object of different classes");
}
static void m2(Y y, Student s)// static method with m2 name
{
System.out.println("this is static area accessed using the object of two differnt classes");
}
public static void main(String []args)       //execution starts from here


/*to access the following methods we have to use the corresponding 
objects i.e., x, y, e, s. we must create the following objects of the 
respective class. there has to be these classes(X,Y,Emp,Student).
these classes can remain empty.
*/


{
Work w =  new Work();// object requires to access the me1 method.



X x1 = new X();

Emp e3 = new Emp();
 
w.me1(x1,e3);

Y y2= new Y();

Student S2= new Student();

Work.m2(y2,S2);
}
}

class X{}
class Emp{}
class Y{}
class Student{}