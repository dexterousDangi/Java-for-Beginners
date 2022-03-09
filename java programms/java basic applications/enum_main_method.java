// yes, it is possible to declare the main method inside enum
// it is possible to declare the enum inside the class
// but we can't declare the enum inside the method.

enum Color
{
RED, BLUE, YELLOW;
public static void main(String []args)
{
System.out.println("enum main method");
System.out.println(RED);
System.out.println(BLUE);
Color [] r= Color.values();
for (Color rr:r)
{
System.out.println(rr);
}
}
}
/*
output:

F:\java by dragon\java programms\java basic applications>javac enum_main_method.java

F:\java by dragon\java programms\java basic applications>java Colorenum main method

RED
BLUE
RED
BLUE
YELLOW

*/