//you  cannot re-assign a value to final variable.
// final variable means we can't modify that vaule.

class  Test 
{
public static void main(String []args)
{
final int a=45;
a = a+64;
System.out.println(a);
}
}
/* output:

F:\java by dragon\java programms>javac Testme.java
Testme.java:7: error: cannot assign a value to final variable a
a = a+64;
^
1 error
*/