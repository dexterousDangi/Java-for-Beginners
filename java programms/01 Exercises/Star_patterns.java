// star patterns using for loops 

class Star_patterns
{
public static void main(String []args) throws  InterruptedException
{
int n =4;
for (int i=1; i<=n; i++)
{
for (int j=1; j<=i;j++)
{
Thread t1=Thread.currentThread();
t1.sleep(1000);
System.out.print(" *");
}
System.out.println( );
}

System.out.println("reverse of above string");

for (int i =1; i<=n; i++)
{
for (int j=n ; j>=i; j--)
{
Thread t1=Thread.currentThread();
t1.sleep(1000);
System.out.print(" *");
}
System.out.println();
}

}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Star_patterns.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Star_patterns

 *
 * *
 * * *
 * * * *

reverse of above string

 * * * *
 * * *
 * *
 *

*/