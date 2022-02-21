// string manipulation
// case 1: string class and stringbuffer class both are final class, present in java.lang package.
// case 2: for string class there are two method to create the object (directly using class name or using new keyword)
// for stringbuffer there is only one approach to create the object which is by using new keyword.

// case 3: to add the two data of string class use "concate()" method
// to add the data in stringbuffer class use "append()" method.
// both class are different, both methods are different , but their functionality is same

// immutable behaviour of string class 
// mutable behaviour of stringbuffer class

class Adding_string
{
public static void main(String []rgs)
{ // immutable nature
String s1="Dangi";
s1.concat("Softwares");
System.out.println(s1);  //will only print "Dangi" (data is modified)
     
            //once we create the object of string class object stored in scp memory is fixed it can't be modified
             // this behaviour of string class is called immutable nature

// stringbuffer class is mutable nature : modifications are allowed 

StringBuffer sb= new StringBuffer("dangi");
sb.append("softwares");
System.out.println(sb);  // will print "dangisoftwares"  

}
}
/*output:
F:\java by dragon\java programms\string manipulation>javac AdditionOfStrings.java

F:\java by dragon\java programms\string manipulation>java Adding_string
Dangi
dangisoftwares
*/




