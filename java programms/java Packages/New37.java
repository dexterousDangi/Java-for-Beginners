// Example 2: using two packages(one package is using the another package's 
// module class.)  
// one package contains information another is requiring that information.

//Dang contains information, Ibm requiring information



 package com.dop.states.requiredinfo;
 import com.dop.states.info.Dang;  
                                  // import the info containing package with class
class Ibm
{
public static void main(String[] agr) 
{
System.out.println("ibm module requiring info of states");


// create the object of Dang(Dang.java) form where we are
// getting our information

Dang d = new Dang();
d.hr();   // using other package class/method(you must import the required package) 
d.hp();
d.others();
}
}

/*  dependent file is Dang.java


output:

F:\java by dragon\java programms>javac Dang.java

F:\java by dragon\java programms>javac New37.java

F:\java by dragon\java programms>javac -d . Dang.java

F:\java by dragon\java programms>javac -d . New37.java

F:\java by dragon\java programms>java com.dop.states.info.Dang
class contains required info

F:\java by dragon\java programms>java com.dop.states.requriedinfo.Ibm
ibm module requiring info of states
jai haryana
jai himachal
jai other states
*/