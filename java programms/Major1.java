/* the name of .java file must be 
same with the public class name.
*/
public class Major1
{
 public static void main(String []args) //execution starts from main method.
{
System.out.println(" hi this is major class");
int a=0,b=1,c=3,d=5;
if (true)
{
System.out.println("  if loop only"+a);
}
 for (;a<10;a++)
{ 
if (a==7)
{
System.out.println("  if-else loop inside for loop"+a);
}
else
{
System.out.println("else loop inside a if else which is inside the for loop"+a);
}
while (a==9)
{
System.out.println("while loop only"+a);
break;
}
System.out.println("  for loop for how may times:"+a);
}
do
{
System.out.println("this is independent do while loop"+d);
d--;}
while(d>2);
System.out.println("value of d "+d);
if(d==2)

{
System.out.println("this is if experimental "+d);
while(c>d)
{
System.out.println("this is while inside if and value of c >d =" +c  +d);
break ;
}
}
} 
}