// Exanoke related to package (containing three different modules)
//module 3  (import 1,2 module in the module 3)


package gong.tuff.orders;
import gong.tuff.stuff.Stuff;         // module contains required info, so import the package
import gong.tuff.redstuff.Redstuff;   // module contains required info, just import the package

public class Order
{
public static void main(String []args)
{ 
System.out.println("order is placed");
System.out.println("order description");

Stuff s= new Stuff();
s.natural(100);
Redstuff r = new Redstuff();
r.man_made(56);

}
}


/*output:

F:\java by dragon\java programms\java Packages>javac -d . Stuff.java

F:\java by dragon\java programms\java Packages>javac -d . Redstuff.java

F:\java by dragon\java programms\java Packages>javac -d . Order.java

F:\java by dragon\java programms\java Packages>javac Order.java

F:\java by dragon\java programms\java Packages>javac Stuff.java

F:\java by dragon\java programms\java Packages>javac Redstuff.java

F:\java by dragon\java programms\java Packages>java gong.tuff.orders.Order
order is placed
order description
Want natural and in quantity need  is .....100g
Red is main made
wants man made and quantity need is.... 56g
*/