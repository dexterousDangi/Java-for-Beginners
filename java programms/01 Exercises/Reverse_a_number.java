// simple program to reverse a number

import java.util.Scanner;

class Reverse_a_number
{
int rev =0;
int rem=0;

public  void reverseOfNumber(int number)
{
while( number != 0 )
{
rem = number%10;

rev = rev*10+rem;

number = number/10;
}
System.out.println("reverse of the given no. is " + rev);
}

public static void main(String []args)
{

Scanner scan = new Scanner(System.in);
System.out.println("Enter a number , whose reverse will be printed");
int num = scan.nextInt();

Reverse_a_number rn = new Reverse_a_number();

rn.reverseOfNumber(num);
}
}