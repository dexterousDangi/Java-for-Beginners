// Interface(file1.java) vs Abstract Class(file2.java) vs Normal Class(file3.java)
//file no.3 ---> normal or general class(having all methods declarartions and implementations too)
 
// import the required packages

package com.dop.client;  // package statement

import com.dop.declarations.Message;

public class TestClient1 implements Message
{
   // must override all three method present in Message interface

public void morning ()
{
System.out.println(" morning method of interface message");
}
public void evening ()
{
System.out.println("evening method of interface message");
}
public void gn()
{
System.out.println("gn method of the interface message");
}
public static void main(String []args)
{
TestClient1 t = new TestClient1();
t.morning ();
t.evening();
t.gn();
}
}

/* output:
F:\java by dragon\java programms>javac -d . Message.java

F:\java by dragon\java programms>javac -d . Helper.java

F:\java by dragon\java programms>javac -d . TestClient1.java

F:\java by dragon\java programms>javac -d . TestClient2.java

F:\java by dragon\java programms>java com.dop.client.TestClient1
 morning method of interface message
evening method of interface message
gn method of the interface message
*/