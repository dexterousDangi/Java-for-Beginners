// equals() method: used to compare two strings data, return type is boolean, case sensitive method
// only string class equals() method perform content comparison, otherwise object class or stringbufferclass or normal class
//  equals() method perform reference variable comparison.

// equalsIgnoreCase() method: used to compare two strings data, return type is boolean, but not case sensitive (will ignore lower and upper case)

// compareTo() method: used to compare two strings data, return type is integer, when two strings are equal it will return 0.
// otherwise it will return +ve or -ve value. depending upon the first strings first character's unicode value. it is a case sensitive method.

// compareToIgnoreCase() method:  used to compare two strings data, return type is integer, when two strings are equal it will return 0.
// otherwise it will return +ve or -ve value. depending upon the first strings first character's unicode value. it is not a case sensitive
// method and will ignore the lower and upper case while comparing two strings


class Comparison_of_strings 

{
public static void main(String []args)
{ 	    
		// using String class equals() method

String s1= "pardeep";
String s2="dangi";
String s3="pardeep";

System.out.println(s1.equals(s2)); //false
System.out.println(s3.equals(s2));  //false
System.out.println(s1.equals(s3)); // true

System.out.println("Pardeep".equals(s1)); //false

  		// using equalsIgnoreCase() method

String s4="ParDeeP";

System.out.println(s1.equalsIgnoreCase(s4));  //true
System.out.println("DanGi".equalsIgnoreCase(s2)); //true
System.out.println("DanGI".equalsIgnoreCase("dangi"));//true



		// using compareTo()mehtod

System.out.println(s1.compareTo(s2));  //12(+ve) first string is bigger
System.out.println(s3.compareTo(s2));  //12(+ve) first string is bigger
System.out.println(s1.compareTo(s3));  //0(equal string)

  		// using compareToIgnoreCase()method

System.out.println(s1.compareToIgnoreCase("PaRdeeP")); //0 (equal string)
System.out.println(s2.compareToIgnoreCase(s1)); //  -12 (-ve) first string is small 
}
}

/*output:


F:\java by dragon\java programms\string manipulation>javac Comparison_of_Strings
_usingdiffmethods.java

F:\java by dragon\java programms\string manipulation>java Comparison_of_strings
false
false
true
false
true
true
true
12
12
0
0
-12

*/