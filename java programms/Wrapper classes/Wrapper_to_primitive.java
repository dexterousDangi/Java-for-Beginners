//xxxValue() method : to convert the wrapper objects into 
// primitive data type. where xxx is equal to all data type.

// to convert wrapper objects into string, we use toString() method(because this method return type is string)
// Interger class contains overriden toString() method. which return the object data into string format.



class Wrapper_to_primitive
{
public static void main(String []args)
{
// wrapper object to primitive data type

Integer x = Integer.valueOf(12);

int a = x.intValue();
double d = x.doubleValue();
float f = x.floatValue();
byte b = x.byteValue();

System.out.println(a);
System.out.println(d);
System.out.println(f);
System.out.println(b);
System.out.println(a+d+f+b);

	// converstion of wrapper objects into string

Integer x1 = Integer.valueOf(122);
Integer x2 = Integer.valueOf(124);
Integer x3 = Integer.valueOf(125);

String s1 = x1.toString();
String s2 = x2.toString();
String s3 = x3.toString();

System.out.println(s1+s2+s3);  // this will perform concatination because we are adding strings not numbers.

}
}

/*output:


F:\java by dragon\java programms\Wrapper classes>javac Wrapper_to_primitive.java


F:\java by dragon\java programms\Wrapper classes>java Wrapper_to_primitive
12
12.0
12.0
12
48.0
122124125

*/