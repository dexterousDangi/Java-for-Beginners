// About enum: enum is used to declare the group of constants.
 // enum can contain constructor, variable and methods also , it can have main mehtod also

// enum constants are nothing but object of enum.
// so whenever we declare a constructor inside a enum, it is executed the for the no. of the constants we have 
// when we load the .class file of enum during execution

// if enum contains only constants then the semicolon is optional .
// and if enum contains constants with constructors, variables and methods then semicolon is mandatory 
// and the group of constants must be declared in the first line of enum


enum Beer
{
KF, RC;

Beer()		// constructor
{
System.out.println("constructor inside the enum");
}
}

class Constructor_inside_enum
{
public static void main(String []args)
{
System.out.println(Beer.KF);
}
}

/*output:
F:\java by dragon\java programms\java basic applications>javac Constructor_inside_enum.java

F:\java by dragon\java programms\java basic applications>java Constructor_inside_enum

constructor inside the enum
constructor inside the enum
KF

*/