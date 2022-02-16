// transfer statements, example of continue
class Continue
{
public static void main(String []args)
{ 
for ( int i=0; i<11; i++)
{
if (i==5)
{
continue;
}

System.out.println("dang"+i);
}
}
}
/* when ever continue is encountered:
skipping of coresponding execution
and again starting of execution inside the loop.
or used to skip the particular iteration
*/