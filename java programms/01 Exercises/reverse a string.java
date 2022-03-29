import java.util.Scanner;

class ReverseStringExample1  
{  
public static void main(String args[])  
{  
String s;  

Scanner sc=new Scanner(System.in);  

System.out.print("Enter a String: ");  

s=sc.nextLine();                    //reading string from user  

String s1=s.trim();  // will remove the extra space provided at end and at the start of the string.

System.out.println("After reverse string is: "+s1);  

for(int i=s1.length();i>0;--i)                //i is the length of the string  
{  
System.out.print(s1.charAt(i-1));            //printing the character at index i-1  
}  
}  
}  