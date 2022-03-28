//hackerRank questions:
/*
Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.
*/



import java.util.*;

class Test

{
public static void main(String []args)
{

System.out.println("Enter a no.:");

Scanner in = new Scanner(System.in);
int N = in.nextInt();
if(N%2==1)
{
System.out.println("weird");
}
else
{
if(N>=2&&N<=5)
{
System.out.println("not weired");
} 
else if(N<=20)
{
System.out.println("weird");
}
else
{
System.out.println("not Weird");
}

}
}
}
/*
output:

F:\java by dragon\Java-for-Beginners\java programms\01 Exercises>java if_else.java

Enter a no.:
2
not weired
*/