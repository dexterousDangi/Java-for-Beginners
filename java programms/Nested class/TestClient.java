// fileno. 3
// about anonymous classes

// example without anonymous classes

package com.withoutanonymous.clientapplication;

import com.withoutanonymous.userdefinedLogics.Test1;

class TestClient    // package 3
{
public static void  main(String [] args)
{
Test1 y = new Test1();
y.m1();
y.m2();
}
}

/* output:


F:\java by dragon\java programms\Nested class>javac -d . Predefined_classes_withoutAnonymous.java

F:\java by dragon\java programms\Nested class>javac -d . Test1.java

F:\java by dragon\java programms\Nested class>javac -d . TestClient.java

F:\java by dragon\java programms\Nested class>java com.withoutanonymous.clientapplication.TestClient

m1 method user defined logics

m2 method user defined logics

*/