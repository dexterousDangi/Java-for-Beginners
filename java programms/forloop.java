/* flow control statements
for loop- mostly used loop in java
used when you now the no of iteration in advance
*/
class Controlloop
{ 
public static void main(String []args)
{
final int b=2; int a=1;
for(;a<10;a++)
{
if( a==2) 
{
System.out.println("this is 'if loop' inside a for loop");// this loop only runs once
}
else
{
System.out.println("this is else inside a for loop"); // runs for 8 times
}
System.out.println("this is for loop"); // this is for loops body - run 9 times 
}
while(a>b) // here at runtime the value of a taken by jvm is 10
{
System.out.println("this is while loop"); // run 8 times
a--;
}
do
{
 System.out.println("this is 'do while' loop"); // this loop only runs once

}
while(a<b); // here the value of a after operations became 1)
{System.out.println("this is 'while loop statement in a do while' loop");// this loop only runs once
a++;
}
}
}
