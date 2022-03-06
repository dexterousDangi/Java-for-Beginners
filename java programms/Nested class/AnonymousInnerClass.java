// file using anonymous inner class : inner classes are used to make the code concise. 

package com.anonymousInnerclasses;

import com.withoutanonymous.predefinedSupport.Predefined_classes_withoutAnonymous;


/*
class Test
{
void m1(){}
void m2(){}
}

*/



class TestClientwithAnonymousInnerClass

{

Predefined_classes_withoutAnonymous t = new Predefined_classes_withoutAnonymous()             // no termination symbol

			 // first create the object of predefined class having methods
				// here we are using .class file to 

	// Test t = new Test();(if other package did not work then use current programs Test class)
	



{     // anonymous inner classes

public void m1()
{
System.out.println("m1 method overriden using anonymous inner class");
System.out.println(t.getClass().getName());
}
public void m2()
{
System.out.println("m2 method overriden using anonymous inner class");
}

};         // here the test class child class object is created, which overrides these methods

public static void main(String []args)
{
TestClientwithAnonymousInnerClass tt = new TestClientwithAnonymousInnerClass();   

tt.t.m1();     // m1() method present in t(which is test class), which in turn present in tt.
tt.t.m2();	// so, this is how we call the anonymous class overriden methods
}
}


/*output: using current file Test class

F:\java by dragon\java programms\Nested class>javac -d . AnonymousInnerClass.java

F:\java by dragon\java programms\Nested class>java com.anonymousInnerclasses.TestClientwithAnonymousInnerClass

m1 method overriden using anonymous inner class

com.anonymousInnerclasses.TestClientwithAnonymousInnerClass$1     // this is anonymous inner class

m2 method overriden using anonymous inner class

*/


/*output: using file from the package


F:\java by dragon\java programms\Nested class>javac -d . Predefined_classes_withoutAnonymous.java

F:\java by dragon\java programms\Nested class>javac -d . AnonymousInnerClass.java

F:\java by dragon\java programms\Nested class>java com.anonymousInnerclasses.TestClientwithAnonymousInnerClass

m1 method overriden using anonymous inner class

com.anonymousInnerclasses.TestClientwithAnonymousInnerClass$1

m2 method overriden using anonymous inner class



