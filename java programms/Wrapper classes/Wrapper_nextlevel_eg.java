// internally autoboxing and some inheritance:
// char and boolean wrapper classes as we know are direct child classes of object classes
// and remaining 6 primitive wrapper class are the child class of the Number class.
 // using this concept we are developing an application.

class Alpha
{
void mi(Number n)// here n is expecting object of 6 primitive type wrapper classes if not it will convert the primitive data into wrapper class object using autoboxing concept 
{
System.out.println(n);
}
public static void main(String []args)
{
Alpha a = new Alpha();

a.mi(Integer.valueOf(5664));
a.mi(Float.valueOf(31.64f));

		// as we now mi(Object_of_Number class) expecting wrapper class objects

a.mi(10);  // convert the primitive type into wrapper objects using autoboxing concept
a.mi(26.58);  // double

}
}

/*
output:

F:\java by dragon\java programms\Wrapper classes>javac Wrapper_nextlevel_eg.java

F:\java by dragon\java programms\Wrapper classes>java Alpha

5664
31.64
10
26.58

*/