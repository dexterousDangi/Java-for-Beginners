// star patterns:

import java.util.Scanner;

class Patterns_print1
{
public static void main(String [] args)
{


for(int i= 1; i<=5; i++)
{

for(int j=4; j>=i; j--)
{
System.out.print(" ");
}
for(int k= 1; k<=i; k++)
{
System.out.print("*");
}
System.out.println();
}

for(int i=1; i<=4; i++)
{
for (int j=1 ; j<=i; j++)
{
System.out.print(" ");
}
for(int k=4; k>=i ; k--)
{
System.out.print("*");
}
System.out.println();
}


}
}

/*output:


F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Patterns_
print1.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Patterns_p
rint1
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/