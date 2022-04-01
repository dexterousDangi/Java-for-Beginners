// major difference between static variables and instance variables.

// when ever a new object is created then  the new memory is allocated for instance variables
// but for Static variable memory is allocated once and at the time of class loading 

/*
Static methods can't access instance methods and 
instance variables directly. They must use reference to
 object. And static method can't use this keyword as
 there is no instance for 'this' to refer to.
*/


class Static_vs_Instance_variables
{
int a = 12;
static int b  = 33;
public static void main(String [] args)
{
Static_vs_Instance_variables obj = new Static_vs_Instance_variables();

System.out.println(obj.a);
System.out.println(Static_vs_Instance_variables.b);

obj.a = 13;   // using instance variable using reference variable of class
b = 34;  // using static variable directly using variable name only


System.out.println(obj.a);
System.out.println(b);

obj.a=14;      // using instance variable with the help of object
Static_vs_Instance_variables.b=35;   // using static variables with the help of class name

System.out.println(obj.a);
System.out.println(Static_vs_Instance_variables.b);


obj.a=15;
obj.b=35;


System.out.println(obj.a);
System.out.println(obj.b);


Static_vs_Instance_variables obj1 = new Static_vs_Instance_variables();
System.out.println(obj1.a);
System.out.println(obj1.b);

}
}
/* output:


F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Static_vs
_Instance_variables.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Static_vs_
Instance_variables
12
33
13
34
14
35
15
35

12   ---> NOT PRINTING UPDATED VALUE OF VARIABLE a.
         // again memory is allocated at the creation of new object.

35   ---> PRINTING UPDATED VALUE OF VARIALBE b.

*/