class Hum
{
int alpha( int a )
{
switch( a)
{
case 10: System.out.println("here a is less then 10.."+a);
break;
case 56: System.out.println("here value of a is more than 10..."+a);
break;
default: System.out.println(" enter some numeric value for a");
}

return 3;
}
public static void main(String []args)
{
Hum h= new Hum();
int v=h.alpha(10);
System.out.println("function is working properly   "+ v);
}
}