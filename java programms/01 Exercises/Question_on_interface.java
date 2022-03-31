// question about interface

interface Fruit
{
  public String TYPE ="Appendable";

}


class Fruit1 implements Fruit



{
}


class Main

{

public static void main(String []args)

{
  
  
System.out.println(Fruit1.TYPE);

}

}
/*output must be Appendable because every data type declare inside a 
interface is by default is "static"and "final".
and for using static variables we can access them by using class name only
and yes we can also acces them by using objects as well but thats not a 
recommended approach"
*/
