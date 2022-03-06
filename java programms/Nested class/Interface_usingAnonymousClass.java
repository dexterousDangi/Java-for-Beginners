// Anonymous inner class usage in case of inerfaces user defined or predefined

// eg: without using anonymous inner classes

interface It1   // by default abstract
{
void m1();    // by default public, abstract
void m2();	// by default public, abstract
}


/*
class Test implements It1
{
// override 2 methods here
}

class TestClient 
{
// creating object of test class and calling method inside the main method
}
*/



//eg: usage of anonymous classes  (consider It1 as predefined interface)

class TestClient
{
It1 t = new It1()
{
public void m1()
{System.out.println("m1 method of interface It1 using anonymous inner classes");
}
public void m2()
{System.out.println("m2 method of interface It1 using anonymous inner classes");
}

};

public static void main(String []args)
{
TestClient tt = new TestClient();
tt.t.m1();
tt.t.m2();
}
}

/*output:


F:\java by dragon\java programms\Nested class>javac Interface_usingAnonymousClass.java

F:\java by dragon\java programms\Nested class>java TestClient

m1 method of interface It1 using anonymous inner classes

m2 method of interface It1 using anonymous inner classes
*/