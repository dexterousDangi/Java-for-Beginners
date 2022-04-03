//another type of star triangle pattern

class Another_triangle_pattern
{
public static void main(String []args)
{
System.out.println("Triangle patterns");
int temp=1;

for(int i= 1; i<=9; i++)
{
for(int j=9; j>=i; j--)
{
System.out.print(" ");
}
for(int k=1; k<=temp; k++)
{
System.out.print("*");
}
temp=temp+2;
System.out.println();
}

int dec =1;

for(int i=1; i<=8; i++)
{
System.out.print(" ");

for(int j=1; j<=i; j++)
{
System.out.print(" ");
}
for(int k=15; k>=dec;k--)
{
System.out.print("*");
}
dec=dec+2;
System.out.println();
}

}
}

/*
output:
F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Another_triangle_pattern.java
F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Another_triangle_pattern

Triangle patterns
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *
*/


 