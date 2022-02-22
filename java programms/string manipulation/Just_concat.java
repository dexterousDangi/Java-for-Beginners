// simple concat() usage for String class

class ConcatExample
{
public static void main(String[] args)
{
String str1 = "Use my";
String str2 = "Dangi";
String str3 = "Softwares";

// Concatenating Space among strings and strings also
 
String str4 = str1.concat(" ").concat(str2).concat(" ").concat(str3);

System.out.println(str4);

String str5 = new String("Use my");   // string class is immutable class
str5.concat("dude");
System.out.println(str5);


}
}
/*output:

F:\java by dragon\java programms\string manipulation>javac Just_concat.java

F:\java by dragon\java programms\string manipulation>java ConcatExample
Use my Dangi Softwares
use my
*/