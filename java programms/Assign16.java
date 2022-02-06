/* return value to be taken from instance varialble or local variables.
three different cases are there, when both the variables(local, instance) are present in the same application.
automatically preference goes to the local variable.
to change the preference we use "this" keyword , when we requried instance type return type.


*/

class Help
{int b = 545;// instance variablesd
int a = 12;// isntance varialbles
int m1(int a ) // local variables
{
System.out.println("the m1 method");
System.out.println("here preference is local variable");
return a;   // returing local variable
}
int m2(int b )
{
System.out.println("the m2 method"); 
System.out.println("here preference is instance variables");
return this.b;  // to return the instance variable we must use "this" keyword.
}
public static void main(String []args)
{
Help h= new Help();
int x= h.m1(23);
System.out.println("method m1 and return type is local......"+x);
int in = h.m2(56);
System.out.println("method m2 and return type is instance..."+in);
System.out.println("the main method: everything is happing inside me ");
}
}
// when there is no local variable present then preference goes to the instance variables.