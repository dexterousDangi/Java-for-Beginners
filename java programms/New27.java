/*Ambiguity error: we receive this error when we have multiple interfaces, and
in those interfaces we declare varialbes(i.e., public,static and final)
 with same names. to overcome these errors "use instance_name" of which, you are
calling the variable
*/
 
interface Id1
{
int a=12;
}
interface Id2
{
int a= 23;
}
 
class Test implements Id1,Id2
{
void m1()
{
System.out.println(a);
}
public static void main(String []args)
{
Test t= new Test();
t.m1();
}
}

/*output:

F:\java by dragon\java programms>javac New27.java
New27.java:20: error: reference to a is ambiguous
System.out.println(a);
                   ^
  both variable a in Id1 and variable a in Id2 match
1 error
*/
 

// to resolve the problem just "use interface name"
 // of which you are using the varialbe


// use=  System.out.println(Id1.a); to pirnt=12
//use=  System.out.println(Id2.a);  to print=23
