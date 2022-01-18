/* flow control system application
there are there three type of flow control statements
1. conditional statement- if, if/else, switch
2. iteration statement- for, while, do-while
3. transfer statement- goto, break, continue, try, return
*/
// switch first application
import java.lang.System;
import java.lang.String;
class Switch
{
public static void main(String[] args)
{
int a=20;
switch (a)
{
 case 10: System.out.println("hisar");
break;
case 20: System.out.println("haryana");
break;
case 30: System.out.println("india");
break;
default: System.out.println("home/default");
break;
}
}
}