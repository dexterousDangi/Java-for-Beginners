// using 2d array to print the pattern

class Pattern_using_2d_array
{
public static void main(String []args)
{
int [][]a = new int[10][10];
System.out.println("row in the array  "+a.length);
System.out.println("coloumns in array   "+a[0].length);
System.out.println();

for(int i=0; i<a.length; i++)
{ 
for(int j=0; j<a[0].length; j++)
{
System.out.print(a[i][j]);
}
System.out.println();
}
}
}
/* output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>javac Pattern_u
sing_2d_array.java

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java Pattern_us
ing_2d_array
row in the array  10
coloumns in array   10

0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000
0000000000

*/