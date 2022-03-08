// usage under normal import and static import statement


// using static import statement we can directly import only static constants and static methods only

package com.enumconst.staticimport;


import static  com.enumconst.fish.Fish.*;
import  static com.enumconst.fish.Loot.*;

class Static_import
{
public static void main(String []args)
{                                           
			// directly using static constants and methods
System.out.println(CAT);
System.out.println(STAR);
System.out.println(SHARK);

m2();
m2();
}
}

/*output:

F:\java by dragon\java programms\java basic applications>java com.enumconst.stat
icimport.Static_import
CAT
STAR
SHARK
static mehtod
static mehtod
*/