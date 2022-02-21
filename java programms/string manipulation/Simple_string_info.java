// about string manipulation
// difference between string and stringbuffer class
// object creation of string class is possible in 2 ways (directly using string class name,second is by using new keyword)
// object created directly stored in the scp (string constant pull) memory .
// object created using new keyword are stored in the heap memory.

// object creation of stringbufferclass in possible only using new keyword

// double operator(==): used to compare the two reference variables; return value is boolean type
// if both are pointing to same object it returns 'true' otherwise 'false'.
// scp = string constant pull memory


  
class Simple_string

{
public static void main(String []args)
{

String s1= "Dangi1";   //first approach   (these objects are stored in scp memory)
String s2= "Dangi21"; 
String s3= "Dangi1"; 


String s4 = new String ("Dangi2");  // second approach (these object are stored in heap memory)

                                      //there are two approach to create the object of string class
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);

System.out.println(s4);


StringBuffer sb1 = new StringBuffer ("Alpha Fan");  // only approach
                                     
                                       // there is only one approach to create the object of StringBuffer class
System.out.println(sb1);

//usage of double operator(==): to compare reference variables , always returns boolean values
// if both the reference variable  are pointing towards same object
// then value returned is true otherwise false is printed

System.out.println(s1==s2);
System.out.println(s2==s3);
System.out.println(s3==s1);
}
}
  /*output:

F:\java by dragon\java programms\string manipulation>javac Simple_string_info.ja
va

F:\java by dragon\java programms\string manipulation>java Simple_string
Dangi1
Dangi21
Dangi1
Dangi2
Alpha Fan
false
false
true
*/