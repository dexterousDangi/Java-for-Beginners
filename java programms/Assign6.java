/*example no.4 
duplicate methods are not allowed 
there can not be two m1 name methods.
two method must have differnt signature(method_name (parameterlist))
*/



class Work
{
void m1()
{
System.out.println(" Instance method : m1");
}

void m1(int a)
{
System.out.println(" Instance method : m1   "+a);
}
public static void main(String []args)
{
Work w =new Work();
w.m1();

}
}