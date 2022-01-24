/* instance variable- variables which are declared inside the class 
but outside the methods.
scope of such variable is within all of that class.
memory allocated when object is created
memory released when object is destroyed
*/


class Instance
{
int a=100; // instance variables
int b=200;
public static void main(String []args) //static method
{                                       //static area   
            // to acces the instance variable we must have an object
           // create a object 
Instance i= new Instance(); //object reference variable created
System.out.println(i.a);     // local variables

System.out.println(i.b);
i.m1();
}
/* jvm execute only main method 
to execute the user defined method 
we must call it into the main method because 
jvm is responsible for the execution of the main method
*/
void m1()         //instance method    //also called user defined method
{                                 

System.out.println("same area"+ a);

System.out.println(b);                              // instance area
}
}
/* always check which variable( i.e., local,instance,staic)
and which area ( Instance area or Static area)
same type - direct access
different type - object reference variable access
*/