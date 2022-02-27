 //parsexxx() method : to convert the string object data into the 
// primitive type data .

class Parsexxx_method
{
public static void main(String []args)

{
String s1="100";
String s2="211";
System.out.println(s1+s2); // concatenation wiil be performed


 	// now we want to change this wrapper class string object into int or double
	// use parsexxx() method where xxx represent the primitive data type

int in=Integer.parseInt(s1);
			//parseInt(s1) will return int type 


Double dl=Double.parseDouble(s2);
				//parseDouble(s2) will return double type data

System.out.println(in+dl);

}
}

/*output:

F:\java by dragon\java programms\Wrapper classes>javac "wrapper_parsexxx().java"


F:\java by dragon\java programms\Wrapper classes>java Parsexxx_method
100211
311.0
*/