// Example 2: uncheck exception (array out of bound)

class Unchecked
{
public static void main(String []args)
{
int a []={34,3,7,6,8};


System.out.println(a[0]);
System.out.println(a[1]);

System.out.println(a[10]);  // this array is out of bound
                               // compiler will unable to check the exception

/*similarly there is string index out of bound exception

String str ="dangi";

System.out.println(str[0]);
System.out.println(str[1]);

System.out.println(str[100]);  // compiler unable to found any exception here
                              // its a unchecked type of exception
*/

}
}

/*output:

F:\java by dragon\java programms\java exception handling>javac Uncheck2.java

F:\java by dragon\java programms\java exception handling>java Unchecked
34
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 ou
t of bounds for length 5
        at Unchecked.main(Uncheck2.java:13)
*/