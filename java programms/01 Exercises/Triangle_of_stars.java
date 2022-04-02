// triangle pattern of stars

class Triangle_of_stars
{
public static void main(String []args)
{
System.out.println("simple triangle star pattern");
int count =0;

for (int i= 1; i<=7; i++)
{ 
for (int j=7; j>=i; j--)
{
System.out.print(" ");
}
for(int k = 1; k<=i; k++)
{
System.out.print(" *");
}
System.out.println();
}


for(int i=1; i<=7;i++)
{
System.out.print(" ");
for(int j=1; j<=i;j++)
{
System.out.print(" ");
}
for(int k=6; k>=i;k--)
{
System.out.print(" *"); 
}
System.out.println();
}

}
}

/*output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>JAVAC Triangle_of_stars.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Triangle_of_stars

simple triangle star pattern
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