// Interface(file1.java) vs Abstract Class(file2.java) vs Normal Class(Testclient1.java)
 
//general class vs abstract class vs interface topic 

package com.dop.client1;
import com.dop.helper.Helper;

public class TestClient2 extends Helper

{ 
        // only 2 methods implementations here      
        // 1 method implementation from Helperclass

public void morning()
{
System.out.println(" morning method in testclient2 class");
}
public void evening()
{
System.out.println(" evening method in testclient2 class");
}
public static void main(String []args)
{
TestClient2 t2= new TestClient2();
t2.morning();
t2.evening();
t2.gn();
}
}

/*output:

F:\java by dragon\java programms>java com.dop.client.TestClient2
 morning method in testclient2 class
 evening method in testclient2 class
helper class good night
*/