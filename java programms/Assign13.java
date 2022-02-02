/*return statement usage application
statement must be used at the end of the method
return value must be same as the return type of the method
it is a well practice to store the return value and print it
to check the status of the method's working condition
Whenever we try to print the return value it will print the "hash value".

*/

class Return
{
void m4(int a, int b)
{
System.out.println("this is void method.No return type required   "+ a*b);
// no return statement required
}
// method return type can be primitive(class type, array, sting) 
 
int m3( String str, char ch)
{
System.out.println("return value is intiger type  "+ str+ch);
return 7;  // return statement required
}
 int m5()
{
System.out.println("no value passed in the method");
return 4;   // return value required
}
 int mn()
{
return 54;  // we print this return value and check out for the hash value
}
public static void main(String []args)
{
Return r = new Return();
int sd=r.m3("Dragon",'P');

System.out.println("return value of method m3...   " +sd);
int gh= r.m5();
System.out.println("return value of method m5....  "+gh);
r.mn();
r.m4(07,98);
}
}