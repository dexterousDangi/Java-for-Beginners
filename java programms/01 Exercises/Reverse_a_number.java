// simple program to reverse a number

import java.util.Scanner;

class Reverse_a_number
{

public static void reverseOfNumber(int number)
{

int rev,rem=0;

while( number != 0 )
{
rem = number%10;

rev = rev*0+rem;

number = number/10;
}
System.out.println("reverse of the given no. is " + rev);
}

public static void main(String []args)
{

Scanner scan = new Scanner(System.in);
System.out.println("Enter a number , whose reverse will be printed");
int num = scan.nextInt();
reverseOfNumber(num);
}
}