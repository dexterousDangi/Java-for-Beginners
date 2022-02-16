// Example 2: using two packages(one package is using the another package's 
// module class.)  
// one package contains information another is requiring that information.



package com.dop.states.info;

public class Dang
{
public void hr()
{
System.out.println("jai haryana");
}
public void hp()
{
System.out.println("jai himachal");
}
public void others()
{
System.out.println("jai other states");
}
public static void main(String []args)
{
System.out.println("class contains required info");
}
}




// these method are required in anther package so 
// must declare these methods as public
// file requiring these info is New37.java