// Autoboxing and Autounboxing: with the help of these concepts
// we can directly convert the primitive data into wrapper class ojbect.
// concept added into java5.

// you just provide the primitive data with corresponding wrapper class object and it will
// automatically(means we are not doing it, jvm in back is using the valueOf()method) converted into wrapper class objects

class Boxing_unboxing
{
public static void main(String []args)

{
 
	// classical way to convert primitive data into wrapper class objects

Integer i1= new Integer(21);
Integer i2= Integer.valueOf(32);

	// creating wrapper objects from primitive data using Autoboxing

Integer i3= 124;  //autoboxing //coder point of view

	// Integer i3= Integer.valueOf(124);  this is done in jvm Point of view.

System.out.println(i1+i2+i3);

	// creating primitive data type from wrapper object using Autounboxing

int a = Integer.valueOf(64);
float ab= Integer.valueOf("64");
double b = Float.valueOf(86.36f);


System.out.println(a+ab);  // concat happen
System.out.println(ab+b);
System.out.println(b);

}
}

/*
output:

F:\java by dragon\java programms\Wrapper classes>javac Boxing_unboxing.java
Boxing_unboxing.java:16: warning: [removal] Integer(int) in Integer has been dep
recated and marked for removal
Integer i1= new Integer(21);
            ^
1 warning

F:\java by dragon\java programms\Wrapper classes>java Boxing_unboxing

177

128.0
150.36000061035156
86.36000061035156
*/