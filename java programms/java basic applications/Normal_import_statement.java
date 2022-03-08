// usage of static and normal import statement usage inside the Enumeration concept

package com.enumconst.normalimport;

import  com.enumconst.fish.Fish;
import  com.enumconst.fish.Loot;

class Normal_import
{
public static void main(String []args)
{
System.out.println(Fish.CAT);
System.out.println(Fish.STAR);
System.out.println(Fish.SHARK);

new Loot().m1();
Loot.m2();
Loot.m2();
}
}

/*



F:\java by dragon\java programms\java basic applications>java com.enumconst.norm
alimport.Normal_import
CAT
STAR
SHARK
normal method
static mehtod
static mehtod
*/