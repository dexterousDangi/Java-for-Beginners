// doubt here still running  




// rule no.4 about polymorhism (overriding a method concept) it is not possible to
//override a parent class final method.
//The Method with Final Keyword cannot be overridden in the subclasses
  


class Hockey 
{
final void marry ()  //overriden method
{ 
System.out.println("worng ball");
}
}
class Football extends Hockey
{
void marry()       // overriding method
{ 
System.out.println("right ball");
}
public static void main(String []args)
{
Hockey P =new Football();
P.marry();


System.out.println("child class main method");
}
}


/*output:

C:\Users\Microsoft\Desktop>javac "doubt New14.java"
doubt New14.java:21: error: marry() in Football cannot override marry() in Hocke
y
void marry()       // overriding method
     ^
  overridden method is final
1 error
*/