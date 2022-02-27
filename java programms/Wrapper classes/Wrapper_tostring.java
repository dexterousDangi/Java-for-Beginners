// toString() method for all the wrapper class :
/* toString() method is present in the object class and is used to print the 
 hashcode of the  referenec variable, 
 But for all the wrapper classes(8 of them) this method is overriden 
 and always returns content of the corresponding object of the corresponding class
*/


class Wrappertostring 
{
public static void main(String [] args)
{

Wrappertostring wt = new Wrappertostring();

System.out.println(wt);
System.out.println(wt.toString());



Byte b = new Byte("3");
Character c= new Character('w');
Boolean b1= new Boolean("true");
Float f = new Float("34.5f");

Integer i = new Integer(98);
System.out.println(i);
System.out.println(i.toString());

System.out.println(b1);
System.out.println(b1.toString());

System.out.println(c.toString());
System.out.println(c);

System.out.println(b);
System.out.println(b.toString());

System.out.println(f);
System.out.println(f.toString());

}
}

/*output:

F:\java by dragon\java programms\Wrapper classes>java Wrappertostring
Wrappertostring@4617c264
Wrappertostring@4617c264
98
98
true
true
w
w
3
3
34.5
34.5
*/