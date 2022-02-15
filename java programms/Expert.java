// Information about Package


package AlphA.expert;

import java.lang.System;

public class Expert
{
static void m1()
{

System.out.println("static methods m1 will be called without the instance of the class created");
}
public static void main(String []arga)
{

m1(); m2();
System.out.println("my main method alpha ");
}
static void m2()
{
System.out.println("static methods m2 will be called without the instance of the class created");
}
}

/*output:

F:\java by dragon\java programms>javac -d . Expert.java

F:\java by dragon\java programms>javac Expert.java

F:\java by dragon\java programms>java AlphA.expert.Expert

static methods m1 will be called without the instance of the class created
static methods m2 will be called without the instance of the class created
my main method alpha
