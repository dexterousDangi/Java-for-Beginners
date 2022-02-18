import java.util.Scanner;
class Multiple_catch 
{
public static void main (String []args)
{

System.out.println("Enter a no. which will divide 1056");
Scanner s= new Scanner(System.in);
int q=s.nextInt();


try{


System.out.println(("result only provide quosent...") +1056/q);              // exceptional code
//System.out.println("hi durga".charAt(43));  // exceptional code
}
catch(ArithmeticException aw)  // correct exception with its reference variable
{
System.out.println("You have entered incorrect no.");
}

}
}