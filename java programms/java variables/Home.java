// All about "this" keyword

class Java 
{
int a ;
int b;
char ch='a';
String str   ="roma";

Java()   // constructor are also used to assign instance variable their value
{  
this(4,5); // this keyword must be the first statement of the constructor 
a=22;
b=23;
ch='M';
str="never mind";


System.out.println("zero argument constructor");

}

Java (int a1 ,int b1)
{ 
ch='z';
str= " no boy";
System.out.println("two argument constructor  "+a1+"  "+b1);
}

int alpha()
{
System.out.println("this is isntance method  "+ch +"   "+str);
System.out.println("printing some instance variables...."+ a+"   "+b);
return 12;  // return type of method is int, so we have to provide some int value as return value
}

public static void main (String []args) 
{

new Java().alpha(); // ch,str variable value were taken from java() constructor
                       // nameless object creation
                      // to use the instance variable in the alpha method 
                      // we must use the following constructor in which variable are declared 
                      // other wise default values will be printed.
                      // reference variable approach

Java j1=new Java(4,5);
j1.alpha();      // ch,str values were taken from the starting variables

System.out.println("this is main method...."+j1.ch+"    "+j1.str);

}
}


