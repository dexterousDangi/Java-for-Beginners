// star patterns using for loops 

import java.util.Scanner;
class Star_patterns
{
public static void main(String []args) throws  InterruptedException
{Scanner scan = new Scanner(System.in);
System.out.println("enter the no of rows you want");

int n =scan.nextInt();

for (int i=1; i<=n; i++)
{
for (int j=1; j<=i;j++)
{
Thread t1=Thread.currentThread();
t1.sleep(100);
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
t1.sleep(100);
System.out.print(" *");
}
System.out.println();
}



System.out.println();

for (int i=1; i<=n; i++)
{
for (int j=1; j<=i;j++)
{
System.out.print(" *");
}
System.out.println( );
}
for (int i =1; i<=n; i++)
{
for (int j=n-1 ; j>=i; j--)
{
System.out.print(" *");
}
System.out.println();
}


}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Star_patterns.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Star_patterns

enter the no of rows you want
7
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
reverse of above string
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 * * * * * * *
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 *

*/